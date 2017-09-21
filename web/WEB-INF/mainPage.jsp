<%-- 
    Document   : mainPage
    Created on : Sep 21, 2017, 8:48:15 AM
    Author     : NoahFerrier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
    </head>
    <body>
        <h1>Main Page</h1>
        Hello, ${username}. <a href="${pageContext.request.contextPath}/MainPage">Logout</a>
    </body>
</html>
