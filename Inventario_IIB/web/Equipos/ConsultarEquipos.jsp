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
                    <li id="nav-mamna">	<a onclick="menu('new_mamna');">Cambiar Contraseña</a></li>
                    <li id="nav-search">	<a  onclick="menu('search');">Salir</a></li>


                    <!-- <li><a >Acceso</a></li> -->
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
                            <div class="panel panel-default">
                               
                            </div>


                        </div>
                    </div>



                    <div id="main-content">	

                        <h2>Consultas De Equipos</h2>
                        <form class="form-horizontal" action="Consulta.jsp" method="post" role="form">
                            <div class="form-group">                                                                
                                <%
                                    ConexionBD con = new ConexionBD();
                                    con.conectarBD();
                                                                       
                                   ResultSet r = con.consultarBD("SELECT * FROM Clase;");
                                                                       
                                    String clase;  
                                    int idclase;
                                    %><label>Clase:</label><br>
                                    <select name="clase"><br>
                                        <option value=""></option>
                                     <%
                                    while(r.next()){
                                        idclase=r.getInt(1);
                                        clase = r.getString(2); %>
                                        <option value="<%=idclase%>"><%=clase%></option>
                                        <%
                                    }
                                    %></select><br><%
                                    
                                    
                                     r = con.consultarBD("SELECT * FROM Estado;");
                                                                       
                                    String estado; 
                                    int idestado;
                                    %><label>Estado:</label><br>
                                    <select name="estado" style="text-align: center" style="float: right"><br>
                                        <option value=""></option>
                                     <%
                                    while(r.next()){
                                        idestado=r.getInt(1);
                                        estado = r.getString(2); %>
                                        <option value="<%=idestado%>"><%=estado%></option>
                                        <%
                                    }
                                    %></select><br><%
                                    
                                    
                                    
                                    
                                     r = con.consultarBD("SELECT * FROM EstadoFisico;");
                                                                       
                                    String fisico; 
                                    int idfisico;
                                    %><label>Estado Fisico:</label><br>
                                    <select name="fisico" style="text-align: center"><br>
                                        <option value=""></option>
                                     <%
                                    while(r.next()){
                                        idfisico=r.getInt(1);
                                        fisico = r.getString(2); %>
                                        <option value="<%=idfisico%>"><%=fisico%></option>
                                        <%
                                    }
                                    %></select><br><%
                                    
                                     r = con.consultarBD("SELECT * FROM Familia;");
                                                                       
                                    String familia; 
                                    int idfamilia;
                                    %><label>Familia:</label><br>
                                    <select name="familia" style="text-align: center"><br>
                                        <option value=""></option>
                                     <%
                                    while(r.next()){
                                        idfamilia =r.getInt(1);
                                        familia = r.getString(2); %>
                                        <option value="<%=idfamilia%>"><%=familia%></option>
                                        <%
                                    }
                                    %></select><br><%
                                    
                                    
                                     r = con.consultarBD("SELECT * FROM Marca;");
                                                                       
                                    String marca;  
                                    int idmarca;
                                    %><label>Marca:</label><br>
                                    <select name="marca" style="text-align: center"><br>
                                        <option value=""></option>
                                     <%
                                    while(r.next()){
                                        idmarca=r.getInt(1);
                                        marca = r.getString(2); %>
                                        <option value="<%=idmarca%>"><%=marca%></option>
                                        <%
                                    }
                                    %></select><br><%
                                    
                                     r = con.consultarBD("SELECT * FROM Modelo;");
                                                                       
                                    String modelo;  
                                    int idmodelo;
                                    %><label class="der">Modelo:</label><br>
                                    <select class="der" name="modelo" ><br>
                                        <option value=""></option>
                                     <%
                                    while(r.next()){
                                        idmodelo = r.getInt(1);
                                        modelo = r.getString(2); %>
                                        <option value="<%=idmodelo%>"><%=modelo%></option>
                                        <%
                                    }
                                    %></select><br><%
                                    
                                     r = con.consultarBD("SELECT * FROM Proveedor;");
                                                                       
                                    String proveedor; 
                                    int idproveedor;
                                    %><label class="der">Proveedor:</label><br>
                                    <select class="der" name="proveedor" ><br>
                                        <option value=""></option>
                                     <%
                                    while(r.next()){
                                        idproveedor =r.getInt(1);
                                        proveedor = r.getString(2); %>
                                        <option value="<%=idproveedor%>"><%=proveedor%></option>
                                        <%
                                    }
                                    %></select><br><%
                                    
                                     r = con.consultarBD("SELECT * FROM Responsable;");
                                                                       
                                    String responsable;  
                                    int idresponsable;
                                    %><label class="der">Responsable:</label><br>
                                    <select class="der" name="responsable" style="text-align: center"><br>
                                        <option value=""></option>
                                     <%
                                    while(r.next()){
                                         idresponsable=r.getInt(1);
                                        responsable = r.getString(2); %>
                                        <option value="<%=idresponsable%>"><%=responsable%></option>
                                        <%
                                    }
                                    %></select><br><%
                                    
                                    r = con.consultarBD("SELECT * FROM Tipo;");
                                                                       
                                    String tipo;  
                                    int idtipo;
                                    %><label>Tipo:</label><br>
                                    <select name="tipo" style="text-align: center"><br>
                                        <option value=""></option>
                                     <%
                                    while(r.next()){
                                        idtipo=r.getInt(1);
                                        tipo = r.getString(2); %>
                                        <option value="<%=idtipo%>"><%=tipo%></option>
                                        <%
                                    }
                                    %></select><br><%
                                   
                                    r = con.consultarBD("SELECT * FROM Ubicacion;");
                                                                       
                                    String ubicacion; 
                                    int idubicacion;
                                    %><label>Ubicación:</label><br>
                                    <select name="ubicacion" style="text-align: center"><br>
                                        <option value=""></option>
                                     <%
                                    while(r.next()){
                                        idubicacion = r.getInt(1);
                                        ubicacion = r.getString(2); %>
                                        <option value="<%=idubicacion%>"><%=ubicacion%></option>
                                        <%
                                    }
                                    %></select><br><%
                                    
                                    r = con.consultarBD("SELECT * FROM Uso;");
                                                                       
                                    String uso;  
                                    int iduso;
                                    %><label>Uso:</label><br>
                                    <select name="uso" style="text-align: center"><br>
                                        <option value=""></option>
                                     <%
                                    while(r.next()){
                                        iduso = r.getInt(1);
                                        uso = r.getString(2); %>
                                        <option value="<%=iduso%>"><%=uso%></option>
                                        <%
                                    }
                                    %></select><br><%
                                    
                                    
                                    con.desconectarBD();
                                   
                                                                      
                                %>
                                
                            </div>   
                                <input type="submit" style="width: 100px" name="submit" class="btn btn-success" value="Buscar"/>
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
