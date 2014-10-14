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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mangekyou
 */
@Entity
@Table(name = "Familia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Familia.findAll", query = "SELECT f FROM Familia f")})
public class Familia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFamilia", nullable = false)
    private Integer idFamilia;
    @Size(max = 45)
    @Column(name = "Descripcion", length = 45)
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "familia")
    private Collection<Equipo> equipoCollection;

    public Familia() {
    }

    public Familia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public Integer getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
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
        hash += (idFamilia != null ? idFamilia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Familia)) {
            return false;
        }
        Familia other = (Familia) object;
        if ((this.idFamilia == null && other.idFamilia != null) || (this.idFamilia != null && !this.idFamilia.equals(other.idFamilia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Auth.Familia[ idFamilia=" + idFamilia + " ]";
    }
    
}
