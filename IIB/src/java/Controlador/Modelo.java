/*
 * Clase para el manejo del catalogo Modelo.
 */

package Controlador;

/**
 *
 * @author beth
 */
public class Modelo {
    
    /*Id del modelo*/
    private int idModelo;
    /*Descripción del modelo*/
    private String descripcion;

    public Modelo() {
    }

/*
 *Constructor que recibe un entero que representa el id del elemento y una cadena que representa el nombre del elemeto.
 */
    public Modelo(int idModelo, String descripcion) {
        this.idModelo = idModelo;
        this.descripcion = descripcion;
    }

/*
 *Método get que regresa el id del Modelo. 
 */
    public int getIdModelo() {
        return idModelo;
    }

/*
 *Asigna el id del Modelo.
 */
    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

/*
 *Método get que regresa el nombre del Modelo.
 */
    public String getDescripcion() {
        return descripcion;
    }

/*
 *Asigna el nombre del Modelo.
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
