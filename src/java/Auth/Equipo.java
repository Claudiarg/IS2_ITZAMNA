/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Auth;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mangekyou
 */
@Entity
@Table(name = "Equipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipo.findAll", query = "SELECT e FROM Equipo e")})
public class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEquipo", nullable = false)
    private Integer idEquipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "informatica", nullable = false)
    private int informatica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNAM", nullable = false)
    private int unam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "inv", nullable = false)
    private int inv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "serie", nullable = false, length = 45)
    private String serie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaRegistro", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaResguardo", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaResguardo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "estado", nullable = false, length = 50)
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipo")
    private Collection<Movimiento> movimientoCollection;
    @JoinColumn(name = "estadoFisico", referencedColumnName = "idEstadoFisico", nullable = false)
    @ManyToOne(optional = false)
    private EstadoFisico estadoFisico;
    @JoinColumn(name = "centroDeCosto", referencedColumnName = "idCentroDeCosto", nullable = false)
    @ManyToOne(optional = false)
    private CentroDeCosto centroDeCosto;
    @JoinColumn(name = "clase", referencedColumnName = "idClase", nullable = false)
    @ManyToOne(optional = false)
    private Clase clase;
    @JoinColumn(name = "familia", referencedColumnName = "idFamilia", nullable = false)
    @ManyToOne(optional = false)
    private Familia familia;
    @JoinColumn(name = "marca", referencedColumnName = "idMarca", nullable = false)
    @ManyToOne(optional = false)
    private Marca marca;
    @JoinColumn(name = "uso", referencedColumnName = "idUso", nullable = false)
    @ManyToOne(optional = false)
    private Uso uso;
    @JoinColumn(name = "modelo", referencedColumnName = "idModelo", nullable = false)
    @ManyToOne(optional = false)
    private Modelo modelo;
    @JoinColumn(name = "nivelObsolescencia", referencedColumnName = "idNivelObsolescencia", nullable = false)
    @ManyToOne(optional = false)
    private NivelObsolescencia nivelObsolescencia;
    @JoinColumn(name = "proveedor", referencedColumnName = "idProveedor", nullable = false)
    @ManyToOne(optional = false)
    private Proveedor proveedor;
    @JoinColumn(name = "responsable", referencedColumnName = "idResponsable", nullable = false)
    @ManyToOne(optional = false)
    private Responsable responsable;
    @JoinColumn(name = "tipo", referencedColumnName = "idTipo", nullable = false)
    @ManyToOne(optional = false)
    private Tipo tipo;
    @JoinColumn(name = "ubicacion", referencedColumnName = "idUbicacion", nullable = false)
    @ManyToOne(optional = false)
    private Ubicacion ubicacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipoaltas")
    private Collection<Altas> altasCollection;

    public Equipo() {
    }

    public Equipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Equipo(Integer idEquipo, int informatica, int unam, int inv, String descripcion, String serie, Date fechaRegistro, Date fechaResguardo, String estado) {
        this.idEquipo = idEquipo;
        this.informatica = informatica;
        this.unam = unam;
        this.inv = inv;
        this.descripcion = descripcion;
        this.serie = serie;
        this.fechaRegistro = fechaRegistro;
        this.fechaResguardo = fechaResguardo;
        this.estado = estado;
    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getInformatica() {
        return informatica;
    }

    public void setInformatica(int informatica) {
        this.informatica = informatica;
    }

    public int getUnam() {
        return unam;
    }

    public void setUnam(int unam) {
        this.unam = unam;
    }

    public int getInv() {
        return inv;
    }

    public void setInv(int inv) {
        this.inv = inv;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaResguardo() {
        return fechaResguardo;
    }

    public void setFechaResguardo(Date fechaResguardo) {
        this.fechaResguardo = fechaResguardo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<Movimiento> getMovimientoCollection() {
        return movimientoCollection;
    }

    public void setMovimientoCollection(Collection<Movimiento> movimientoCollection) {
        this.movimientoCollection = movimientoCollection;
    }

    public EstadoFisico getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(EstadoFisico estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

    public CentroDeCosto getCentroDeCosto() {
        return centroDeCosto;
    }

    public void setCentroDeCosto(CentroDeCosto centroDeCosto) {
        this.centroDeCosto = centroDeCosto;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Uso getUso() {
        return uso;
    }

    public void setUso(Uso uso) {
        this.uso = uso;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public NivelObsolescencia getNivelObsolescencia() {
        return nivelObsolescencia;
    }

    public void setNivelObsolescencia(NivelObsolescencia nivelObsolescencia) {
        this.nivelObsolescencia = nivelObsolescencia;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @XmlTransient
    public Collection<Altas> getAltasCollection() {
        return altasCollection;
    }

    public void setAltasCollection(Collection<Altas> altasCollection) {
        this.altasCollection = altasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipo != null ? idEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.idEquipo == null && other.idEquipo != null) || (this.idEquipo != null && !this.idEquipo.equals(other.idEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Auth.Equipo[ idEquipo=" + idEquipo + " ]";
    }
    
}
