<%@page import="Model.Usuario"%>
<%@ page session="true"%>
<%
/*Definimos el nombre de usuario y la contrase�a v�lida para el sistema*/
	String userName = "admin";
	String userPass = "admin";
	
/*Obtenemos parametros de sesion.jsp*/	
	String usuario = request.getParameter("user").trim();
	String password = request.getParameter("password").trim();
	
       // Usuario temp = new Usuario().findByCorreo(usuario);
        
        /*
Yuri Ram�rez  yuri@biblional.bibliog.unam.mx admin

Claudia Ram�rez clau@biblioteca.unam.mx secretaria

Elizabeth Hermosillo  elizabeth@biblioteca.unam.mx tecnico

Juan Ram�rez  juan@biblioteca.unam.mx  personal
1
       */
	/*verificamos que usuario y contrase�a en los parametros sean v�lidos*/
	if (usuario.equals(userName) && password.equals(userPass)) {
		
		/*en caso de ser correctos, iniciamos sesi�n y asignamos atributos*/
		HttpSession sesion = request.getSession();
		sesion.setAttribute("usuario", usuario);
		sesion.setAttribute("isLogin","true"); 
                //sesion.setAttribute("tipo" ,"");
		
		/*redireccionamos a la p�gina inicial de la sesi�n*/
		response.sendRedirect("index.jsp");
	} else
		
		/*usuario y/o contrasena invalidos: redireccionamos a la p�gina de acceso
		y habilitamos el mensaje correspondiente mediante el parametro error*/
		response.sendRedirect("login.jsp?error=true");
%>