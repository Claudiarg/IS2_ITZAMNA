/*
 * Clase para el manejo del catalogo Estado.
 */

package Controlador;

/**
 *
 * @author beth
 */
public class Estado {
    
    /*Id del estado*/
    private int idEstado;
    /*Descripción del estado*/
    private String descripcion;

    public Estado() {
    }

/*
 *Constructor que recibe un entero que representa el id del elemento y una cadena que representa el nombre del elemeto.
 */
    public Estado(int idEstado, String descripcion) {
        this.idEstado = idEstado;
        this.descripcion = descripcion;
    }

/*
 *Método get que regresa el id del Estado. 
 */
    public int getIdEstado() {
        return idEstado;
    }

/*
 *Asigna el id del Estado..
 */
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

/*
 *Método get que regresa el nombre del Estado.
 */
    public String getDescripcion() {
        return descripcion;
    }

/*
 *Asigna el nombre del Estado.
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
