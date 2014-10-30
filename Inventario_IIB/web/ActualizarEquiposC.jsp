<%-- 
    Document   : ActualizarEquiposC
    Created on : 30/10/2014, 10:23:35 AM
    Author     : clau
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Conexion.ConexionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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


            </div>
        </div>

        <div id="main">

            <div id="main-container" class="container-fluid" role="main">

                <div id="main-title" class="page-header">
                    <h1><small>Administrador</small> </h1>
                </div>

                <div id="content">                                  
                    <div id="main-content">	

                        <h2>Actualizar equipo.</h2>
                        <%
                            int idE = 0, marca = 0, modelo = 0, familia = 0, tipo = 0, prov = 0, clase = 0, uso = 0, nivelO = 0,
                                    estadoF = 0, ub = 0, resp = 0, centroC = 0, estado = 0, invInfBD = 0, invUNAM = 0, numInv = 0;
                            String serie = "", fechaReg = "", fechaRes = "", descripcion = "", mensaje = "";
                            ConexionBD conexion = new ConexionBD();
                            String get = request.getParameter("numI");
                            conexion.conectarBD();
                            String query = "select * from Equipo where numInformatica =" + get + ";";
                            ResultSet r = conexion.consultarBD(query);
                            while (r.next()) {
                                idE = r.getInt(1);
                                invInfBD = r.getInt(2);
                                invUNAM = r.getInt(3);
                                numInv = r.getInt(4);
                                descripcion = r.getString(5);
                                marca = r.getInt(6);
                                modelo = r.getInt(7);
                                serie = r.getString(8);
                                familia = r.getInt(9);
                                tipo = r.getInt(10);
                                prov = r.getInt(11);
                                fechaReg = r.getString(12);
                                clase = r.getInt(13);
                                uso = r.getInt(14);
                                nivelO = r.getInt(15);
                                estadoF = r.getInt(16);
                                ub = r.getInt(17);
                                resp = r.getInt(18);
                                fechaRes = r.getString(19);
                                centroC = r.getInt(20);
                                estado = r.getInt(21);
                            }
                        %>                    
                        <form action="ActualizarEquipos.jsp" method="post">
                            <div>
                                <p>Número de inventario informática <span><input type="text" class="input-group input-group-sm" name="invInf" style="width : 200px" value="<%=invInfBD%>"></span></p>
                                <p>Número de inventario UNAM <span><input type="text" class="input-group input-group-sm" name="invUNAM" style="width : 200px" value="<%=invUNAM%>"></span></p>
                                <p>Número de inventario departamento<span><input type="text" class="input-group input-group-sm" name="numInv" style="width : 200px"value="<%=numInv%>"></span></p>   
                                <p>Descripción<span><input type="text" class="input-group input-group-sm" name="descripción" style="width : 200px"value="<%=descripcion%>"></span></p>

                                <p>Serie<span><input type="text" class="input-group input-group-sm" name="serie" style="width : 200px"value="<%=serie%>"></span></p>
                                <p>Fecha de registro<span><input type="text" class="input-group input-group-sm" name="fechaReg" style="width : 200px"value="<%=fechaReg%>"></span></p>
                                <p>Fecha de resguardo <span><input type="text" class="input-group input-group-sm" name="" style="width : 200px"value="<%=fechaRes%>"></span></p>
                                        <%
                                            ConexionBD con = new ConexionBD();
                                            con.conectarBD();

                                            r = conexion.consultarBD("SELECT * FROM Clase;");

                                            String clase1;
                                            int idclase;
                                        %><label>Clase:</label><br>
                                <select name="clase"><br>
                                    <option value=""></option>
                                    <%
                                         while (r.next()) {
                                             idclase = r.getInt(1);
                                             clase1 = r.getString(2);%>
                                    <option value="<%=idclase%>"><%=clase%></option>
                                    <%
                                        }
                                    %></select><br><%
                                    r = con.consultarBD("SELECT * FROM Estado;");

                                    String estado1;
                                    int idestado;
                                    %><label>Estado:</label><br>
                                <select name="estado" style="text-align: center" style="float: right"><br>
                                    
                                    <%
                                         while (r.next()) {
                                             idestado = r.getInt(1);
                                             estado1 = r.getString(2);%>
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
                                         while (r.next()) {
                                             idfisico = r.getInt(1);
                                             fisico = r.getString(2);%>
                                    <option value="<%=idfisico%>"><%=fisico%></option>
                                    <%
                                        }
                                    %></select><br><%
                                    r = con.consultarBD("SELECT * FROM Familia;");

                                    String familia1;
                                    int idfamilia;
                                    %><label>Familia:</label><br>
                                <select name="familia" style="text-align: center"><br>
                                    <option value=""></option>
                                    <%
                                         while (r.next()) {
                                             idfamilia = r.getInt(1);
                                             familia1 = r.getString(2);%>
                                    <option value="<%=idfamilia%>"><%=familia%></option>
                                    <%
                                        }
                                    %></select><br><%
                                    r = con.consultarBD("SELECT * FROM Marca;");

                                    String marca1;
                                    int idmarca;
                                    %><label>Marca:</label><br>
                                <select name="marca" style="text-align: center"><br>
                                    <option value=""></option>
                                    <%
                                         while (r.next()) {
                                             idmarca = r.getInt(1);
                                             marca1 = r.getString(2);%>
                                    <option value="<%=idmarca%>"><%=marca%></option>
                                    <%
                                        }
                                    %></select><br><%
                                    r = con.consultarBD("SELECT * FROM Modelo;");

                                    String modelo1;
                                    int idmodelo;
                                    %><label class="der">Modelo:</label><br>
                                <select class="der" name="modelo" ><br>
                                    <option value=""></option>
                                    <%
                                         while (r.next()) {
                                             idmodelo = r.getInt(1);
                                             modelo1 = r.getString(2);%>
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
                                         while (r.next()) {
                                             idproveedor = r.getInt(1);
                                             proveedor = r.getString(2);%>
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
                                         while (r.next()) {
                                             idresponsable = r.getInt(1);
                                             responsable = r.getString(2);%>
                                    <option value="<%=idresponsable%>"><%=responsable%></option>
                                    <%
                                        }
                                    %></select><br><%
                                    r = con.consultarBD("SELECT * FROM Tipo;");

                                    String tipo1;
                                    int idtipo;
                                    %><label>Tipo:</label><br>
                                <select name="tipo" style="text-align: center"><br>
                                    <option value=""></option>
                                    <%
                                         while (r.next()) {
                                             idtipo = r.getInt(1);
                                             tipo1 = r.getString(2);%>
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
                                         while (r.next()) {
                                             idubicacion = r.getInt(1);
                                             ubicacion = r.getString(2);%>
                                    <option value="<%=idubicacion%>"><%=ubicacion%></option>
                                    <%
                                        }
                                    %></select><br><%
                                    r = con.consultarBD("SELECT * FROM Uso;");

                                    String uso1;
                                    int iduso;
                                    %><label>Uso:</label><br>
                                <select name="uso" style="text-align: center"><br>
                                    <option value=""></option>
                                    <%
                                         while (r.next()) {
                                             iduso = r.getInt(1);
                                             uso1 = r.getString(2);%>
                                    <option value="<%=iduso%>"><%=uso%></option>
                                    <%
                                        }
                                    %></select><br><%
                                    con.desconectarBD();


                                    %>                                
                            </div>
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
        <script src=" js/jquery.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src=" js/bootstrap.min.js"></script>
        <script src=" js/lightbox.js"></script>
        <script src=" js/async_content.js"></script>
        <script src=" js/async-consulta.js"></script>
        <script src=" js/async_contact.js"></script>



    </body>
</html>
