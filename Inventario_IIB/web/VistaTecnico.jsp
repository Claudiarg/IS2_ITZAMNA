<%-- 
    Document   : Vista
    Created on : 12/10/2014, 10:54:09 PM
    Author     : beth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Inventario</title>
        <link rel="stylesheet" media="screen" href=" css/bootstrap.min.css" >
        <link rel="stylesheet" media="screen" href=" css/bootstrap-theme.min.css" >
        <link rel="stylesheet" media="screen" href=" css/lightbox.css" >
        <link rel="stylesheet" media="screen" href=" css/main.css" >
        <link rel="stylesheet" media="screen" href=" css/media.css" >
        <link rel="stylesheet" media="screen" href=" css/result-consulta.css" >
        <link rel="shortcut icon" href=" images/favicon_64.gif">
        <link rel="apple-touch-icon" href=" images/favicon_64.gif">
    </head>
    <body>
        <div id="header" class="jumbotron">
            <div class="container-fluid">
                <a href="http://www.unam.mx/" id="escudoUNAM">
                    <img alt="Universidad Nacional Autónoma de México, UNAM" src="images/unam-logo.png"/>
                </a>
                
                <a href="#" id="header-title">
                    Sistema de Inventario <br>Bibliotecario
                </a>
                <img id="banner_iib" src="images/banner_iib.jpg">
            </div>
        </div>

        <div id="menu" class="navbar">
            <div class="container-fluid" role="navigation">
                <ul class="nav navbar-nav nav-pills">                    
                    <li id="nav-mamna">	<a onclick="menu('new_mamna');">Cambiar Contraseña</a></li>
                    <li id="nav-search">	<a  onclick="menu('search');">Salir</a></li>


                    <!-- <li><a >Acceso</a></li> -->
                </ul>
            </div>
        </div>

        <div id="main">

            <div id="main-container" class="container-fluid" role="main">

                <div id="main-title" class="page-header">
                    <h1><small>T&eacute;cnicos</small> </h1>
                </div>

                <div id="content"> 
                    <div id="vertical-menu" class="vertical-menu">

                        <div class="panel-group" id="accordion">
                                                        
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title"><a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#ordersPanel"> 
                                            Movimientos </a></h4>
                                </div>
                                
                            </div>

                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title"><a href="RegistrarEquipo.jsp"> 
                                            Dar de Baja Equipo </a></h4>
                                </div>
                                <div id="genusPanel" class="panel-collapse collapse">
                                    
                                </div>
                            </div>

                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title"><a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#familyPanel"> 
                                            Asignar Equipo  </a></h4>
                                </div>                                
                            </div>

                            

                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title"><a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#patronPanel"> 
                                            Cambiar Equipo
                                        </a></h4>
                                </div>                               
                            </div>
                        </div>
                    </div>



                    <div id="main-content">	

                        <h2>Bienvenido</h2>
                        <p></p>
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
        <script src=" js/bootstrap.min.js"></script>
        <script src=" js/lightbox.js"></script>
        <script src=" js/async_content.js"></script>
        <script src=" js/async-consulta.js"></script>
        <script src=" js/async_contact.js"></script>



    </body>
</html>
