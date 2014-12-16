<%-- 
    Document   : GuardarEquipo
    Created on : 23/11/2014, 01:04:52 PM
    Author     : clau
--%>


<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page session = "true" %>
<%@page import="Controlador.Equipo" %>
<%@page import="Conexion.ConexionBD" %>
<%
        Equipo e;
        String invInf = request.getParameter("invInf").trim();
        String nuevo = request.getParameter("create");
    try {
        if (nuevo.equals("true")) {
            e = new Equipo();
            e.setNumInformatica(Integer.parseInt(invInf));
        } else {
            e = new Equipo(Integer.parseInt(invInf));
        }

        if (request.getParameter("invUNAM") != " " || request.getParameter("invUNAM") != null) {
            e.setNumUNAM(Integer.parseInt(request.getParameter("invUNAM")));
            System.out.println("Valor invUNAM es:" + request.getParameter("invUNAM"));
            System.out.println("Ingresé valor de invUNAM");
        }
        if (request.getParameter("numInvD") != "" || request.getParameter("numInvD") != null) {
            e.setNumDepto(Integer.parseInt(request.getParameter("numInvD")));
            System.out.println("Valor numInvD es:" + request.getParameter("numInvD"));
            System.out.println("Ingresé valor de invUNAM");
        }
        if (request.getParameter("descripcion") != "" || request.getParameter("descripcion") != null) {
            e.setDescripcion(request.getParameter("descripcion"));
            System.out.println("Valor descripcion es:" + request.getParameter("descripcion"));
            System.out.println("Ingresé valor de descripcion");
        }
        if (request.getParameter("fechaReg") != "" || request.getParameter("fechaReg") != null) {
            e.setFechaRegistro(request.getParameter("fechaReg"));
            System.out.println("Valor fechaReg es:" + request.getParameter("fechaReg"));
            System.out.println("Ingresé valor de fechaReg");
        }
        if (request.getParameter("fechaRes") != "" || request.getParameter("fechaRes") != null) {
            e.setFechaResguardo(request.getParameter("fechaRes"));
            System.out.println("Valor fechaRes es:" + request.getParameter("fechaRes"));
            System.out.println("Ingresé valor de fechaRes");
        }
        if (request.getParameter("clase") != "" || request.getParameter("clase") != null) {
            e.setClase(Integer.parseInt(request.getParameter("clase")));
            System.out.println("Valor clase es:" + request.getParameter("clase"));
            System.out.println("Ingresé valor de clase");
        }
        if (request.getParameter("estadoF") != "" || request.getParameter("estadoF") != null) {
            e.setEstadoFisico(Integer.parseInt(request.getParameter("estadoF")));
            System.out.println("Valor estado es:" + request.getParameter("estadoF"));
            System.out.println("Ingresé valor de EstadoF");
        }
        if (request.getParameter("marca") != "" || request.getParameter("marca") != null) {
            e.setMarca(Integer.parseInt(request.getParameter("marca")));
            System.out.println("Valor marca es:" + request.getParameter("marca"));
            System.out.println("Ingresé valor de marca");
        }
        if (request.getParameter("modelo") != "" || request.getParameter("modelo") != null) {
            e.setModelo(Integer.parseInt(request.getParameter("modelo")));
            System.out.println("Valor modelo es:" + request.getParameter("modelo"));
            System.out.println("Ingresé valor de modelo");
        }
        if (request.getParameter("prov") != "" || request.getParameter("prov") != null) {
            e.setProveedor(Integer.parseInt(request.getParameter("prov")));
            System.out.println("Valor prov es:" + request.getParameter("prov"));
            System.out.println("Ingresé valor de prov");
        }
        if (request.getParameter("responsable") != "" || request.getParameter("responsable") != null) {
            e.setResponsable(Integer.parseInt(request.getParameter("responsable")));
            System.out.println("Valor responsable es:" + request.getParameter("responsable"));
            System.out.println("Ingresé valor de responsable");
        }
        if (request.getParameter("tipo") != "" || request.getParameter("tipo") != null) {
            e.setTipo(Integer.parseInt(request.getParameter("tipo")));
            System.out.println("Valor tipo es:" + request.getParameter("tipo"));
            System.out.println("Ingresé valor de tipo");
        }
        if (request.getParameter("ubicacion") != "" || request.getParameter("ubicacion") != null) {
            e.setUbicacion(Integer.parseInt(request.getParameter("ubicacion")));
            System.out.println("Valor ubicacion es:" + request.getParameter("ubicacion"));
            System.out.println("Ingresé valor de ubicacion");
        }
        if (request.getParameter("uso") != "" || request.getParameter("uso") != null) {
            e.setUso(Integer.parseInt(request.getParameter("uso")));
            System.out.println("Valor invUNAM es:" + request.getParameter("uso"));
            System.out.println("Ingresé valor de uso");
        }
        if(nuevo.equals("true")){        
        response.sendRedirect("../RegistrarEquipos.jsp?action=true"); 
        }
        else{
         response.sendRedirect("../ActualizarEquipos.jsp?action=true");
        }
    } catch (SQLException s) {
        if(nuevo.equals("true")){
            response.sendRedirect("../RegistrarEquipos.jsp?action=false");
        }else{
            response.sendRedirect("../ActualizarEquipos.jsp?action=false");
        }     
    }
%>


