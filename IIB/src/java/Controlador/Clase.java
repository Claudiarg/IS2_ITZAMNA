/*
 * Clase para el manejo del catalogo clase.
 */

package Controlador;

/**
 *
 * @author beth
 */
public class Clase {
    
    /*Id del catalogo clase*/
    private int idClase;
    /*Descripción del catalogo clase*/
    private String descripcion;
    
    public Clase() {
    }
/*
 *Constructor que recibe un entero que representa el id del elemento y una cadena que representa el nombre del elemeto.
 */
    public Clase(int idClase, String descripcion) {
        this.idClase = idClase;
        this.descripcion = descripcion;
    }

/*
 *Método get que regresa el id de la Clase. 
 */
    public int getIdClase() {
        return idClase;
    }

/*
 *Asigna el id de la Clase.
 */
    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

/*
 *Método get que regresa el nombre de la clase.
 */
    public String getDescripcion() {
        return descripcion;
    }

/*
 *Asigna el nombre de la clase.
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
