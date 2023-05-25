
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
    <h1>登录成功的页面！</h1>
    <%
        Integer count=0;
        //判断 如果ServletContext 中有值，获取并显示
         if(request.getSession().getServletContext().getAttribute("count")!=null){
           count=(Integer) request.getSession().getServletContext().getAttribute("count");
        }

    %>
    <h3>登录成功的总人数:<%= count%></h3>
    </body>
</html>
