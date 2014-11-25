<%-- 
    Document   : Vista
    Created on : 12/10/2014, 10:54:09 PM
    Author     : beth
--%>

<%@page import="java.sql.ResultSet"%>
<%@page session = "true" %>
<%@page import="Controlador.Equipo" %>
<%@page import="Conexion.ConexionBD" %>
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
                <form method="post" action="../../cerrarSesion.jsp">               
                       <button type="submit" id="cerrarS">Salir</button>                                 
                   </form>                    
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
                                            <a href="AgregarCatalogo.jsp">Crear</a>
                                        </li>
                                        <li>
                                            <a href="consultarCatalogos.jsp">Consultar</a>
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

                        <h2>Actualizar equipos.</h2>
                        <p>Ingresa el número de inventario del departamento de 
                            informática.</p>  
                        <%if (request.getParameter("error") != null) { 
                               String error = request.getParameter("error");
                               if(error.equals("NE")){%>
                                 <div class="alert alert-danger" role="alert">No existe el equipo. Verificar el número de inventario 
                                     del departamento de informática.
                                 </div>
                         <%    }  
                            }
                            if(request.getParameter("action") != null){
                                String action = request.getParameter("action");
                                if(action.equals("true")){%>                                    
                                    <div class="alert alert-success" role="alert"> Equipo actualizado exitosamente</div>
                                <%}else{%>
                                <div class="alert alert-danger" role="alert">Se generó un fallo al guardar la actualización del equipo. Vuelve a intentar.</div>
                                <%}
                                
                            }
                         %>                        	                                                        
                        <form action="ActualizarEquiposC.jsp" method="post">                           
                                <input type="text" class="input-group input-group-sm" name="numI" style="width : 100px">
                                <button class="btn btn-default" type="submit">Buscar</button>                            
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
