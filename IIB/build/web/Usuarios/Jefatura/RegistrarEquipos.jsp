<%-- 
    Document   : Vista
    Created on : 12/10/2014, 10:54:09 PM
    Author     : beth
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Conexion.ConexionBD"%>
<%@page session = "true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Inventario</title>
        <link rel="stylesheet" media="screen" href=" ../../css/bootstrap.min.css" >
        <link rel="stylesheet" media="screen" href=" ../../css/bootstrap-theme.min.css" >
        <link rel="stylesheet" media="screen" href=" ../../css/bootstrap-datetimepicker.min.css" >
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

                        <h2 id="bienvenido">Registrar nuevo equipo.</h2>                                                                   
                        <%
                            if (request.getParameter("action") != null) {
                                String action = request.getParameter("action");
                                if (action.equals("true")) {%>                                    
                        <div style="width: 750px;text-align: center;margin-left: 50px;" class="alert alert-success" role="alert"> Equipo ingresado al sistema de forma exitosa</div>
                        <%} else {%>
                       <div  style="width: 750px;text-align: center;margin-left: 50px;" class="alert alert-danger" role="alert">Se generó un fallo al guardar el nuevo regístro Ingresa todos los valores de los campos. Vuelve a intentar.</div>
                        <%}
                            }%>
                        <!--apartado para mostrar las características del equipo-->  
                        <form class="formulario" class="form-horizontal" role="form" action="./validacion/GuardarEquipo.jsp" method="post">
                            <div id="equipo">
                                <section id ="izquierda">
                                    <input type="hidden" value="true" name="create">
                                    <p>Número de inventario informática:<span><input required type="text" pattern ="[0-9]{6}" class="input-group input-group-sm" name="invInf" style="width : 200px" value="" title="Campo de sólo números 6 dígitos" ></span></p>
                                    <p>Número de inventario UNAM <span><input type="text" pattern ="[0-9]{8}" class="input-group input-group-sm" name="invUNAM" style="width : 200px" value="" title="Campo de sólo números 8 dígitos" required></span></p>
                                    <p>Número de inventario departamento<span><input required type="text" class="input-group input-group-sm" name="numInvD" style="width : 200px"value="" title ="Campo de sólo números"></span></p>   
                                    <p>Descripción<span><input type="text" required class="input-group input-group-sm" name="descripcion" style="width : 200px"value="" title="Descripción del equipo"></span></p>
                                    <p>Serie<span><input type="text" required class="input-group input-group-sm" name="serie" style="width : 200px"value="" title="Número de serie"></span></p>                                   
                                    <p>Fecha de resgistro <span><input required type="text" title= "Formato de fecha: AAAA-MM-DD" class="input-group input-group-sm" name="fechaReg" style="width : 200px"value=""></span></p>                                                                        
                                    <p>Fecha de resguardo <span><input required type="text" title= "Formato de fecha: AAAA-MM-DD" class="input-group input-group-sm" name="fechaRes" style="width : 200px"value=""></span></p>                                                                        
                                    

                                

                                
                                    <%
                                        ConexionBD c = new ConexionBD();
                                        c.conectarBD();
                                        ResultSet r;
                                        String descripcion;
                                        int id;
                                    %>          

                                    <label>Clase:</label>
                                    <select class="form-control input-sm" name="clase" style =" width: 200px"><br>                                  
                                        <%
                                            r = c.consultarBD("SELECT * FROM Clase;");%>
                                        <option value="0"></option>
                                        <%while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);%>
                                        <option value="<%=id%>"><%=descripcion%></option>
                                        <%}%>                                        
                                    </select><br> 

                                    <label>Estado:</label>
                                    <select class="form-control input-sm" style="width: 200px" name="estado"><br>                                  
                                        <%
                                            r = c.consultarBD("SELECT * FROM Estado;");%>
                                        <option value=""></option>
                                        <%while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);%>                                                
                                        <option value="<%=id%>"><%=descripcion%></option>
                                        <%}%>
                                    </select><br>

                                    <label>Estado Físico:</label>
                                    <select class="form-control input-sm" style =" width: 200px" name="estadoF"><br>                                  
                                        <%
                                            r = c.consultarBD("SELECT * FROM EstadoFisico;");%>
                                        <option value="0"></option>
                                        <%while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);%>                                                
                                        <option value="<%=id%>"><%=descripcion%></option>
                                        <%}%>
                                    </select><br> 
                                    </section>
                                    
                                    <section id="derecha">

                                    <label>Familia:</label>
                                    <select class="form-control input-sm" style ="width: 200px" name="familia"><br>                                  
                                        <%
                                            r = c.consultarBD("SELECT * FROM Familia;");%>
                                        <option value="0"></option>
                                        <%while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);%>                                                
                                        <option value="<%=id%>"><%=descripcion%></option>
                                        <%}%>
                                    </select><br>

                                    <label>Marca:</label>
                                    <select class="form-control input-sm" style="width: 200px" name="marca"><br>                                  
                                        <%
                                            r = c.consultarBD("SELECT * FROM Marca;");%>
                                        <option value="0"></option>
                                        <%while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);%>                                                
                                        <option value="<%=id%>"><%=descripcion%></option>
                                        <%}%>
                                    </select><br> 

                                    <label>Modelo:</label>
                                    <select class="form-control input-sm"style="width: 200px" name="modelo"><br>                                  
                                        <%
                                            r = c.consultarBD("SELECT * FROM Modelo;");%>
                                        <option value="0"></option>
                                        <%while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);%>                                                
                                        <option value="<%=id%>"><%=descripcion%></option>
                                        <%}%>
                                    </select><br>    

                                    <label>Proveedor:</label>
                                    <select class="form-control input-sm" style="width: 200px" name="prov"><br>                                  
                                        <%
                                            r = c.consultarBD("SELECT * FROM Proveedor;");%>
                                        <option value="0"></option>
                                        <%while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);%>                                                
                                        <option value="<%=id%>"><%=descripcion%></option>
                                        <%}%>
                                    </select><br> 

                                    <label>Responsable:</label>
                                    <select class="form-control input-sm" style="width: 200px" name="responsable"><br>                                  
                                        <%
                                            r = c.consultarBD("SELECT * FROM Responsable;");%>
                                        <option value="0"></option>
                                        <%while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);%>                                                
                                        <option value="<%=id%>"><%=descripcion%></option>
                                        <%}%>
                                    </select><br>   

                                    <label>Tipo:</label>
                                    <select class="form-control input-sm" style="width: 200px" name="tipo"><br> 
                                        <%
                                            r = c.consultarBD("SELECT * FROM Tipo;");%>
                                        <option value="0"></option>
                                        <%while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);%>                                                
                                        <option value="<%=id%>"><%=descripcion%></option>
                                        <%}%>
                                    </select><br>


                                    <label>Ubicación:</label>
                                    <select class="form-control input-sm" style="width: 200px" name="ubicacion"><br>                                  
                                        <%
                                            r = c.consultarBD("SELECT * FROM Ubicacion;");%>
                                        <option value="0"></option>
                                        <%while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);%>                                                
                                        <option value="<%=id%>"><%=descripcion%></option>
                                        <%}%>
                                    </select><br>

                                    <label>Uso:</label>
                                    <select class="form-control input-sm" style="width: 200px" name="uso"><br>                                  
                                        <%
                                            r = c.consultarBD("SELECT * FROM Uso;");%>
                                        <option value="0"></option>
                                        <%while (r.next()) {
                                                id = r.getInt(1);
                                                descripcion = r.getString(2);%>                                                
                                        <option value="<%=id%>"><%=descripcion%></option>
                                        <%}%>
                                    </select><br>                                     
                                    <%c.desconectarBD();%>      
                                    <button class="btn btn-default" type="submit">Guardar</button>          
                                </section>                                  
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
        <script type="text/javascript" src="../../js/jquery-1.8.3.min.js"></script>   
        <script type="text/javascript" src="../../js/bootstrap-datetimepicker.js"></script>
        <script type="text/javascript" src="../../js/bootstrap-datetimepicker.es.js" charset="UTF-8"></script>
        <script src=" ../../js/bootstrap.min.js"></script>
        <script src=" ../../js/lightbox.js"></script>
        <script src=" ../../js/async_content.js"></script>
        <script src=" ../../js/async-consulta.js"></script>
        <script src=" ../../js/async_contact.js"></script>
        <script type="text/javascript">
            $('.form_date').datetimepicker({
                language: 'es',
                weekStart: 1,
                todayBtn: 1,
                autoclose: 1,
                todayHighlight: 1,
                startView: 2,
                minView: 2,
                forceParse: 0
            });
        </script>



    </body>
</html>
