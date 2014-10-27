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
@Table(name = "NivelObsolescencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NivelObsolescencia.findAll", query = "SELECT n FROM NivelObsolescencia n")})
public class NivelObsolescencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idNivelObsolescencia", nullable = false)
    private Integer idNivelObsolescencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Descripcion", nullable = false, length = 45)
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nivelObsolescencia")
    private Collection<Equipo> equipoCollection;

    public NivelObsolescencia() {
    }

    public NivelObsolescencia(Integer idNivelObsolescencia) {
        this.idNivelObsolescencia = idNivelObsolescencia;
    }

    public NivelObsolescencia(Integer idNivelObsolescencia, String descripcion) {
        this.idNivelObsolescencia = idNivelObsolescencia;
        this.descripcion = descripcion;
    }

    public Integer getIdNivelObsolescencia() {
        return idNivelObsolescencia;
    }

    public void setIdNivelObsolescencia(Integer idNivelObsolescencia) {
        this.idNivelObsolescencia = idNivelObsolescencia;
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
        hash += (idNivelObsolescencia != null ? idNivelObsolescencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelObsolescencia)) {
            return false;
        }
        NivelObsolescencia other = (NivelObsolescencia) object;
        if ((this.idNivelObsolescencia == null && other.idNivelObsolescencia != null) || (this.idNivelObsolescencia != null && !this.idNivelObsolescencia.equals(other.idNivelObsolescencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Auth.NivelObsolescencia[ idNivelObsolescencia=" + idNivelObsolescencia + " ]";
    }
    
}
