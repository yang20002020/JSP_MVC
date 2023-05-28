<%--
  Created by IntelliJ IDEA.
  User: 26286
  Date: 2023/5/28
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> JSP的四个作用范围</h1>
<%
    //page范围(pageContext)
    pageContext.setAttribute("name","pageContext作用范围");
    //request范围
    request.setAttribute("name","request作用范围");
    //session范围
    session.setAttribute("name","session作用范围");
    //application
    application.setAttribute("name","application作用范围");
%>
<a href="/jspDemo7/test/demo2.jsp"> 跳转</a>
</body>
</html>

