/*
 * Clase para el manejo del catalogo Estado Físico.
 */

package Controlador;

/**
 *
 * @author beth
 */
public class EstadoFisico {
    
    /*Id del estado físico*/
    private int idEstadoFisico;
    /*Descripción del estado físico*/
    private String descripcion;

    public EstadoFisico() {
    }

/*
 *Constructor que recibe un entero que representa el id del elemento y una cadena que representa el nombre del elemeto.
 */
    public EstadoFisico(int idEstadoFisico, String descripcion) {
        this.idEstadoFisico = idEstadoFisico;
        this.descripcion = descripcion;
    }

/*
 *Método get que regresa el id del Estado Físico.. 
 */
    public int getIdEstadoFisico() {
        return idEstadoFisico;
    }

/*
 *Asigna el id del estado Físico.
 */
    public void setIdEstadoFisico(int idEstadoFisico) {
        this.idEstadoFisico = idEstadoFisico;
    }

/*
 *Método get que regresa el nombre del Estado Físico.
 */
    public String getDescripcion() {
        return descripcion;
    }

/*
 *Asigna el nombre del Estado Físico.
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
