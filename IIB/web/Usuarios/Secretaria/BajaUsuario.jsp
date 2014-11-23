<%-- 
    Document   : VistaSecretaria
    Created on : 12/11/2014, 02:03:36 AM
    Author     : beth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
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
                    <h1><small>Secretaria</small> </h1>
                </div>

                <div id="content" > 
                    <div id="vertical-menu">

                        <div id="menu1">
                            <ul>
                                <li class="nivel1 primera">
                                    <a class="nivel1">Equipos</a>
                                    <ul>
                                        <li>
                                            <a href="RegistrarEquipos.jsp">Registrar</a>
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
                                            <a  href="RegistrarUsuario.jsp">Registrar</a>
                                        </li>
                                        <li>
                                            <a href="BajaUsuario.jsp" >Dar de Baja</a>
                                        </li>
                                        <li>
                                            <a href="ContraseniaUsuario.jsp">Nueva Contraseña</a>
                                        </li>
                                    </ul>
                                </li>                               
                                <li class="nivel1 primera">
                                    <a href="Consultas.jsp" class="nivel1">Consultas</a>
                                </li>
                                <li class="nivel1 primera">
                                    <a href="CambiarContrasenia.jsp">Cambiar Contraseña</a>
                                </li>
                            </ul>
                            
                        </div>
                    </div>



                    <div id="main-content">	

                        <h2>Dar de baja a usuario.</h2>
                        
                               <%
                            if (request.getParameter("error") != null) {
                                String error = request.getParameter("error");
                                if (error.equals("NA")) {
                        %>
                        <div class="alert alert-danger" role="alert"><p style="text-align:center">Usuario esta dado de baja.</p></div>                                             
                        <%
                        } else {
                        %>
                        <div class="alert alert-danger" role="alert"><p style="text-align:center">Usuario no existente.</p></div>
                        <%
                            }

                        } else {
                            if (request.getParameter("exito") != null) {
                        %>
                        <div class="alert alert-success" role="alert"><p style="text-align:center"><b>El Usuario ha sido dado de baja.</b></p></div>
                        <%
                                }
                            }

                        %>
                        <form class="form-horizontal" role="form" action="BajaUsuariosV.jsp" method="post">
                            <div class="form-group" style="margin-right:-850px">
                                <label for="inputEmail3" class="col-sm-2 control-label">Correo:</label>
                                <div class="col-sm-10">
                                    <input style="width:300px" pattern="[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{1,5}" type="email" name="correo" class="form-control" id="inputEmail3" required>
                                </div>
                            </div>                            
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">                                    
                                </div>
                            </div>
                            <div class="form-group" style="margin-right:-850px">
                                <div class="col-sm-offset-2 col-sm-10" >
                                    <button type="submit" class="btn btn-default">Dar de Baja</button>
                                </div>
                            </div>
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
        <script src=" ../../js/jquery.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src=" ../../js/bootstrap.min.js"></script>
        <script src=" ../../js/lightbox.js"></script>
        <script src=" ../../js/async_content.js"></script>
        <script src=" ../../js/async-consulta.js"></script>
        <script src=" ../../js/async_contact.js"></script>
    </body>
</html>