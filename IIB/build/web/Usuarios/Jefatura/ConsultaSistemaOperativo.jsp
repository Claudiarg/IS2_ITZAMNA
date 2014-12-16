<%-- 
    Document   : ConsultasEquipoCon
    Created on : 27/11/2014, 12:04:55 AM
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
                    <h1 style="font-size: 18px">Consulta por Sistema Operativo</h1>
                </div>

                <div id="content"> 

                    <div id="main-content">	                           

                        <h3 style='text-align: center'>Equipo de cómputo en uso</h3>

                        <div class="form-group">
                            <%
                                ConexionBD con = new ConexionBD();
                                con.conectarBD();
                                String consulta = "SELECT familia FROM Equipo WHERE tipo=1 OR tipo=2 OR tipo=6 OR tipo=13;";
                                ResultSet r = con.consultarBD(consulta);
                                ResultSet r1;
                                int numero = 0;
                                int num = 0;
                                String texto = "";
                                int num1 = 0;
                                int num2=0;
                            %>
                            <table class="table table-striped" style=" margin-left: 110px">
                                <tr>
                                    <td style="width: 36%"><b>Tipo de Equipo</td>
                                    <td><b>Win XP y anteriores</td>
                                    <td><b>Windows VISTA/7/8</td>
                                    <td><b>Windows Server, MAC y Linux</td>                                    
                                </tr> 

                                <% while (r.next()) {
                                        numero = r.getInt(1);
                                        ConexionBD con1 = new ConexionBD();
                                        con1.conectarBD();
                                        ConexionBD con2 = new ConexionBD();
                                        con2.conectarBD();
                                        ResultSet r2 = con2.consultarBD("select count(*) from Equipo where NivelObsolescencia =2 and familia=" + numero + ";");
                                        r1 = con1.consultarBD("select Descripcion from Familia where IdFamilia=" + numero + ";");
                                        while (r1.next()) {
                                            texto = r1.getString(1);
                                        }

                                        while (r2.next()) {
                                            num = r2.getInt(1);
                                        }
                                        r1 = con1.consultarBD("select count(*) from Equipo where NivelObsolescencia=4 and familia=" + numero + ";");
                                        while (r1.next()) {
                                            num1 = r1.getInt(1);
                                        }
                                        r2 = con2.consultarBD("select count(*) from Equipo where NivelObsolescencia=6 and familia=" + numero + ";");
                                        while (r1.next()) {
                                            num2 = r1.getInt(1);
                                        }
                                %>
                                <tr><td><br><%=texto%><br></td>
                                    <td style="text-align: center"><%=num%></td>
                                    <td style="text-align: center"><%=num1%></td>
                                    <td style="text-align: center"><%=num2%></td>
                                </tr>

                                <%
                                    }
                                %>   
                                <div><a href="SO">Descargar excel</a></div>
                            </table><br><br>
                            
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
