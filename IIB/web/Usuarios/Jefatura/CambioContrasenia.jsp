<%-- 
    Document   : Vista
    Created on : 12/10/2014, 10:54:09 PM
    Author     : beth
--%>
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
                <ul class="nav navbar-nav nav-pills">                    
                    <li id="nav-search"><a href="../../cerrarSesion.jsp" onclick="menu('search');">Salir</a></li>
                    
                </ul>
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
                                            <a href="">Crear</a>
                                        </li>
                                        <li>
                                            <a>Consultar</a>
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

                        <h2>Cambiar contraseña.</h2>
                        
                        <div style="margin-left:80px"> 

                            <form class="form-horizontal" action="CambioContraseniaV.jsp" method="post" role="form">
                                <div class="form-group"style="margin-right:-850px">                                                                                                                                                                                   
                                    <br><br>
                                    <%
                                        if (request.getParameter("error") != null) {
                                            String error = request.getParameter("error");
                                            if (error.equals("Invalida")) {
                                    %>
                                    <div style="width: 700px" class="alert alert-danger" role="alert"><p style="text-align:center">Contraseña Actual Invalida.</p></div>                                             
                                    <%
                                    } else {
                                    %>
                                    <div style="width: 700px" class="alert alert-danger" role="alert"><p style="text-align:center">Nueva contraseña no coincide en ambos campos.</p></div>
                                    <%
                                        }

                                    } else {
                                        if (request.getParameter("exito") != null) {
                                    %>
                                    <div style="width: 700px" class="alert alert-success" role="alert"><p style="text-align:center"><b>Cambio de Contraseña Exitoso.</b></p></div>
                                    <%
                                            }
                                        }

                                    %>
                                    <label class="col-sm-2 control-label">Contraseña Actual:</label>
                                    <div class="col-sm-10">
                                        <input class="form-control" type="password" name="conActual" style="width: 300px" required>
                                    </div>

                                    <label class="col-sm-2 control-label">Nueva Contraseña:</label>
                                    <div class="col-sm-10">
                                        <input class="form-control" type="password" name="nueva"  style="width: 300px" required>
                                    </div>                                                                                                                                         

                                    <label class="col-sm-2 control-label">Confirma Contraseña:</label>
                                    <div class="col-sm-10">
                                        <input class="form-control" type="password" name="nueva2"  style="width: 300px" required>
                                    </div>                                                                                                                                         

                                </div>   
                                <div class="form-group" style="margin-right:-850px">
                                    <div class="col-sm-offset-2 col-sm-10" >
                                        <button type="submit" class="btn btn-default">Confirmar</button>
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
