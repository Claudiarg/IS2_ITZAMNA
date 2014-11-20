/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

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

    public Movimiento() {
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

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public String getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(String fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

   
    
    
}
