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
    private String grupoUsuario;
    private String responsableLev;

    public Altas() {
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

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public int getEquipoaltas() {
        return equipoaltas;
    }

    public void setEquipoaltas(int equipoaltas) {
        this.equipoaltas = equipoaltas;
    }

    public String getClaveActivoFijo() {
        return claveActivoFijo;
    }

    public void setClaveActivoFijo(String claveActivoFijo) {
        this.claveActivoFijo = claveActivoFijo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getNombrePC() {
        return nombrePC;
    }

    public void setNombrePC(String nombrePC) {
        this.nombrePC = nombrePC;
    }

    public String getGrupoTrabajo() {
        return grupoTrabajo;
    }

    public void setGrupoTrabajo(String grupoTrabajo) {
        this.grupoTrabajo = grupoTrabajo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getServicePack() {
        return servicePack;
    }

    public void setServicePack(String servicePack) {
        this.servicePack = servicePack;
    }

    public String getServidorAntivirus() {
        return servidorAntivirus;
    }

    public void setServidorAntivirus(String servidorAntivirus) {
        this.servidorAntivirus = servidorAntivirus;
    }

    public String getVersionAntivirus() {
        return versionAntivirus;
    }

    public void setVersionAntivirus(String versionAntivirus) {
        this.versionAntivirus = versionAntivirus;
    }

    public String getObservProb() {
        return observProb;
    }

    public void setObservProb(String observProb) {
        this.observProb = observProb;
    }

    public String getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(String segmentos) {
        this.segmentos = segmentos;
    }

    public String getGrupoUsuario() {
        return grupoUsuario;
    }

    public void setGrupoUsuario(String grupoUsuario) {
        this.grupoUsuario = grupoUsuario;
    }

    public String getResponsableLev() {
        return responsableLev;
    }

    public void setResponsableLev(String responsableLev) {
        this.responsableLev = responsableLev;
    }
    
    
    
}
