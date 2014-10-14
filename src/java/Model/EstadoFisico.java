/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mangekyou
 */
@Entity
@Table(name = "EstadoFisico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoFisico.findAll", query = "SELECT e FROM EstadoFisico e")})
public class EstadoFisico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEstadoFisico", nullable = false)
    private Integer idEstadoFisico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Descripcion", nullable = false, length = 45)
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoFisico")
    private Collection<Equipo> equipoCollection;

    public EstadoFisico() {
    }

    public EstadoFisico(Integer idEstadoFisico) {
        this.idEstadoFisico = idEstadoFisico;
    }

    public EstadoFisico(Integer idEstadoFisico, String descripcion) {
        this.idEstadoFisico = idEstadoFisico;
        this.descripcion = descripcion;
    }

    public Integer getIdEstadoFisico() {
        return idEstadoFisico;
    }

    public void setIdEstadoFisico(Integer idEstadoFisico) {
        this.idEstadoFisico = idEstadoFisico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Equipo> getEquipoCollection() {
        return equipoCollection;
    }

    public void setEquipoCollection(Collection<Equipo> equipoCollection) {
        this.equipoCollection = equipoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoFisico != null ? idEstadoFisico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoFisico)) {
            return false;
        }
        EstadoFisico other = (EstadoFisico) object;
        if ((this.idEstadoFisico == null && other.idEstadoFisico != null) || (this.idEstadoFisico != null && !this.idEstadoFisico.equals(other.idEstadoFisico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Auth.EstadoFisico[ idEstadoFisico=" + idEstadoFisico + " ]";
    }
    
}
