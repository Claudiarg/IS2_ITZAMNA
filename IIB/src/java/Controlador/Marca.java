/*
 * Clase para el manejo del catalogo Marca.
 */

package Controlador;

/**
 *
 * @author beth
 */
public class Marca {
    
    /*Id de la Marca*/
    private int idMarca;
    /*Descripción de la Marca*/
    private String descripcion;

    public Marca() {
    }

/*
 *Constructor que recibe un entero que representa el id del elemento y una cadena que representa el nombre del elemeto.
 */
    public Marca(int idMarca, String descripcion) {
        this.idMarca = idMarca;
        this.descripcion = descripcion;
    }

/*
 *Método get que regresa el id de la Marca. 
 */
    public int getIdMarca() {
        return idMarca;
    }

/*
 *Asigna el id de la Marca.
 */
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

/*
 *Método get que regresa el nombre de la Marca.
 */
    public String getDescripcion() {
        return descripcion;
    }

/*
 *Asigna el nombre de la Marca.
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
