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
                    <li id="nav-marco">	<a  onclick="menu('marco');">Cambiar contraseña</a></li>                                        
                    <li id="nav-search">	<a  onclick="menu('search');">Salir</a></li>
                    <!-- <li><a >Acceso</a></li> -->
                </ul>
            </div>
        </div>

        <div id="main">

            <div id="main-container" class="container-fluid" role="main">

                <div id="main-title" class="page-header">
                    <h1 style="font-size: 30px"><small>Registrar Equipos</small> </h1>
                </div>

                <div id="content"> 



                    <div id="main-content">	
                        <div class="form-group has-success">
                            <label class="control-label" for="inputSuccess1">Id equipo</label>
                            <input type="text" class="form-control" id="inputSuccess1" style="width: 300px">
                        </div>                       
                         <div class="form-group has-success">
                            <label class="control-label" for="inputSuccess1">Dato equipo</label>
                            <input type="text" class="form-control" id="inputSuccess1" style="width: 300px">
                        </div>
                        <div class="form-group has-success">
                            <label class="control-label" for="inputSuccess1">Dato equipo</label>
                            <input type="text" class="form-control" id="inputSuccess1" style="width: 300px">
                        </div>                       
                         <div class="form-group has-success">
                            <label class="control-label" for="inputSuccess1">Dato equipo</label>
                            <input type="text" class="form-control" id="inputSuccess1" style="width: 300px">
                        </div>
                        <div class="form-group has-success">
                            <label class="control-label" for="inputSuccess1">Dato equipo</label>
                            <input type="text" class="form-control" id="inputSuccess1" style="width: 300px">
                        </div>                       
                         <div class="form-group has-success">
                            <label class="control-label" for="inputSuccess1">Dato equipo</label>
                            <input type="text" class="form-control" id="inputSuccess1" style="width: 300px">
                        </div>
                        <div class="form-group has-success">
                            <label class="control-label" for="inputSuccess1">Dato equipo</label>
                            <input type="text" class="form-control" id="inputSuccess1" style="width: 300px">
                        </div>                       
                         <div class="form-group has-success">
                            <label class="control-label" for="inputSuccess1">Dato equipo</label>
                            <input type="text" class="form-control" id="inputSuccess1" style="width: 300px">
                        </div>
                        <div class="form-group has-success">
                            <label class="control-label" for="inputSuccess1">Dato equipo</label>
                            <input type="text" class="form-control" id="inputSuccess1" style="width: 300px">
                        </div>                       
                         <div class="form-group has-success">
                            <label class="control-label" for="inputSuccess1">Dato equipo</label>
                            <input type="text" class="form-control" id="inputSuccess1" style="width: 300px">
                        </div>
                         <button type="submit" class="btn btn-default">Guardar</button>
                      
                        
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
