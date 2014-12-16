/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author beth
 */
public class Altas {
    
    private int idAltas;
    private int movimiento;
    private int equipoaltas;
    private String claveActivoFijo;
    private String placa;
    private String ip;
    private String puerto;
    private String nombrePC;
    private String grupoTrabajo;
    private String sistemaOperativo;
    private String servicePack;
    private String servidorAntivirus;
    private String versionAntivirus;
    private String observProb;
    private String segmentos;
    private String nombreUsuario;
    private String responsableLev;

    public Altas() throws ClassNotFoundException, SQLException {
        ConexionBD c = new ConexionBD();
        c.conectarBD();        
        int idAlta = 0;        
        String query = "insert into Altas (idAltas) values (0);";
        boolean a = c.insertarBD(query);                
            query = "select max(idAltas) AS idA FROM Altas";
            ResultSet r = c.consultarBD(query);
            while(r.next()){
               idAlta = r.getInt(1);                
               System.out.println("Si ingrese a while para asignar el id en altas");
            }            
            this.idAltas = idAlta;
        c.desconectarBD();
    }

    public Altas(int idAltas, int movimiento, int equipoaltas, String claveActivoFijo) {
        this.idAltas = idAltas;
        this.movimiento = movimiento;
        this.equipoaltas = equipoaltas;
        this.claveActivoFijo = claveActivoFijo;
    }

    public int getIdAltas() {
        return idAltas;
    }

    public void setIdAltas(int idAltas) {
        this.idAltas = idAltas;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int movimiento) throws ClassNotFoundException, SQLException {
        this.movimiento = movimiento;             
        int update;
        String query = "Update Altas set  movimiento= " +movimiento + " where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();
    }

    public int getEquipoaltas() {
        return equipoaltas;
    }

    public void setEquipoaltas(int equipoaltas) throws ClassNotFoundException, SQLException {
        this.equipoaltas= equipoaltas;
        int update;
        String query = "Update Altas set  equipoaltas= " +equipoaltas + " where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();
    }

    public String getClaveActivoFijo() {
        return claveActivoFijo;
    }

    public void setClaveActivoFijo(String claveActivoFijo) throws ClassNotFoundException, SQLException {
        this.claveActivoFijo = claveActivoFijo;
        int update;
        String query = "Update Altas set claveActivoFijo = '" +claveActivoFijo + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getPlaca() {
        return placa;
        
    }

    public void setPlaca(String placa) throws ClassNotFoundException, SQLException {
        this.placa = placa;
        int update;
        String query = "Update Altas set placa = '" +placa + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
        
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) throws ClassNotFoundException, SQLException {
        this.ip = ip;
        int update;
        String query = "Update Altas set ip = '" +ip + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) throws ClassNotFoundException, SQLException {
        this.puerto = puerto;
        int update;
        String query = "Update Altas set puerto = '" +puerto + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getNombrePC() {
        return nombrePC;
    }

    public void setNombrePC(String nombrePC) throws ClassNotFoundException, SQLException {
        this.nombrePC = nombrePC;
        int update;
        String query = "Update Altas set nombrePC = '" +nombrePC+ "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getGrupoTrabajo() {
        return grupoTrabajo;
    }

    public void setGrupoTrabajo(String grupoTrabajo) throws ClassNotFoundException, SQLException {
        this.grupoTrabajo = grupoTrabajo;
        int update;
        String query = "Update Altas set grupoTrabajo = '" +grupoTrabajo + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) throws ClassNotFoundException, SQLException {
        this.sistemaOperativo = sistemaOperativo;
        int update;
        String query = "Update Altas set claveActivoFijo = '" +claveActivoFijo + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getServicePack() {
        return servicePack;
    }

    public void setServicePack(String servicePack) throws ClassNotFoundException, SQLException {
        this.servicePack = servicePack;
        int update;
        String query = "Update Altas set servicePack = '" +servicePack+ "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getServidorAntivirus() {
        return servidorAntivirus;
    }

    public void setServidorAntivirus(String servidorAntivirus) throws ClassNotFoundException, SQLException {
        this.servidorAntivirus = servidorAntivirus;
        int update;
        String query = "Update Altas set servidorAntivirus = '" +servidorAntivirus + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getVersionAntivirus() {
        return versionAntivirus;
    }

    public void setVersionAntivirus(String versionAntivirus) throws ClassNotFoundException, SQLException {
        this.versionAntivirus = versionAntivirus;
        int update;
        String query = "Update Altas set  versionAntivirus= '" +versionAntivirus+ "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getObservProb() {
        return observProb;
    }

    public void setObservProb(String observProb) throws ClassNotFoundException, SQLException {
        this.observProb = observProb;
        int update;
        String query = "Update Altas set observP = '" +observProb+ "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(String segmentos) throws ClassNotFoundException, SQLException {
        this.segmentos = segmentos;
        int update;
        String query = "Update Altas set segmentos = '" +segmentos+ "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) throws ClassNotFoundException, SQLException {
        this.nombreUsuario = nombreUsuario;
        int update;
        String query = "Update Altas set  nombreUsuario= '" +nombreUsuario + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getResponsableLev() {
        return responsableLev;
    }

    public void setResponsableLev(String responsableLev) throws ClassNotFoundException, SQLException {
        this.responsableLev = responsableLev;
        int update;
        String query = "Update Altas set responsableLevantamiento = '"+responsableLev +"' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }
    
    
    
}
