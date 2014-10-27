<%-- 
    Document   : login
    Created on : 13/10/2014, 12:24:37 AM
    Author     : mangekyou
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!-- directiva -->
<!DOCTYPE html>
<%@ page session="true"%><!-- directiva -->
<html lang="es">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Iniciar sesion - Inventario</title>
<link rel="stylesheet" href="public/css/bootstrap.min.css" />
<link rel="stylesheet" href="public/css/style.css" />

<link rel="shortcut icon" href="public/img/java_logo.png" />
<link rel="apple-touch-icon" href="public/img/java_logo.png" />

</head>
<body>
	<div id="container">
		<!-- <div id="header">

			<div id="header-title">Iniciar sesion - Inventario</div>
		</div> -->



		<div class="main-content">

			<h1>Iniciar sesion - Inventario</h1>


			<p>ingresa la información solicitada</p>

			<%
				/*
				revisamos si hemos sido redireccionados por que se presento un error
				 */
				if (request.getParameter("error") != null) {

					/*
					tenemos dos opcionespor las cuales fuimos redireccionados:
						1. intentamos accesder a sesion-inicio.jsp sin haber ingresado
						de forma correcta, por lo que mostramos el mensaje correspondiente
					 */

					if (request.getParameter("login") != null) {
			%>
			<div class="alert alert-error">
				<strong>Error!</strong> No has iniciado sesión<br> Por favor,
				ingresa correctamente.
			</div>
			<%
				}
					/*
					 2. Hemos ingresado de manera incorrecta el ususario y/o contraseña, por 
					 lo que mostramos el mensaje correspondiente
					 */
					else {
			%>
			<div class="alert alert-error">
				<strong>Error!</strong> Usuario y/o contraseña incorrectos
			</div>
			<%
				}
				}
			%>


			 <form action="sesion-verifica.jsp" method="post"> 
				<legend>Inicio de Sesión</legend>
				<span class="muted">Proporciona los siguientes datos</span>
				<table class="my-table">
					<tr>
						<td class="text-right">Usuario:</td>
						<td><input type="text" name="user" size="30"
							maxlength="100"></td>
					</tr>
					<tr>
						<td class="text-right">Contraseña</td>
						<td><input type="password" name="password" size="50"
							maxlength="150"></td>
					</tr>

					<tr>
						<td></td>
						<td><input type="submit" value="Ingresar" class="btn"></td>
					</tr>
				</table>
			</form>




		</div>
	</div>


</body>
</html>



