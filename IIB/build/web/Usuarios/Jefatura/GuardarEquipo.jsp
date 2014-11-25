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
    try {
        String invInf = request.getParameter("invInf").trim();

        Equipo e = new Equipo(Integer.parseInt(invInf));
        if (request.getParameter("invUNAM") != "" || request.getParameter("invUNAM") != null) {
            e.setNumUNAM(Integer.parseInt(request.getParameter("invUNAM")));
        }
        if (request.getParameter("numInvD") != "" || request.getParameter("numInvD") != null) {
            e.setNumDepto(Integer.parseInt(request.getParameter("numInvD")));
        }
        if (request.getParameter("descripcion") != "" || request.getParameter("descripcion") != null) {
            e.setDescripcion(request.getParameter("descripcion"));
        }
        if (request.getParameter("fechaReg") != "" || request.getParameter("fechaReg") != null) {
            e.setFechaRegistro(request.getParameter("fechaReg"));
        }
        if (request.getParameter("fechaRes") != "" || request.getParameter("fechaRes") != null) {
            e.setFechaResguardo(request.getParameter("fechaRes"));
        }
        if (request.getParameter("clase") != "" || request.getParameter("clase") != null) {
            e.setClase(Integer.parseInt(request.getParameter("clase")));
        }
        if (request.getParameter("estado") != "" || request.getParameter("estado") != null) {
            e.setEstado(Integer.parseInt(request.getParameter("estado")));
        }
        if (request.getParameter("estadoF") != "" || request.getParameter("estadoF") != null) {
            e.setEstadoFisico(Integer.parseInt(request.getParameter("estadoF")));
        }
        if (request.getParameter("marca") != "" || request.getParameter("marca") != null) {
            e.setMarca(Integer.parseInt(request.getParameter("marca")));
        }
        if (request.getParameter("modelo") != "" || request.getParameter("modelo") != null) {
            e.setModelo(Integer.parseInt(request.getParameter("modelo")));
        }
        if (request.getParameter("prov") != "" || request.getParameter("prov") != null) {
            e.setProveedor(Integer.parseInt(request.getParameter("prov")));
        }
        if (request.getParameter("responsable") != "" || request.getParameter("responsable") != null) {
            e.setResponsable(Integer.parseInt(request.getParameter("responsable")));
        }
        if (request.getParameter("tipo") != "" || request.getParameter("tipo") != null) {
            e.setTipo(Integer.parseInt(request.getParameter("tipo")));
        }
        if (request.getParameter("ubicacion") != "" || request.getParameter("ubicacion") != null) {
            e.setUbicacion(Integer.parseInt(request.getParameter("ubicacion")));
        }
        if (request.getParameter("uso") != "" || request.getParameter("uso") != null) {
            e.setUso(Integer.parseInt(request.getParameter("uso")));
        }
        response.sendRedirect("ActualizarEquipos.jsp?action=true");
    } catch (SQLException s) {
        response.sendRedirect("ActualizarEquipos.jsp?action=false");

    }

%>


