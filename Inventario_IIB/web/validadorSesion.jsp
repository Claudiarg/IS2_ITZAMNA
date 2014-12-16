<%-- 
    Document   : validadorSesion
    Created on : 9/11/2014, 09:46:41 PM
    Author     : clau
--%>

<%@page import="Controlador.Usuario" %>
<%@page session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
    </head>
    <body>

<%    
        String email = request.getParameter("correo").trim();
	String contrasenia = request.getParameter("contrasenia").trim();           
        Usuario usuario = new Usuario(email, contrasenia);        

        if(usuario.getCount()== 1){//existe el usuario.
            //System.out.println("Si existe el usuario");
            if(usuario.getActivo() == 1){// si esta el usuario activo en el sistema                 
                //System.out.println("Usuario activo");
                 session = request.getSession();
    		 session.setAttribute("idUs", usuario.getIdUsuario());
                 session.setAttribute("Nombre", usuario.getNombre());
                 session.setAttribute("Apellido", usuario.getApellido());
		 session.setAttribute("tipoU",usuario.getTipoUsuario());
                 session.setAttribute("contrasenia", usuario.getContrasenia());
                 session.setAttribute("isLogin","true");
                    /*1 | Jefatura de departamento    |
                      2 | Secretaria                  |
                      3 | Tecnico Académico           |
                      4 | Personal inventario HN y BN |*/

                 switch (usuario.getTipoUsuario()){
                     case 1:
                         response.sendRedirect("./Jefatura/InicioJefatura.jsp");
                         break;                         
                     case 2:
                         response.sendRedirect("./Secretaria/InicioSecretaria.jsp");
                         break;
                     case 3: 
                         response.sendRedirect("./Tecnico/InicioTecnico.jsp");
                         break;
                     case 4:
                         response.sendRedirect("./Personal/InicioPersonal.jsp");
                         break;
                     default:
                         response.sendRedirect("InicioSesion.jsp");
                         break;
                 }                                     
            }else{              
              response.sendRedirect("InicioSesion.jsp?error=NA");
            }                                                   
        }else{            
            response.sendRedirect("InicioSesion.jsp?error=NE");            
        }
        %>      
                
     </body>
    </html>