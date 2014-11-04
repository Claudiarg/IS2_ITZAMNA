<%-- 
    Document   : EditarContrasenia
    Created on : 3/11/2014, 01:54:02 PM
    Author     : beth
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Conexion.ConexionBD"%>
<%@page import="java.sql.*" %>
<%@page import="Controlador.Usuario"%>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Inventario</title>
        <link rel="stylesheet" media="screen" href=" ../css/bootstrap.min.css" >
        <link rel="stylesheet" media="screen" href=" ../css/bootstrap-theme.min.css" >
        <link rel="stylesheet" media="screen" href=" ../css/lightbox.css" >
        <link rel="stylesheet" media="screen" href=" ../css/main.css" >
        <link rel="stylesheet" media="screen" href=" ../css/media.css" >
        <link rel="stylesheet" media="screen" href=" ../css/result-consulta.css" >
        <link rel="shortcut icon" href=" ../images/favicon_64.gif">
        <link rel="apple-touch-icon" href=" ../images/favicon_64.gif">
    </head>
    <body>
        <div id="header" class="jumbotron">
            <div class="container-fluid">
                <a href="http://www.unam.mx/" id="escudoUNAM">
                    <img alt="Universidad Nacional Autónoma de México, UNAM" src="../images/unam-logo.png"/>
                </a>

                <a href="#" id="header-title">
                    Sistema de Inventario <br>Bibliotecario
                </a>
                <img id="banner_iib" src="../images/banner_iib.jpg">
            </div>
        </div>

        <div id="menu" class="navbar">
            <div class="container-fluid" role="navigation">
                <ul class="nav navbar-nav nav-pills">                                        
                    <li id="nav-search">
                        <a  id="salir">Salir</a>
                    </li>
                </ul>
            </div>
        </div>

        <div id="main">

            <div id="main-container" class="container-fluid" role="main">

                <div id="main-title" class="page-header">
                    <h1 style="font-size: 25px">Editar Contraseña</h1>
                </div>

                <div id="content"> 
                    <div id="vertical-menu" class="vertical-menu"></div>
                    <div id="main-content">	

                        <h2>Nuevo Usuario </h2>
                        <form class="form-horizontal" action="Editar.jsp" method="post" role="form">
                            <div class="form-group">                                                                                                                                                     
                                <%
                                    ConexionBD con = new ConexionBD();
                                    con.conectarBD();

                                    ResultSet r = con.consultarBD("SELECT * FROM TipoUsuario;");

                                    String usuario;
                                    int idusuario;
                                %>
                                <label class="col-sm-2 control-label">Tipo de Usuario:</label>
                                <div class="col-sm-10">
                                    <select name="usuario">                                        
                                        <%
                                            while (r.next()) {
                                                idusuario = r.getInt(1);
                                                usuario = r.getString(2);%>
                                        <option value="<%=idusuario%>"><%=usuario%></option>
                                        <%
                                            }
                                        %></select><br><br>
                                </div>
                                
                                <label class="col-sm-2 control-label">Nombre:</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="text" name="nombre" pattern="[a-zA-Z]+" title="Se necesita un nombre" style="width: 300px" required>
                                </div>
                                
                                <label class="col-sm-2 control-label">Apellido:</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="text" name="apellido" pattern="[a-zA-Z]+" title="Se necesita pellido" style="width: 300px" required>
                                </div>
                                
                                <label class="col-sm-2 control-label">Correo:</label>
                                <div class="col-sm-10">
                                    <input class="form-control" type="email"  pattern="[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{1,5}" name="correo" title="ejemplo@dominio.com" style="width: 300px" required>
                                </div>
                                
                                <label class="col-sm-2 control-label">Contraseña:</label>
                                <div class="col-sm-10">
                                    <input class="form-control" maxlength="10" type="text" name="contrasenia" title="Maximo 10 caracteres" style="width: 300px" required> 
                                </div>
                                
                                

                                

                            </div>   
                            <input type="submit" style="width: 100px" name="submit" class="btn btn-success" value="Crear"/>
                        </form>
                    </div>
                </div>




            </div>
        </div>

        <div id="footer" >
            <div class="container-fluid" role="footer">
                <p>2014 &copy; Biblioteca Nacional.<br>
                    Hemeroteca Nacional, Ciudad Universitaria. Universidad Nacional Autónoma de México.<br>
                    <a href="http://www.iib.unam.mx/">IIB</a>
                </p>
            </div>
        </div>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src=" js/jquery.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src=" ../js/bootstrap.min.js"></script>
        <script src=" ../js/lightbox.js"></script>
        <script src=" ../js/async_content.js"></script>
        <script src=" ../js/async-consulta.js"></script>
        <script src=" ../js/async_contact.js"></script>



    </body>
</html>
