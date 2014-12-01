<%-- 
    Document   : AsignarEquipoV
    Created on : 27/11/2014, 10:53:03 AM
    Author     : clau
--%>

<%@page import="Controlador.Altas"%>
<%@page import="java.sql.SQLException"%>
<%@page import="Controlador.Movimiento"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Conexion.ConexionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
   //try{
    int numInf =  Integer.parseInt(request.getParameter("numEquipo").trim());
    int idEquipo= 0;
    System.out.println("numero de equipo es : "+numInf);
    /*Equipo e = new Equipo(numInf); */
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        String query = "select * from Equipo where numInformatica =" + numInf + ";";        
        ResultSet r = conexion.consultarBD(query);        
        while (r.next()) {
            idEquipo = r.getInt(1);
        }
    System.out.println("El id del equipo es: "+idEquipo);    
    if(idEquipo == 0){//si el contador es 0 entonces no se creó el equpo
        response.sendRedirect("AsignarEquipo.jsp?error=ENull");
        System.out.println("no encontré el equipo");
    }else{
        System.out.println("si entré a movimiento");        
        Movimiento m = new Movimiento();
        System.out.println("si generé el movimiento");
        m.setEquipo(numInf);
        System.out.println("asigne el numero de inf");
        m.setFolio(request.getParameter("folio"));
        System.out.println("si  asigne el folio");
        m.setTipoMovimiento(request.getParameter("tipoMov"));        
        System.out.println("si asigne el tipo de mov");
        m.setDepto(request.getParameter("DepartamentoArea"));
        System.out.println("si asigne departamento");
        m.setInstitucion(request.getParameter("institucion"));
        System.out.println("si asigne isntitucion");
        m.setTipoEquipo(request.getParameter("tipoEquipo"));
        System.out.println("tipo Equipo");
        m.setFechaMovimiento();
        System.out.println("si asigne la fecha");
        /*Generar alta*/        
        System.out.println("id movimiento : "+m.getIdMovimiento());        
        Altas a = new Altas ();
        a.setMovimiento(m.getIdMovimiento());
        a.setEquipoaltas(idEquipo);
        a.setClaveActivoFijo(request.getParameter("claveAF"));
        a.setPlaca(request.getParameter("placa"));
        a.setIp(request.getParameter("ip"));
        a.setNombrePC(request.getParameter("nombrePC"));
        a.setGrupoTrabajo("grupoTrabajo");
        a.setSistemaOperativo(request.getParameter("so"));
        a.setServicePack(request.getParameter("servicePack"));
        a.setServidorAntivirus(request.getParameter("servidorA"));
        a.setObservProb(request.getParameter("observerP"));
        a.setSegmentos(request.getParameter("segmento"));
        a.setNombreUsuario(request.getParameter("usuario"));
        a.setResponsableLev(request.getParameter("responsableL")); 
        
        response.sendRedirect("AsignarEquipo.jsp?action=true");
        System.out.println("asigne equipo");
    }
//}catch(SQLException s){
    
 //       response.sendRedirect("AsignarEquipo.jsp?action=false");  
//}  //
%>
