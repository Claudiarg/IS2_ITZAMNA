<%-- 
    Document   : login
    Created on : 13/10/2014, 12:24:37 AM
    Author     : mangekyou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <form action="<%=request.getContextPath()%>/auth.jsp"  method="POST">
            <input type="text" name="user" value="usuario"/>
            <input type="password" name="password" value="contraseña"/>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
