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
            
            
            <div class="main-content">
			<%
				/*Revisamos si el usuario ha iniciado sesion*/

				if (request.getSession().getAttribute("isLogin") == null) {
					/*
					el usuario NO ha iniciado sesion,por lo que es redireccionado a la página de inicio
					enviando valores en los parámetros correspondientes para realizar acciones de control
					*/
					response.sendRedirect("sesion.jsp?error=true&login=false");
				} 
				
				/*
				el usuario ha iniciado sesion, por lo que mostramos el contenido correspondiente
				*/
				else {
			%>

			<h1>Inicio de Sesión</h1>
			<p>
				Este es un ejemplo de una sesión iniciada a traves del <em>sesion.jsp</em>
				y <em>sesion-inicio.jsp</em>
			</p>


			<h2>
				Bienvenido:
				<%=(String) request.getSession().getAttribute("usuario")%>
			</h2>

			<div class="alert alert-success">
				<button type="button" class="close" data-dismiss="alert">&times;</button>
				<strong><%=(String) request.getSession().getAttribute("usuario")%></strong>
				has iniciado sesión correctamente
			</div>


			<p>Para salir, seleccione el siguiente boton</p>
			<a href="sesion-salir.jsp" class="btn ntn-link">Cerrar sesion</a>
			<%
				}
			%>

		</div>
    </body>
</html>
