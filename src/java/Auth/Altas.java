/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Auth;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mangekyou
 */
@Entity
@Table(name = "Altas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Altas.findAll", query = "SELECT a FROM Altas a")})
public class Altas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAltas", nullable = false)
    private Integer idAltas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "claveActivoFijo", nullable = false, length = 45)
    private String claveActivoFijo;
    @Size(max = 45)
    @Column(name = "placa", length = 45)
    private String placa;
    @Size(max = 20)
    @Column(name = "ip", length = 20)
    private String ip;
    @Size(max = 20)
    @Column(name = "puerto", length = 20)
    private String puerto;
    @Size(max = 45)
    @Column(name = "nombrePC", length = 45)
    private String nombrePC;
    @Size(max = 45)
    @Column(name = "grupoTrabajo", length = 45)
    private String grupoTrabajo;
    @Size(max = 60)
    @Column(name = "sistemaOperativo", length = 60)
    private String sistemaOperativo;
    @Size(max = 45)
    @Column(name = "servicePack", length = 45)
    private String servicePack;
    @Size(max = 70)
    @Column(name = "servidorAntivirus", length = 70)
    private String servidorAntivirus;
    @Size(max = 70)
    @Column(name = "versionAntivirus", length = 70)
    private String versionAntivirus;
    @Size(max = 200)
    @Column(name = "problemas", length = 200)
    private String problemas;
    @Size(max = 45)
    @Column(name = "segmentos", length = 45)
    private String segmentos;
    @Size(max = 100)
    @Column(name = "nombreUsuario", length = 100)
    private String nombreUsuario;
    @Size(max = 100)
    @Column(name = "responsableLevantamiento", length = 100)
    private String responsableLevantamiento;
    @JoinColumn(name = "equipoaltas", referencedColumnName = "idEquipo", nullable = false)
    @ManyToOne(optional = false)
    private Equipo equipoaltas;
    @JoinColumn(name = "movimiento", referencedColumnName = "idMovimiento", nullable = false)
    @ManyToOne(optional = false)
    private Movimiento movimiento;

    public Altas() {
    }

    public Altas(Integer idAltas) {
        this.idAltas = idAltas;
    }

    public Altas(Integer idAltas, String claveActivoFijo) {
        this.idAltas = idAltas;
        this.claveActivoFijo = claveActivoFijo;
    }

    public Integer getIdAltas() {
        return idAltas;
    }

    public void setIdAltas(Integer idAltas) {
        this.idAltas = idAltas;
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

    public String getProblemas() {
        return problemas;
    }

    public void setProblemas(String problemas) {
        this.problemas = problemas;
    }

    public String getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(String segmentos) {
        this.segmentos = segmentos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getResponsableLevantamiento() {
        return responsableLevantamiento;
    }

    public void setResponsableLevantamiento(String responsableLevantamiento) {
        this.responsableLevantamiento = responsableLevantamiento;
    }

    public Equipo getEquipoaltas() {
        return equipoaltas;
    }

    public void setEquipoaltas(Equipo equipoaltas) {
        this.equipoaltas = equipoaltas;
    }

    public Movimiento getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAltas != null ? idAltas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Altas)) {
            return false;
        }
        Altas other = (Altas) object;
        if ((this.idAltas == null && other.idAltas != null) || (this.idAltas != null && !this.idAltas.equals(other.idAltas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Auth.Altas[ idAltas=" + idAltas + " ]";
    }
    
}
