<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>添加文章</title>
    
    
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
  <form action="AddServlet" method="post">
    <table border="1" class="t1">
        <tr>
            <td colspan="2"><h1>添加文章</h1></td>
        </tr>
          <tr>
            <td>文章编号:</td>
            <td><input  type="text" name="id"/></td>
        </tr>
        <tr>
            <td>文章标题:</td>
            <td><input   type="text" name="title"/></td>
        </tr>
        <tr>
            <td>文章内容:</td>
            <td ><input  id="content" type="text" name="content"/></td>
        </tr>
        <tr>
            <td>出版老师:</td>
            <td><input  type="text" name="publish"/></td>
        </tr>
         <tr>
            <td>出版作者:</td>
            <td><input  type="text" name="creater"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input  type="submit" value="提交"/>
                <input  type="reset" value="清空"/>
            </td>
        </tr>
    </table>
   </form>
  </body>
</html>