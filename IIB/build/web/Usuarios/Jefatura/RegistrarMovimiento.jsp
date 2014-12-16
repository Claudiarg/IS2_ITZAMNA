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

                        <h2 id="bienvenido">Registar movimiento de equipo</h2>
                        <%
                 if(request.getParameter("action") != null){
                         String action = request.getParameter("action");
                         if(action.equals("true")){%>                                    
                        <div class="alert alert-success" role="alert"> Movimiento registrado de forma exitosa.</div>
                        <%}else{%>
                        <div class="alert alert-danger" role="alert">Se generó un fallo al registrar el movimiento. Vuelve a intentar.</div>
                        <%}
                          }%>
                        <%
                         if(request.getParameter("error") != null){
                                                 String action = request.getParameter("action");
                                                 if(action.equals("ENull")){%>                                    
                        <div class="alert alert-danger" role="alert"> Equipo asociado al movimiento no existe. Verifica el número de inventario del departamento de informática.</div>
                        <%}
                        }%>                    
                        
                        <form class ="formulario" class="form-horizontal" role="form" action="./validacion/RegistrarMovimientoV.jsp" method="get">
                            <label>Folio</label>                               
                            <input type="text" name="folio" required title="Folio de registro de movimiento"> <br>

                            <label>Número de equipo.</label>
                            <input type="text" name="numEquipo" pattern ="[0-9]{6}" required title="Número de inventario del departamento de informática. 6 digitos"><br><br>

                            <label>Tipo de movimiento</label><br>    
                            <input type="radio" name="tipoMov" value="Descompostura o falla">Descompostura o falla<br>
                            <input type="radio" name="tipoMov" value="Baja">Baja<br>
                            <input type="radio" name="tipoMov" value="Desuso">Desuso<br>
                            <input type="radio" name="tipoMov" value="RenovacionCambio">Renovación/Cambio<br><br>

                            <label>Nombre de usuario:</label>                                
                            <input type="text" name="usuario"required><br><br>                         

                            <label>Departamento o Área:</label>
                            <input type="text" name="DepartamentoArea" required><br><br>

                            <label>Institución</label><br>
                            <input type="radio" name="institucion" value="IIB">IIB<br>
                            <input type="radio" name="institucion" value="BN">BN<br>
                            <input type="radio" name="institucion" value="HN">HN<br><br>

                            <label>Tipo de equipo</label><br>
                            <input type="radio" name="tipoEquipo" value="Impresora_Multifuncional">Impresora/Multifuncional<br>
                            <input type="radio" name="tipoEquipo" value="Nobreak_Regulador">No break / regulador<br>
                            <input type="radio" name="tipoEquipo" value="Escaner">Escaner<br>
                            <input type="radio" name="tipoEquipo" value="Telefono">Teléfono<br>
                            <input type="radio" name="tipoEquipo" value="CPU">CPU<br>
                            <input type="radio" name="tipoEquipo" value="EquipoCompleto">Equipo Completo<br>
                            <input type="radio" name="tipoEquipo" value="Monitor">Monitor<br>
                            <input type="radio"  name="tipoEquipo" value="Otro">Otro <input type="text" name="OtroI"  title="Especificación de tipo de equipo"><br><br> 
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
