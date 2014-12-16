/*
 * Clase para el manejo del catalogo centro de costo.
 */

package Controlador;

/**
 *
 * @author beth
 */
public class CentroCosto {
    
    /*Id del centro de costo*/
    private int idCentroCosto ;
    /*Descripción del centro de costo*/
    private String descripcion;

    public CentroCosto() {
    }
/*
 *Constructor que recibe un entero que representa el id del elemento y una cadena qu representa el nombre del elemeto.
 */
    public CentroCosto(int idCentroCosto, String descripcion) {
        this.idCentroCosto = idCentroCosto;
        this.descripcion = descripcion;
    }

/*
 *Método get que regresa el id de Centro de Costo. 
 */
    public int getIdCentroCosto() {
        return idCentroCosto;
    }
/*
 *Asigna el id del centro de costo
 */
    public void setIdCentroCosto(int idCentroCosto) {
        this.idCentroCosto = idCentroCosto;
    }

/*
 *Método get que regresa el nombre del centro de costo.
 */
    public String getDescripcion() {
        return descripcion;
    }

/*
 *Asigna el nombre del centro de costo
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
