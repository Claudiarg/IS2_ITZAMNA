/*
 * Clase para el manejo del catalogo Familia.
 */

package Controlador;

/**
 *
 * @author beth
 */
public class Familia {
    
    /*Id de la familia*/
    private int idFamilia;
    /*Descripción de la familia*/
    private String descripcion;

    public Familia() {
    }

/*
 *Constructor que recibe un entero que representa el id del elemento y una cadena que representa el nombre del elemeto.
 */
    public Familia(int idFamilia, String descripcion) {
        this.idFamilia = idFamilia;
        this.descripcion = descripcion;
    }

/*
 *Método get que regresa el id de la Familia. 
 */
    public int getIdFamilia() {
        return idFamilia;
    }

/*
 *Asigna el id de la Familia.
 */
    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

/*
 *Método get que regresa el nombre de la Familia.
 */
    public String getDescripcion() {
        return descripcion;
    }

/*
 *Asigna el nombre de la Familia.
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
