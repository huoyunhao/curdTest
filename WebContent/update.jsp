<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>修改</title>
    
     <style type="text/css">
            table {
                border: 1px solid black;
                margin: 0 auto;
            }
            	
            #content {
                width: 500px;
                height:300px;
            }
    </style>
  </head>
  
  <body>
    <form action="UpdateServlet" method="post">
    <table border="1" class="t1">
        <tr>
            <td colspan="2"><h1>文章信息</h1></td>
        </tr>
        <tr>
            <td>编号:</td>
            <td><input  type="text" name="id" value="${news.id}" readonly="readonly"/></td>
        </tr>
        
        <tr>
            <td>文章标题:</td>
            <td><input  type="text" name="title" value="${news.title}"/></td>
        </tr>
        <tr>
            <td>文章内容:</td>
            <td><input id="content" type="text" name="content" value="${news.content}"/></td>
        </tr>
        <tr>
            <td>出版社:</td>
            <td><input  type="text" name="publish" value="${news.publish}"/></td>
        </tr>
        <tr>
            <td>作者:</td>
            <td><input  type="text" name="creater" value="${news.creater}"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input  type="submit" value="提交"/>
                <input  type="button" value="返回" onclick="history.go(-1)"/>
            </td>
        </tr>
    </table>
   </form>
  </body>
</html>