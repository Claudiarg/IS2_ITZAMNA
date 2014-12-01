<%-- 
    Document   : RegistrarMovimientoV
    Created on : 27/11/2014, 08:43:47 AM
    Author     : clau
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Conexion.ConexionBD"%>
<%@page import="Controlador.Movimiento"%>
<%@page import="java.sql.SQLException"%>
<%@page import="Controlador.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  try{
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
        response.sendRedirect("RegistrarMovimiento.jsp?error=ENull");
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
        response.sendRedirect("RegistrarMovimiento.jsp?action=true");
        System.out.println("registré el equipo");
    }
}catch(SQLException s){
    
        response.sendRedirect("RegistrarMovimiento.jsp?action=false");  
}
    
    
%>
