<%-- 
    Document   : validadorBorrar
    Created on : 12/11/2014, 11:00:14 PM
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
            String email = request.getParameter("correo");
            Usuario usuario = new Usuario(1, email);

            if (usuario.getCount() == 1) {//existe el usuario.
                if (usuario.getActivo() == 1) {// si esta el usuario activo en el sistema                 
                    ConexionBD conexion = new ConexionBD();
                    conexion.conectarBD();
                    String query = "UPDATE Usuario SET activo=0 WHERE correo='"+email+"';";
;
                    conexion.actualizarBD(query);
                    response.sendRedirect("BajaUsuarios.jsp?exito=1");

                } else {
                    response.sendRedirect("BajaUsuarios.jsp?error=NA");
                }
            } else {
                response.sendRedirect("BajaUsuarios.jsp?error=NE");
            }
        %>


    </body>
</html>