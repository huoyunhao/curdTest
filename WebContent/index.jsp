<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>文章列表</title>
    <style type="text/css">
            table {
                border: 1px solid black;
                margin: 0 auto;
            }
            
            td{
                width: 15px;
                border: 1px solid black;
                text-align: center;
            }
            
            #content {
                width: 500px;
                height:300px;
            }
            #content1 {
                width: 100px;
                
            }
    </style>
</head>
<body>
    <table  border="1">
        <tr>
            <td>编号</td>
            <td>标题</td>
            <td>内容</td>
            <td>出版</td>
            <td>作者</td>
            <td colspan="4">操作</td>
        </tr>
        <c:forEach items="${list}" var="item" >
            <tr>
                <td>${item.id }</td>
                <td>${item.title }</td>
                <td id="content" >${item.content }</td>
                 <td>${item.publish }</td>
               	  <td>${item.creater }</td>
                <td colspan="4"><a href="UpdateServlet?id=${item.id }">查看|</a><a href="DeleteServlet?id=${item.id }">删除</a>|<a href="UpdateServlet?id=${item.id }">修改</a>
                
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="2" style="text-align: left;"><a href="add.jsp">添加文章</a></td>
        </tr>
    </table>
     
</body>
</html>