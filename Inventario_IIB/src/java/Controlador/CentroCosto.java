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
public class CentroCosto {
    
    private int idCentroCosto ;
    private String descripcion;

    public CentroCosto() {
    }

    public CentroCosto(int idCentroCosto, String descripcion) {
        this.idCentroCosto = idCentroCosto;
        this.descripcion = descripcion;
    }

    public int getIdCentroCosto() {
        return idCentroCosto;
    }

    public void setIdCentroCosto(int idCentroCosto) {
        this.idCentroCosto = idCentroCosto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
