<%-- 
    Document   : GuardarEquipo
    Created on : 23/11/2014, 01:04:52 PM
    Author     : clau
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page session = "true" %>
<%@page import="Controlador.Equipo" %>
<%@page import="Conexion.ConexionBD" %>
<%
    String invInf = request.getParameter("invInf").trim();
    
    Equipo e = new Equipo (Integer.parseInt(invInf));    
    e.setNumUNAM(Integer.parseInt(request.getParameter("invUNAM")));
    e.setNumDepto(Integer.parseInt(request.getParameter("numInvD")));
    e.setDescripcion(request.getParameter("descripcion"));
    e.setFechaRegistro(request.getParameter("fechaReg"));
    e.setFechaResguardo(request.getParameter("fechaRes"));
    e.setClase(Integer.parseInt(request.getParameter("clase")));
    e.setEstado(Integer.parseInt(request.getParameter("estado")));
    e.setEstadoFisico(Integer.parseInt(request.getParameter("estadoF")));
    e.setMarca(Integer.parseInt(request.getParameter("marca")));
    e.setModelo(Integer.parseInt(request.getParameter("modelo")));
    e.setProveedor(Integer.parseInt(request.getParameter("prov")));
    e.setResponsable(Integer.parseInt(request.getParameter("responsable")));
    e.setTipo(Integer.parseInt(request.getParameter("tipo")));
    e.setUbicacion(Integer.parseInt(request.getParameter("ubicacion")));
    e.setUso(Integer.parseInt(request.getParameter("uso")));
    
    /*        
    String invUNAM = request.getParameter("invUNAM").trim();
    String numInvD = request.getParameter("numInvD").trim();
    String Descripcion = request.getParameter("descripcion").trim();
    String serie = request.getParameter("serie").trim();
    String fechaReg = request.getParameter("fechaReg").trim();
    String fechaRes = request.getParameter("fechaRes").trim();
    int clase = Integer.parseInt(request.getParameter("clase"));
  */
%>
        

