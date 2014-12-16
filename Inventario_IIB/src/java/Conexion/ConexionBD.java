/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jose Cruz Galindo Martinez
 * @version 1.0
 */
public class ConexionBD {

    private String url;
    private String controlador;
    private String usuario = "root";
    private String contrasenia = "306242351";
    private Connection conexion;
    private Statement stmt;
    private int count=0;

    /**
     * Crea una instancia de la clase para iniciar la conexion a la BD.
     *
     * @throws ClassNotFoundException Si no encuentra el Driver adecuado.
     */
    public ConexionBD() throws ClassNotFoundException {
        String base = "Inventario_IIB";
        this.controlador = "com.mysql.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/" + base;
        cargarDriver();
    }

  // Metodo que se encarga de cargar el driver para hacer
    // la conexion entre el manejador y la aplicacion.
    private void cargarDriver() throws ClassNotFoundException {
        Class.forName(controlador);
        System.out.println("Se cargo el driver exitosamente");
    }

    /**
     * Se encarga de crear una conexion a la BD para poder obtener informacion
     * de esta.
     *
     * @throws SQLException Si la conexion no se crea correctamente o esta
     * cerrada.
     */
    public void conectarBD() throws SQLException {
        System.out.println("Estableciendo Conexion...");
        conexion = DriverManager.getConnection(url, usuario, contrasenia);
        System.out.println("Conexion establecida!");
        stmt = conexion.createStatement();
    }

    /**
     * Cierra la conexion a la BD.
     *
     * @throws SQLException Si al acceder a la base de datos ocurre un error.
     */
    public void desconectarBD() throws SQLException {
        if (this.getConexion() != null) {
            conexion.close();
            System.out.println("Conexion Cerrada!");
        }
    }

    /**
     * Dada una sentencia de sql se encarga de insertarla a la BD, esta
     * sentencia debe ser de la forma "INSERT INTO tabla VALUES (valores...)"
     *
     * @param sentencia La sentencia de sql para agregar a la BD.
     * @return result. Boolean que indica si se realizó correctamente la inserción.
     * 
     * @throws SQLException Si la conexion no esta activa.
     */
    public boolean insertarBD(String sentencia) throws SQLException {       
        boolean result= stmt.execute(sentencia);
        if(result){
        System.out.println("Se ejecuto la insercion correctamente.");
        }
        return result;
    }

    /**
     * Dada una sentencia de sql se encarga de insertarla a la BD, esta
     * sentencia debe ser de la forma "DELETE FROM tabla WHERE valores =
     * valores"
     *
     * @param sentencia La sentencia de sql para eliminar de la BD.
     * @throws SQLException Si la conexion no esta activa.
     */
    public void borrarBD(String sentencia) throws SQLException {
        stmt.execute(sentencia);
        System.out.println("Se elimino correctamente.");
    }

    /**
     * Dada una sentencia de sql se encarga de actualizar la BD, esta sentencia
     * debe ser de la forma "UPDATE tabla SET columna = valores"
     *
     * @param sentencia la sentencia de sql para actualizar la base.
     * @return fila. El número de filas actualizadas en la base.
     * @throws SQLException Si la conexion no esta activa.
     */
    public int actualizarBD(String sentencia) throws SQLException {
        int fila = stmt.executeUpdate(sentencia);
        if(fila > 0){
        System.out.println("Base Actualizada!");
        }   
        return fila;
    }

    /**
     * Dada una sentencia de sql se encarga de buscar en la BD, esta sentencia
     * debe ser de la forma "SELECT valores FROM tabla MODIFICADORES".
     *
     * @param busqueda La sentencia de sql para realizar la busqueda en la BD.
     * @return El conjunto de elementos que cumplen las caracteristicas de la
     * busqueda realizada o null si la busqueda no tiene exito.
     * @throws SQLException Si la conexion no esta activa.
     */
    public ResultSet consultarBD(String busqueda) throws SQLException {
        ResultSet resultado = stmt.executeQuery(busqueda);
        System.out.println("Consulta realizada!");
        return resultado;
    }

    /**
     * Nos permite obtener la conexion de la base de datos.
     *
     * @return la conexion creada a la base de datos.
     */
    public Connection getConexion() {
        return conexion;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}