package com.serlvet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.NewsDao;
import com.model.News;


/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {  //查询到选中ID的值所对应的数据
	String idStr = req.getParameter("id");
	if(idStr != null && !idStr.equals("")){
	    int id = Integer.valueOf(idStr);
	    NewsDao dao = new NewsDao();
	    News news = dao.selectNewsById(id);
	    req.setAttribute("news", news);
	}
	req.getRequestDispatcher("update.jsp").forward(req, resp);
	
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	    throws ServletException, IOException {  //根据此ID对数据的值进行修改
		String titile = req.getParameter("titile");
		String publish = req.getParameter("publish");
		String content=req.getParameter("content");
		String creater=req.getParameter("creater");
		News news = new News();
		news.setTitle(titile);  
		news.setPublish(publish);
		news.setContent(content);
		news.setCreater(creater);
		NewsDao dao = new NewsDao();
		dao.updateNews(news);
	req.getRequestDispatcher("ShowServlet").forward(req, resp);
	}

}
