<%-- 
    Document   : Vista
    Created on : 12/10/2014, 10:54:09 PM
    Author     : beth
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Conexion.ConexionBD"%>
<%@page import="java.sql.*" %>




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
                    <li id="nav-search">	
                        <a id="salir">Salir</a>
                    </li>
                </ul>
            </div>
        </div>

        <div id="main">

            <div id="main-container" class="container-fluid" role="main">

                <div id="main-title" class="page-header">
                    <h1><small>Personal BN y HN</small> </h1>
                </div>

                <div id="content"> 
                    <div id="vertical-menu" class="vertical-menu">

                        <div class="panel-group" id="accordion">



                        </div>
                    </div>



                    <div id="main-content">	

                        <h2>Consultas De Equipos</h2>
                        <form class="form-horizontal" action="Consulta.jsp" role="form">
                            <div class="form-group">                                                                
                                <%

                                    String clase = request.getParameter("clase");
                                    String estado = request.getParameter("estado");
                                    String fisico = request.getParameter("fisico");
                                    String familia = request.getParameter("familia");
                                    String marca = request.getParameter("marca");
                                    String modelo = request.getParameter("modelo");
                                    String proveedor = request.getParameter("proveedor");
                                    String responsable = request.getParameter("responsable");
                                    String tipo = request.getParameter("tipo");
                                    String ubicacion = request.getParameter("ubicacion");
                                    String uso = request.getParameter("uso");
                                    int numinf;
                                    String descripcion;
                                    String serie;
                                    String fechare = "2014-12-12";
                                    String nivel;
                                    String fechares = "2014-12-12";
                                    String centro;

                                    String consulta = "SELECT * FROM Equipo WHERE clase='" + clase + "' OR estado='" + estado + "' OR estadoFisico='" + fisico
                                            + "' OR familia='" + familia + "' OR marca='" + marca + "' OR modelo='" + modelo + "' OR proveedor='" + proveedor + "' OR responsable='" + responsable
                                            + "' OR tipo='" + tipo + "' OR ubicacion='" + ubicacion + "' OR uso='" + uso + "';";

                                    System.out.println(consulta);

                                    ConexionBD con = new ConexionBD();
                                    con.conectarBD();
                                    ResultSet r = con.consultarBD(consulta);
                                    ResultSet re;

                                %>
                                
                                    <% if (r.getFetchSize() > 0) {
                                    %>
                                    <h3>No se encontraron resultados.</h3>
                                    <%
                                    } else {
                                        %>
                                    <table class="table table-striped">
                                    <tr>
                                        <td><b>Numero Inventario</td>
                                        <td><b>Descripción</td>
                                        <td><b>Marca</td>
                                        <td><b>Serie</td>
                                        <td><b>Fecha Registro</td>
                                        <td><b>Obsolescencia</td>
                                        <td><b>Fecha Resguardo</td>
                                        <td><b>Centro Costo</td></b>
                                    </tr>
                                    <%

                                        while (r.next()) {

                                            numinf = r.getInt(2);%>
                                    <tr><td><%=numinf%></td>
                                    <%
                                            descripcion = r.getString(5);%>
                                    <td><%=descripcion%></td>
                                    <%
                                            marca = r.getString(6);%>

                                    <td><%=marca%></td>
                                    <%
                                            serie = r.getString(8);%>
                                    <td><%=serie%></td>
                                    <%
                                            fechare = r.getString(12);%>
                                    <td><%=fechare%></td>
                                    <%
                                            nivel = r.getString(15);%>
                                    <td><%=nivel%></td>
                                    <%
                                            fechares = r.getString(19);%>
                                    <td><%=fechares%></td>
                                    <%
                                            centro = r.getString(20);%>
                                            <td><%=centro%></td></tr>
                                    <%
                                        }
                                    %>
                                 
                                <%
                                        %>
                                    </table>
                                    <%
                                    }

                                    con.desconectarBD();


                                %>

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
