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
                                    <ul>
                                        <li>
                                            <a href="RegistrarMovimiento.jsp">Registrar movimiento</a>
                                        </li>
                                        <li>
                                            <a href="AsignarEquipo.jsp">Asignar equipo (Alta)</a>
                                        </li>
                                    </ul>
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
                                                                        <ul>
                                        <li>
                                            <a href="ConsultaEstadoActual.jsp">Por estado actual</a>
                                        </li>
                                        <li>
                                            <a href="ConsultaSistemaOperativo.jsp">Por sistema operativo</a>
                                        </li>
                                        <li>
                                            <a href="ConsultaPorCatalogo.jsp">Por catálogo</a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="nivel1 primera">
                                    <a href="CambioContrasenia.jsp">Cambiar Contraseña</a>
                                </li>
                            </ul>
                            
                        </div>
                    </div>



                    <div id="main-content">	

                        <h2>Asignar equipo a un usuario</h2>
                        
                        <%
                 if(request.getParameter("action") != null){
                         String action = request.getParameter("action");
                         if(action.equals("true")){%>                                    
                        <div class="alert alert-success" role="alert">Asignación realizada.</div>
                        <%}else{%>
                        <div class="alert alert-danger" role="alert">Se generó un fallo al registrar la asignación. Vuelve a intentar.</div>
                        <%}
                          }%>
                        <%
                         if(request.getParameter("error") != null){
                                                 String action = request.getParameter("action");
                                                 if(action.equals("ENull")){%>                                    
                        <div class="alert alert-danger" role="alert"> Equipo asociado a la asignación no existe. Verifica el número de inventario del departamento de informática.</div>
                        <%}
                        }%> 
                        
                        <form class="form-horizontal" role="form" action="./validacion/AsignarEquipoV.jsp" method="get">
                            <label>Folio de movimiento</label>                               
                            <input type="text" name="folio" required title="Folio de registro de movimiento"> <br>
                            <label>Número de equipo</label>
                            <input type="text" name="numEquipo" pattern ="[0-9]{6}" required title="Número de inventario del departamento de informática. 6 digitos"><br>                           

                            <label>Clave activo fijo</label>
                            <input type="text" name="claveAF" required title="Clave activo fijo"><br>                                                                                                            
                            
                            <label>Placa</label>                               
                            <input type="text" name="placa" required title="Folio de registro de movimiento"> <br>
                            
                            <label>IP</label>                               
                            <input type="text" name="ip" required title="IP de equipo asignado"> <br>
                            
                            <label>Puerto</label>                               
                            <input type="text" name="puerto" required title="Puerto"> <br>
                            
                            <label>Nombre PC</label>                               
                            <input type="text" name="nombrePC" required title="nombrePC"> <br>
                            
                            <label>Grupo de trabajo</label>                               
                            <input type="text" name="grupoTrabajo" required title="Grupo de trabajo"> <br>
                            
                            <label>Sistema operativo</label>                               
                            <input type="text" name="so" required title="Sistema operativo"> <br>
                            
                            <label>Service Pack</label>                               
                            <input type="text" name="servicePack" required title="Service pack"> <br>

                            <label>Servidor antivirus </label>                               
                            <input type="text" name="servidorA" required title="Servidor antivirus"> <br>                            

                            <label>Version antivirus</label>                               
                            <input type="text" name="versionA" required title="Version antivirus"> <br>
                            
                            <label>Observer/Problemas</label>                               
                            <input type="text" name="observerP" required title="Observer/Problemas"> <br>
                            
                            <label>Segmento</label>                               
                            <input type="text" name="segmento" required title="Segmento"> <br>
                            
                            <label>Usuario</label>                               
                            <input type="text" name="usuario" required title="Usuario asignado"> <br>                            
                            
                            <label>Responsable de levantamiento</label>                               
                            <input type="text" name="responsableL" required title="Responsable de levantamiento"> <br>
                            
                            <label>Departamento o Área:</label>
                            <input type="text" name="DepartamentoArea" required><br>

                            <label>Institución</label><br>
                            <input type="radio" name="institucion" value="IIB">IIB<br>
                            <input type="radio" name="institucion" value="BN">BN<br>
                            <input type="radio" name="institucion" value="HN">HN<br>
                                                        
                            
                            <input type="hidden" name="tipoMov" value="AltaEquipo">
                            <input type="hidden" name="tipoEquipo" value="EquipoCompleto">                       

                            <button class="btn btn-default" type="submit">Guardar</button>                          
                            
                            
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
