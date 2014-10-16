<%@page import="Model.Usuario"%>
<%@ page session="true"%>
<%
/*Definimos el nombre de usuario y la contraseña válida para el sistema*/
	String userName = "admin";
	String userPass = "admin";
	
/*Obtenemos parametros de sesion.jsp*/	
	String usuario = request.getParameter("user").trim();
	String password = request.getParameter("password").trim();
	
        //Usuario temp = Usuario.findByCorreo(usuario);
	/*verificamos que usuario y contraseña en los parametros sean válidos*/
	if (usuario.equals(userName) && password.equals(userPass)) {
		
		/*en caso de ser correctos, iniciamos sesión y asignamos atributos*/
		HttpSession sesion = request.getSession();
		sesion.setAttribute("usuario", usuario);
		sesion.setAttribute("isLogin","true"); 
		
		/*redireccionamos a la página inicial de la sesión*/
		response.sendRedirect("index.jsp");
	} else
		
		/*usuario y/o contrasena invalidos: redireccionamos a la página de acceso
		y habilitamos el mensaje correspondiente mediante el parametro error*/
		response.sendRedirect("login.jsp?error=true");
%>