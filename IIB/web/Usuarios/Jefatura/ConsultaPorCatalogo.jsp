<%-- 
    Document   : ConsultaEuipoCatalogo
    Created on : 27/11/2014, 01:21:24 AM
    Author     : beth
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Conexion.ConexionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Inventario</title>
        <link rel="stylesheet" media="screen" href=" ../../css/bootstrap.min.css" >
        <link rel="stylesheet" media="screen" href=" ../../css/bootstrap-theme.min.css" >
        <link rel="stylesheet" media="screen" href=" ../../css/lightbox.css" >
        <link rel="stylesheet" media="screen" href=" ../../css/main.css" >
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
                    <!-- <li><a >Acceso</a></li> -->
                </ul>
            </div>
        </div>

        <div id="main">

            <div id="main-container" class="container-fluid" role="main">

                <div id="main-title" class="page-header">
                    <h1 style="font-size: 18px">Consultar Equipos </h1>
                </div>

                <div id="content"> 

                    <div id="main-content">	                           
                                                
                        <h3 style='text-align: center'>Elige el nombre del Catálogo:</h3>

                        <form class="form-horizontal" action="ConsultaEquipoPorCatalogo.jsp" method="post">
                            <div class="form-group">
                                <select name="tabla" style='margin-left: 309px; width: 180px; height: 35px'>
                                    <option value="centroDeCosto">Centro de Costo</option>
                                    <option value="clase">Clase</option>
                                    <option value="estado">Estado</option>
                                    <option value="estadoFisico">Estado Físico</option>
                                    <option value="familia">Familia</option>
                                    <option value="marca">Marca</option>
                                    <option value="modelo">Modelo</option>
                                    <option value="nivelObsolescencia">Nivel Obsolescencia</option>
                                    <option value="proveedor">Proveedor</option>
                                    <option value="responsable">Responsable</option>
                                    <option value="tipo">Tipo</option>
                                    <option value="ubicacion">Ubicación</option>
                                    <option value="uso">Uso</option>                                    
                                </select><br>

                                <h3 style='margin-left: 309px'>Introduce el identificador del elemento del Catálogo a buscar:</h3>
                                <input style='margin-left: 309px'type="text" pattern="[0-9]{1,8}" name="idElemento" required><br><br>
                            </div>                            
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button style="margin-left: 156px" type="submit" class="btn btn-default">Siguiente</button>
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
        <script src=" js/jquery.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src=" js/bootstrap.min.js"></script>
        <script src=" js/lightbox.js"></script>
        <script src=" js/async_content.js"></script>
        <script src=" js/async-consulta.js"></script>
        <script src=" js/async_contact.js"></script>



    </body>
</html>
