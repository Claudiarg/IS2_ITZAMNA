<%-- 
    Document   : cerrarSesion
    Created on : 13/11/2014, 01:23:42 AM
    Author     : clau
--%>

<%@ page session="true" %>
<%
/*Destruimos la sesion del usuario*/
request.getSession().invalidate();

/*Redireccionamos al inicio*/
response.sendRedirect("InicioSesion.jsp");
%>
