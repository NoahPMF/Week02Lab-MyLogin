<%-- 
    Document   : login
    Created on : Sep 21, 2017, 8:46:59 AM
    Author     : NoahFerrier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="Login" method="post">
            Username: <input type="text" name="usrname" value="${username}"><br>
            Password: <input type="text" name="psswd" value="${password}"><br>
            <input type="submit" value="Login"><br>
        </form>
        ${message}
    </body>
</html>
