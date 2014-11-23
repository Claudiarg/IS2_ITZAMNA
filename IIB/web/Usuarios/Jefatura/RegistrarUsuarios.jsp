<%-- 
    Document   : Vista
    Created on : 12/10/2014, 10:54:09 PM
    Author     : beth
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Conexion.ConexionBD"%>
<%@page session = "true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Inventario</title>
        <link rel="stylesheet" media="screen" href=" ../../css/bootstrap.min.css" >
        <link rel="stylesheet" media="screen" href=" ../../css/bootstrap-theme.min.css" >
        <link rel="stylesheet" media="screen" href=" ../../css/lightbox.css" >
        <link rel="stylesheet" media="screen" href=" ../../css/main.css" >
        <link rel="stylesheet" media="screen" href=" ../../css/style3.css" >
        <link rel="stylesheet" media="screen" href=" ../../css/media.css" >
        <link rel="stylesheet" media="screen" href=" ../../css/result-consulta.css" >
        <link rel="shortcut icon" href=" ../../images/favicon_64.gif">
        <link rel="apple-touch-icon" href=" ../../images/favicon_64.gif">
    </head>
    <body>
        <div id="header" class="jumbotron">
            <div class="container-fluid">
                <a href="http://www.unam.mx/" id="escudoUNAM">
                    <img alt="Universidad Nacional Autónoma de México, UNAM" src="../../images/unam-logo.png"/>
                </a>

                <a href="#" id="header-title">
                    Sistema de Inventario <br>Bibliotecario
                </a>
                <img id="banner_iib" src="../../images/banner_iib.jpg">
            </div>
        </div>

        <div id="menu" class="navbar">
            <div class="container-fluid" role="navigation">
                <form method="post" action="../../cerrarSesion.jsp">               
                       <button type="submit" id="cerrarS">Salir</button>                                 
                   </form>                    
            </div>
        </div>
        
        <div id="main">

            <div id="main-container" class="container-fluid" role="main">

                <div id="main-title" class="page-header">
                    <h1><small>Jefatura de departamento.</small> </h1>
                </div>

                <div id="content" > 
                    <div id="vertical-menu">

                        <div id="menu1">
                            <ul>
                                <li class="nivel1 primera">
                                    <a class="nivel1">Equipos</a>
                                    <ul>
                                        <li>
                                            <a href="RegistrarEquipos.jsp">Registrar </a>
                                        </li>
                                        <li>
                                            <a href="ActualizarEquipos.jsp">Actualizar</a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="nivel1 primera">
                                    <a class="nivel1">Movimientos</a>
                                </li>
                                <li class="nivel1 primera">
                                    <a class="nivel1">Usuarios</a>
                                    <ul>
                                        <li>
                                            <a href="RegistrarUsuarios.jsp">Registrar</a>
                                        </li>
                                        <li>
                                            <a href="BajaUsuarios.jsp">Dar de Baja</a>
                                        </li>
                                        <li>
                                            <a href="CambioContraseniaUsuario.jsp">Nueva Contraseña</a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="nivel1 primera">
                                    <a class="nivel1">Catálogos</a>
                                    <ul>
                                        <li>
                                            <a href="AgregarCatalogo.jsp">Crear</a>
                                        </li>
                                        <li>
                                            <a href="consultarCatalogos.jsp">Consultar</a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="nivel1 primera">
                                    <a class="nivel1">Consultas</a>
                                </li>
                                <li class="nivel1 primera">
                                    <a href="CambioContrasenia.jsp">Cambiar Contraseña</a>
                                </li>
                            </ul>
                            
                        </div>
                    </div>



                    <div id="main-content">	

                        <h2>Registrar usuarios.</h2>
                                                <div style="margin-left:170px">
                            <form class="form-horizontal" action="RegistraUsuariosV.jsp" method="post" role="form">
                                <div class="form-group" style="margin-right:-50px">                                                                                                                                                     
                                    <%
                                        ConexionBD con = new ConexionBD();
                                        con.conectarBD();

                                        ResultSet r = con.consultarBD("SELECT * FROM TipoUsuario;");

                                        String usuario;
                                        int idusuario;
                                    %>
                                    <label class="col-sm-2 control-label">Tipo de Usuario:</label><br>
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

                                    <label class="col-sm-2 control-label">Nombre:</label><br>
                                    <div class="col-sm-10">
                                        <input class="form-control" type="text" name="nombre" pattern="[a-zA-Z]+" title="Se necesita un nombre" style="width: 300px" required>
                                    </div>

                                    <label class="col-sm-2 control-label">Apellido:</label><br>
                                    <div class="col-sm-10">
                                        <input class="form-control" type="text" name="apellido" pattern="[a-zA-Z]+" title="Se necesita pellido" style="width: 300px" required>
                                    </div>

                                    <label class="col-sm-2 control-label">Correo:</label><br>
                                    <div class="col-sm-10">
                                        <input class="form-control" type="email"  pattern="[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{1,5}" name="correo" title="ejemplo@dominio.com" style="width: 300px" required>
                                    </div>

                                    <label class="col-sm-2 control-label">Contraseña:</label><br>
                                    <div class="col-sm-10">
                                        <input class="form-control" maxlength="10" type="password" name="contrasenia" title="Maximo 10 caracteres" style="width: 300px" required> 
                                    </div>
                                </div> 
                                <div class="form-group" style="margin-right:-850px">
                                    <div class="col-sm-offset-2 col-sm-10" >
                                        <button type="submit" class="btn btn-default">Crear</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        
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
        <script src=" ../../js/jquery.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src=" ../../js/bootstrap.min.js"></script>
        <script src=" ../../js/lightbox.js"></script>
        <script src=" ../../js/async_content.js"></script>
        <script src=" ../../js/async-consulta.js"></script>
        <script src=" ../../js/async_contact.js"></script>



    </body>
</html>
