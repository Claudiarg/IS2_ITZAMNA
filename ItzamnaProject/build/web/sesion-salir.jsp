<%@ page session="true" %>
<%
/*Destruimos la sesion del usuario*/
request.getSession().invalidate();

/*Redireccionamos al inicio*/
response.sendRedirect("login.jsp");
%>