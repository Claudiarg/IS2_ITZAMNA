<%-- 
    Document   : ConsultaPorCatalogo
    Created on : 27/11/2014, 01:28:31 AM
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
                    <h1 style="font-size: 18px">Lista de Equipos </h1>
                </div>

                <div id="content"> 

                    <div id="main-content">	   
                        

                        <div class="form-group">
                            <%
                                ConexionBD con = new ConexionBD();
                                con.conectarBD();
                                String tabla = request.getParameter("tabla");                                
                                String nuevo = request.getParameter("idElemento");
                                %>
                                <h3>Listado de Equipos por <%=tabla%> con Id = <%=nuevo%></h3>
                                <%
                                String p = "select numInformatica,marca,modelo,serie,familia,centroDeCosto, ubicacion,responsable FROM Equipo where " + tabla + "= " + nuevo + ";";
                                System.out.println(p);
                                ResultSet res = con.consultarBD(p);
                                int i = 0;
                                int numInv = 0;
                                String marca = "";
                                String modelo = "";
                                String serie = "";
                                String familia = "";
                                String centro = "";
                                String ubicacion = "";
                                String responsable = "";


                            %>
                            <table style=" width: 1050px" class="table table-striped">
                                <tr>
                                    <td style="width: 5%; text-align: center"><b>No.</td>
                                    <td style="width: 10%; text-align: center"><b>Num. Interno</td>
                                    <td style="width: 10%; text-align: center"><b>Marca</td>
                                    <td style="width: 10%; text-align: center"><b>Modelo</td>
                                    <td style="width: 10%; text-align: center"><b>Serie</td>
                                    <td style="width: 10%; text-align: center"><b>Familia</td>
                                    <td style="width: 10%; text-align: center"><b>Centro De Costo</td>
                                    <td style="width: 10%; text-align: center"><b>Ubicación</td>
                                    <td style="width: 10%; text-align: center"><b>Responsable</td>
                                </tr>
                                <tr>
                                    <%  if (!res.next()) {
                                    %>
                                <div class="alert alert-danger" role="alert"><p style="text-align:center">
                                        <b>Id Invalido / No existe ningun equipo con esa característica.</b></p></div>
                                        <%
                                            }
                                            while (res.next()) {
                                                numInv = res.getInt(1);
                                                marca = res.getString(2);
                                                modelo = res.getString(3);
                                                serie = res.getString(4);
                                                familia = res.getString(5);
                                                centro = res.getString(6);
                                                ubicacion = res.getString(7);
                                                responsable = res.getString(8);
                                                i++;
                                                ConexionBD con1 = new ConexionBD();
                                                con1.conectarBD();
                                                ResultSet rs = con1.consultarBD("select Descripcion from Marca where IdMarca= "+marca+";");
                                                while(rs.next()){
                                                    marca=rs.getString(1);
                                                }
                                                rs = con1.consultarBD("select Descripcion from Modelo where IdModelo= "+modelo+";");
                                                while(rs.next()){
                                                    modelo=rs.getString(1);
                                                }
                                                rs = con1.consultarBD("select Descripcion from Familia where IdFamilia= "+familia+";");
                                                while(rs.next()){
                                                    familia=rs.getString(1);
                                                }
                                                rs = con1.consultarBD("select Descripcion from CentroDeCosto where IdCentroDeCosto= "+centro+";");
                                                while(rs.next()){
                                                    centro=rs.getString(1);
                                                }
                                                rs = con1.consultarBD("select Descripcion from Ubicacion where IdUbicacion= "+ubicacion+";");
                                                while(rs.next()){
                                                    ubicacion=rs.getString(1);
                                                }
                                                rs = con1.consultarBD("select Descripcion from Responsable where IdResponsable= "+responsable+";");
                                                while(rs.next()){
                                                    responsable=rs.getString(1);
                                                }
                                                  con1.desconectarBD();
                                        %>
                                        <td style="font-size: 10px"><%=i%></td>
                                <td style="font-size: 11px; width: 5%; text-align: center"><%=numInv%></td>
                                <td style="font-size: 11px; width: 10%; text-align: center"><%=marca%></td>
                                <td style="font-size: 11px; width: 10%; text-align: center"><%=modelo%></td>
                                <td style="font-size: 11px; width: 10%; text-align: center"><%=serie%></td>
                                <td style="font-size: 11px; width: 10%; text-align: center"><%=familia%></td>
                                <td style="font-size: 11px; width: 10%; text-align: center"><%=centro%></td>
                                <td style="font-size: 11px; width: 10%; text-align: center"><%=ubicacion%></td>
                                <td style="font-size: 11px; width: 10%; text-align: center"><%=responsable%></td>
                                </tr>
                                <%}
                                            con.desconectarBD();                                          
                                %>
                            </table>
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
        <script src=" js/bootstrap.min.js"></script>
        <script src=" js/lightbox.js"></script>
        <script src=" js/async_content.js"></script>
        <script src=" js/async-consulta.js"></script>
        <script src=" js/async_contact.js"></script>



    </body>
</html>

