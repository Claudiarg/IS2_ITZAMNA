<%-- 
    Document   : Insertar
    Created on : 2/11/2014, 06:43:18 PM
    Author     : beth
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Conexion.ConexionBD"%>
<%@page import="java.sql.*" %>
<%@page import="Controlador.Responsable"%>




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
                    <h1 style="font-size: 25px">Responsable Creado</h1>
                </div>

                <div id="content"> 
                    <div id="vertical-menu" class="vertical-menu"></div>
                    <div id="main-content">	

                        
                       
                            <div class="form-group">                                                                
                                <%
                                    ConexionBD con = new ConexionBD();
                                    con.conectarBD();
                                    int ultimo = 0;
                                    ResultSet r = con.consultarBD("SELECT MAX(idResponsable) FROM Responsable;");
                                    while (r.next()) {
                                        ultimo = r.getInt(1);
                                        System.out.println("este es el ultimo" + ultimo);
                                    }

                                    String nuevo = request.getParameter("nuevo");
                                    System.out.println("este es nuevo" + nuevo);
                                    String p="INSERT INTO Responsable (idResponsable, NombreResponsable) VALUES (" + (ultimo + 1) + ",'"+nuevo+"');";
                                    con.insertarBD(p);
                                    
                                    
                                %>
                                <h3><%=nuevo%> creado exitosamente.</h3>
                                <%
                                    con.desconectarBD();
                                %>

                                <a href="../VistaPersonal.jsp"><buttom style="width: 100px" class="btn btn-success"/>Inicio</buttom></a>
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
        <script src=" js/jquery.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src=" ../js/bootstrap.min.js"></script>
        <script src=" ../js/lightbox.js"></script>
        <script src=" ../js/async_content.js"></script>
        <script src=" ../js/async-consulta.js"></script>
        <script src=" ../js/async_contact.js"></script>



    </body>
</html>
