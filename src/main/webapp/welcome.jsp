<%--
  Created by IntelliJ IDEA.
  User: shijinglu
  Date: 2019/2/4
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%
    Object obj = session.getAttribute("user");
    if(obj == null){
        response.sendRedirect("login.jsp");
        return;
    }
%>
<%@ page pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<html>
<head>

</head>
<body style="font-size:30px;">
<h1 align="center" style="color:red;">恭喜你，登录成功!</h1>
<%
    System.out.println("登录成功...");
%>
</body>
</html>
