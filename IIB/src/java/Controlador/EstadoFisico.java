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
public class EstadoFisico {
    
    private int idEstadoFisico;
    private String descripcion;

    public EstadoFisico() {
    }

    public EstadoFisico(int idEstadoFisico, String descripcion) {
        this.idEstadoFisico = idEstadoFisico;
        this.descripcion = descripcion;
    }

    public int getIdEstadoFisico() {
        return idEstadoFisico;
    }

    public void setIdEstadoFisico(int idEstadoFisico) {
        this.idEstadoFisico = idEstadoFisico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
