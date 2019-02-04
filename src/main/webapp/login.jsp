<%--
  Created by IntelliJ IDEA.
  User: shijinglu
  Date: 2019/2/4
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="login" method="post">
    <fieldset>
        <legend>登录</legend>
        用户名:<input name="uname"/>
        <%
            String msg =(String)request.getAttribute("login_failed");
        %>
                <%=msg == null ? "" : msg%>
        <br/>
        密码:<input type="password" name="pwd"/><br/>
        <input type="submit" value="确定"/>
    </fieldset>
</form>
</body>

</body>
</html>
