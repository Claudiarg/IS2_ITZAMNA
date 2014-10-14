/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Auth;

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
@Table(name = "Uso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Uso.findAll", query = "SELECT u FROM Uso u")})
public class Uso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUso", nullable = false)
    private Integer idUso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Descripcion", nullable = false, length = 45)
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "uso")
    private Collection<Equipo> equipoCollection;

    public Uso() {
    }

    public Uso(Integer idUso) {
        this.idUso = idUso;
    }

    public Uso(Integer idUso, String descripcion) {
        this.idUso = idUso;
        this.descripcion = descripcion;
    }

    public Integer getIdUso() {
        return idUso;
    }

    public void setIdUso(Integer idUso) {
        this.idUso = idUso;
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
        hash += (idUso != null ? idUso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uso)) {
            return false;
        }
        Uso other = (Uso) object;
        if ((this.idUso == null && other.idUso != null) || (this.idUso != null && !this.idUso.equals(other.idUso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Auth.Uso[ idUso=" + idUso + " ]";
    }
    
}
