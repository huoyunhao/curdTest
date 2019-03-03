package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.News;
import com.utils.DbHelper;


public class NewsDao {
    public List<News> getAllNews(){  
        List<News> list = new ArrayList<News>(); 
        Connection conn = DbHelper.getConnection();
        String sql  = "select * from t_news";  
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                News news = new News();
                news.setId(rst.getInt("id"));  
                news.setTitle(rst.getString("title"));
                news.setContent(rst.getString("content"));
                news.setPublish(rst.getString("publish"));
                news.setCreater(rst.getString("creater"));
                list.add(news);
            }
            rst.close();  //关闭
            pst.close();  //关闭
        } catch (SQLException e) {
            e.printStackTrace();  //抛出异常
        }
        return list;  
    }
    
    public boolean addNews(News News){  //添加信息
        String sql = "INSERT INTO `t_news`(`id`,`title`,`content`,`publish`,`creater`) VALUES (?,?,?,?,?)";  //添加的SQL语句
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, News.getId());
            pst.setString(2, News.getTitle());
            pst.setString(3, News.getContent());
            pst.setString(4, News.getPublish());
            pst.setString(5, News.getCreater());
            int count = pst.executeUpdate();
            pst.close();
            return count>0?true:false;  //是否添加的判断
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean updateNews(News news){  //修改
        String sql = "UPDATE `t_news` SET `title`=?,`content`=?,`publish`=?,`creater`=? WHERE `id` = ?";  //修改的SQL语句，根据ID修改
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, news.getTitle());
            pst.setString(2, news.getContent());
            pst.setString(3, news.getPublish());
            pst.setString(4, news.getCreater());
            pst.setInt(5, news.getId());  //根据的ID
            int count = pst.executeUpdate();
            pst.close();  //关闭
            return count>0?true:false;  //是否修改的判断
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteNews(int id){  //删除
        String sql = "delete from t_news where id = ?";  //删除的SQL语句，根据ID删除
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            int count = pst.executeUpdate();
            pst.close();
            return count>0?true:false;  //是否删除的判断
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public News selectNewsById(int id){  //根据ID进行查询
        Connection conn = DbHelper.getConnection();
        String sql  = "select * from t_news where id = "+id;
        News news = null;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
            	news= new News();
                news.setId(rst.getInt("id"));
                news.setTitle(rst.getString("title"));
                news.setContent(rst.getString("content"));
                news.setPublish(rst.getString("publish"));
                news.setCreater(rst.getString("creater"));
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return news;  //返回
    }
}