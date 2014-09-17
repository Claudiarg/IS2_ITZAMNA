/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author clau
 */
@Named(value = "adminEquipo")
@SessionScoped
public class AdminEquipo implements Serializable {

    private String NumInvInternoInformatica;
    private String NumInvUNAM;
    private String NumInvInternoDeptoInv;
    private String Descripcion;
    private String Marca;
    private String Modelo;
    private String Serie;
    private String Familia;
    private String Tipo;
    private String Proveedor;
    private String FechaRegistro;
    private String Clase;
    private String Uso;
    private String NivelObsolescencia;
    private String EstadoFisico;
    private String Departamento;
    private String Ubicacion;
    private String Responsable;
    private String FechaResguardo;
    /**
     * Creates a new instance of AdminEquipo
     */
    public AdminEquipo() {
    }

    public String getNumInvInternoInformatica() {
        return NumInvInternoInformatica;
    }

    public void setNumInvInternoInformatica(String NumInvInternoInformatica) {
        this.NumInvInternoInformatica = NumInvInternoInformatica;
    }

    public String getNumInvUNAM() {
        return NumInvUNAM;
    }

    public void setNumInvUNAM(String NumInvUNAM) {
        this.NumInvUNAM = NumInvUNAM;
    }

    public String getNumInvInternoDeptoInv() {
        return NumInvInternoDeptoInv;
    }

    public void setNumInvInternoDeptoInv(String NumInvInternoDeptoInv) {
        this.NumInvInternoDeptoInv = NumInvInternoDeptoInv;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getFamilia() {
        return Familia;
    }

    public void setFamilia(String Familia) {
        this.Familia = Familia;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public String getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(String FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public String getUso() {
        return Uso;
    }

    public void setUso(String Uso) {
        this.Uso = Uso;
    }

    public String getNivelObsolescencia() {
        return NivelObsolescencia;
    }

    public void setNivelObsolescencia(String NivelObsolescencia) {
        this.NivelObsolescencia = NivelObsolescencia;
    }

    public String getEstadoFisico() {
        return EstadoFisico;
    }

    public void setEstadoFisico(String EstadoFisico) {
        this.EstadoFisico = EstadoFisico;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

    public String getFechaResguardo() {
        return FechaResguardo;
    }

    public void setFechaResguardo(String FechaResguardo) {
        this.FechaResguardo = FechaResguardo;
    }
    
    
    
}
