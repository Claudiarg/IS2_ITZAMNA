/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author beth
 */
public class Usuario {
    
    private int idUsuario;
    private int tipoUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private int activo; 
    private int  count;
    String query;
    
    public Usuario(){
        this.count = 0;        
    }

        public Usuario(int nombreParam, String parametro) throws ClassNotFoundException, SQLException {
        String dato = (nombreParam == 0)? "idUsuario": "correo";
        this.count = 0;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        query = "Select * from Usuario where "+dato+" = '" + parametro + "';";
        ResultSet result = conexion.consultarBD(query);

        while (result.next()) {
            idUsuario = result.getInt(1);
            tipoUsuario = result.getInt(2);
            nombre = result.getString(3);
            apellido = result.getString(4);
            correo = result.getString(5);
            contrasenia = result.getString(6);
            activo = result.getInt(7);
            count=1;
        }
        conexion.desconectarBD();
    }
        
    public Usuario(String correo, String contrasenia) throws ClassNotFoundException, SQLException {
        this.count = 0;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();        
        query = "Select * from Usuario where correo = '"+correo+"' and contrasenia= '"+ contrasenia+"';"; 
        ResultSet result = conexion.consultarBD(query);   
        
        while(result.next()){
            idUsuario = result.getInt(1);                                                               
            tipoUsuario = result.getInt(2);
            nombre = result.getString(3);
            apellido = result.getString(4);
            this.correo = result.getString(5);
            this.contrasenia = result.getString(6);
            activo = result.getInt(7);   
            count++;
        }             
        conexion.desconectarBD();
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;       
    }   
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

   
 /*    
    public static void main (String [ ] args) throws ClassNotFoundException, SQLException {
        Usuario u = new Usuario("claudia.cirg@gmail.com","30624251");
        System.out.println("idUsuario "+u.getIdUsuario());
        System.out.println("activo "+u.getActivo());
        System.out.println("nombre "+u.getNombre());
    }*/
}
