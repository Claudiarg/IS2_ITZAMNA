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
public class Movimiento {
    
    private int idMovimiento;
    private int equipo;
    private int usuario;
    private String folio;
    private String tipoMovimiento;
    private String nombreUsuario;
    private String depto;
    private String institucion;
    private String tipoEquipo;
    private String fechaMovimiento;

    public Movimiento() throws ClassNotFoundException, SQLException {            
        ConexionBD c = new ConexionBD();
        c.conectarBD();        
        int idMov = 0;        
        String query = "insert into Movimiento (idMovimiento) values (0)";                
        boolean a = c.insertarBD(query);                
            query = "select max(idMovimiento) AS idMov FROM Movimiento";
            ResultSet r = c.consultarBD(query);
            while(r.next()){
               idMov = r.getInt(1);                
               System.out.println("Si ingrese a while para asignar el id en movimiento");
            }            
            this.idMovimiento = idMov;
        c.desconectarBD();
    }

    public Movimiento(int idMovimiento, int equipo, int usuario, String folio, String tipoMovimiento, String nombreUsuario, String depto, String institucion, String tipoEquipo, String fechaMovimiento) {
        this.idMovimiento = idMovimiento;
        this.equipo = equipo;
        this.usuario = usuario;
        this.folio = folio;
        this.tipoMovimiento = tipoMovimiento;
        this.nombreUsuario = nombreUsuario;
        this.depto = depto;
        this.institucion = institucion;
        this.tipoEquipo = tipoEquipo;
        this.fechaMovimiento = fechaMovimiento;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) throws ClassNotFoundException, SQLException {
        this.equipo = equipo;              
        int update;
        String query = "Update Movimiento set  equipo= " +equipo + " where idMovimiento= " + this.idMovimiento;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) throws ClassNotFoundException, SQLException {
        this.usuario = usuario;
        int update;
        String query = "Update Movimiento set  usuario= " +usuario + " where idMovimiento= " + this.idMovimiento;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) throws ClassNotFoundException, SQLException {
        this.folio = folio;
        int update;
        String query = "Update Movimiento set  folio= " +folio+ " where idMovimiento= " + this.idMovimiento;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) throws ClassNotFoundException, SQLException {
        this.tipoMovimiento = tipoMovimiento;             
        int update;
        String query = "Update Movimiento set  tipoMovimiento= '"+tipoMovimiento+"' where idMovimiento= " + this.idMovimiento;
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
        String query = "Update Movimiento set  nombreUsuario= '"+nombreUsuario+ "' where idMovimiento= " + this.idMovimiento;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) throws ClassNotFoundException, SQLException {
        this.depto = depto;
        int update;
        String query = "Update Movimiento set  deptoArea= '" +depto+ "' where idMovimiento= " + this.idMovimiento;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) throws ClassNotFoundException, SQLException {
        this.institucion = institucion;
        int update;
        String query = "Update Movimiento set  institucion= '" +institucion+ "' where idMovimiento= " + this.idMovimiento;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) throws ClassNotFoundException, SQLException {
        this.tipoEquipo = tipoEquipo;
        int update;
        String query = "Update Movimiento set  tipoEquipo= '"+tipoEquipo+"' where idMovimiento= " + this.idMovimiento;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

    public String getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento() throws ClassNotFoundException, SQLException {
        int update;
        String query = "Update Movimiento set  fechaMovimiento= CURDATE() where idMovimiento= " + this.idMovimiento;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();
    }

   
    
    
}
