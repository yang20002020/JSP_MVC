<%--
  Created by IntelliJ IDEA.
  User: 26286
  Date: 2023/5/28
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <h1>demo2.jsp中获取四个范围的数据</h1>
 <%= pageContext.getAttribute("name")%>
 <%= request.getAttribute("name")%>
 <%= session.getAttribute("name")%>
 <%= application.getAttribute("name")%>
</body>
</html>
