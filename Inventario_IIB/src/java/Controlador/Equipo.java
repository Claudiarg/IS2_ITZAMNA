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
public class Equipo {
    
    private int idEquipo;
    private int numInformatica;
    private int numUNAM;
    private int numDepto;
    private String descripcion;
    private int marca;
    private int modelo;
    private String serie;
    private int familia;
    private int tipo;
    private int proveedor;
    private String fechaRegistro;
    private int clase;
    private int uso;
    private int nivel;
    private int estadoFisico;
    private int ubicacion;
    private int responsable;
    private String fechaResguardo ;
    private int centroCosto;
    private int estado;

    public Equipo() {
    }

    public Equipo(int idEquipo, int numInformatica, int numUNAM, int numDepto, String descripcion, int marca, int modelo, String serie, int familia, int tipo, int proveedor, String fechaRegistro, int clase, int uso, int nivel, int estadoFisico, int ubicacion, int responsable, String fechaResguardo, int centroCosto, int estado) {
        this.idEquipo = idEquipo;
        this.numInformatica = numInformatica;
        this.numUNAM = numUNAM;
        this.numDepto = numDepto;
        this.descripcion = descripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.familia = familia;
        this.tipo = tipo;
        this.proveedor = proveedor;
        this.fechaRegistro = fechaRegistro;
        this.clase = clase;
        this.uso = uso;
        this.nivel = nivel;
        this.estadoFisico = estadoFisico;
        this.ubicacion = ubicacion;
        this.responsable = responsable;
        this.fechaResguardo = fechaResguardo;
        this.centroCosto = centroCosto;
        this.estado = estado;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getNumInformatica() {
        return numInformatica;
    }

    public void setNumInformatica(int numInformatica) {
        this.numInformatica = numInformatica;
    }

    public int getNumUNAM() {
        return numUNAM;
    }

    public void setNumUNAM(int numUNAM) {
        this.numUNAM = numUNAM;
    }

    public int getNumDepto() {
        return numDepto;
    }

    public void setNumDepto(int numDepto) {
        this.numDepto = numDepto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public int getUso() {
        return uso;
    }

    public void setUso(int uso) {
        this.uso = uso;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(int estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getResponsable() {
        return responsable;
    }

    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }

    public String getFechaResguardo() {
        return fechaResguardo;
    }

    public void setFechaResguardo(String fechaResguardo) {
        this.fechaResguardo = fechaResguardo;
    }

    public int getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(int centroCosto) {
        this.centroCosto = centroCosto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    
}
