<%-- 
    Document   : Editar
    Created on : 13/11/2014, 11:38:19 AM
    Author     : beth
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Conexion.ConexionBD"%>
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
            String actual = request.getParameter("conActual");
            String nueva = request.getParameter("nueva");
            String nueva2 = request.getParameter("nueva2");
            String correo = request.getParameter("correo");            
            Usuario usuario = new Usuario(1, correo);
            if(usuario.getCount() == 1){//el usuario existe.                
                if (nueva.equals(nueva2)) {// los campos de nueva contrasenia coinciden                
                    ConexionBD conexion = new ConexionBD();
                    conexion.conectarBD();
                    String query = "UPDATE Usuario SET contrasenia='"+nueva+"' WHERE idUsuario=" + usuario.getIdUsuario() + ";";                    
                    conexion.actualizarBD(query);
                    conexion.desconectarBD();
                    response.sendRedirect("../CambioContraseniaUsuario.jsp?accion=validate");

                } else {
                    response.sendRedirect("../CambioContraseniaUsuario.jsp?error=NV");//no coinciden
                }            
                
            }else{
                response.sendRedirect("../CambioContraseniaUsuario.jsp?error=NE");//no existe el usuario
            }
                
            
/**
            if (usuario.getContrasenia().equals(actual) ) {//la contrasenia es correcta
                if (nueva.equals(nueva2)) {// los campos de nueva contrasenia coinciden                
                    ConexionBD conexion = new ConexionBD();
                    conexion.conectarBD();
                    String query = "UPDATE Usuario SET contrasenia='"+nueva+"' WHERE idUsuario=" + idUsuario + ";";                    
                    conexion.actualizarBD(query);
                    response.sendRedirect("CambioContrasenia.jsp?exito=1");

                } else {
                    response.sendRedirect("CambioContrasenia.jsp?error=NV");
                }
            } else {
                response.sendRedirect("CambioContrasenia.jsp?error=Invalida");
            }**/
        %>


    </body>
</html>
