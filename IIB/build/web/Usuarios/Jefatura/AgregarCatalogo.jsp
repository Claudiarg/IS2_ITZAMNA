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

                        <%
                            if (request.getParameter("v") != null) {
                        %>
                        <div class="alert alert-success" role="alert"><p style="text-align:center">
                                <b>Se agrego exitosamente.</b></p></div>
                        <%
                            }
                        %>
                        
                        <h3 style='text-align: center'>Elige el nombre del Catálogo:</h3>

                        <form class="form-horizontal" action="AgregarEementoV.jsp" method="post">
                            <div class="form-group">
                                <select name="tabla" style='margin-left: 309px; width: 180px; height: 35px'>
                                    <option value="CentroDeCosto">Centro de Costo</option>
                                    <option value="Clase">Clase</option>
                                    <option value="Estado">Estado</option>
                                    <option value="EstadoFisico">Estado Físico</option>
                                    <option value="Familia">Familia</option>
                                    <option value="Marca">Marca</option>
                                    <option value="Modelo">Modelo</option>
                                    <option value="NivelObsolescencia">Nivel Obsolescencia</option>
                                    <option value="Proveedor">Proveedor</option>
                                    <option value="Responsable">Responsable</option>
                                    <option value="Tipo">Tipo</option>
                                    <option value="Ubicacion">Ubicación</option>
                                    <option value="Uso">Uso</option>                                    
                                </select><br>

                                <h3 style='margin-left: 309px'>Nombre del Nuevo Elemento:</h3>
                                <input style='margin-left: 309px'type="text" name="nuevo" required><br><br>
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
        <script src=" ../../js/jquery.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src=" ../../js/bootstrap.min.js"></script>
        <script src=" ../../js/lightbox.js"></script>
        <script src=" ../../js/async_content.js"></script>
        <script src=" ../../js/async-consulta.js"></script>
        <script src=" ../../js/async_contact.js"></script>



    </body>
</html>
