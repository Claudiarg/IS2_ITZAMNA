/*
 *Clase para el manejo de los elementoa que conforman un equipo..
 */
package Controlador;

import Conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author beth
 */
public class Equipo {

    private int idEquipo;
    private int numInformatica;
    private int numUNAM;
    private int numDepto;
    private String descripcion;
    private int marca;
    private int modelo;
    private String serie;
    private int familia;
    private int tipo;
    private int proveedor;
    private String fechaRegistro;
    private int clase;
    private int uso;
    private int nivel;
    private int estadoFisico;
    private int ubicacion;
    private int responsable;
    private String fechaResguardo;
    private int centroCosto;
    private int estado;
    private int count = 0;
    private boolean creado = false;

/*
 * Método constructor vacio que inserta un nuevo equipo en la tabla de la base de datos.
 */
    public Equipo() throws ClassNotFoundException, SQLException{
    
        ConexionBD c = new ConexionBD();
        c.conectarBD();
        int equipo = 23456;
        String query = "insert into Equipo (idEquipo) values (0)";        
        boolean a = c.insertarBD(query);                
            query = "select max(idEquipo) AS idEqui FROM Equipo";
            ResultSet r = c.consultarBD(query);
            while(r.next()){
               equipo = r.getInt(1);                
                this.creado = true;
                System.out.println("Si ingrese a while para asignar el id");
            }
            this.idEquipo = equipo;        
        c.desconectarBD();
    }
    
/*
 * Método constructor de equipos que recibe un numero de inventario para insertar un nuevo equipo a la base de datos.
 */
    public Equipo(int numInv) throws ClassNotFoundException, SQLException {
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        String query = "select * from Equipo where numInformatica =" + numInv + ";";        
        ResultSet r = conexion.consultarBD(query);        
        while (r.next()) {
            this.idEquipo = r.getInt(1);
            this.numInformatica = r.getInt(2);
            this.numUNAM = r.getInt(3);
            this.numDepto = r.getInt(4);
            this.descripcion = r.getString(5);
            this.marca = r.getInt(6);
            this.modelo = r.getInt(7);
            this.serie = r.getString(8);
            this.familia = r.getInt(9);
            this.tipo = r.getInt(10);
            this.proveedor = r.getInt(11);
            this.fechaRegistro = r.getString(12);
            this.clase = r.getInt(13);
            this.uso = r.getInt(14);
            this.nivel = r.getInt(15);
            this.estadoFisico = r.getInt(16);
            this.ubicacion = r.getInt(17);
            this.responsable = r.getInt(18);
            this.fechaResguardo = r.getString(19);
            this.centroCosto = r.getInt(20);
            this.estado = r.getInt(21);
            this.setCount(this.count+1);
        }
        conexion.desconectarBD();

    }

/*
 * Metodo que regresa true si el equipo fue insertado exitosamente, en caso contrario regresa false.
 */
    public boolean InsertarEquipo(int numInformatica, int numUNAM, int numInv, String descripcion, int marca, int modelo, int serie, int familia, int tipo,int proveedor, String fechaRegistro, int clase, int uso, int nivelObsolescencia, int estadoFisico, int ubicacion, int responsable, String fechaResguardo, int centroDeCosto, int estado) throws ClassNotFoundException, SQLException {
        boolean insert;                
        String query = "Insert into Equipo(idEquipo, numInformatica, numUNAM, numInv, descripcion, marca, modelo, serie, familia, tipo, proveedor, fechaRegistro, clase, uso, nivelObsolescencia, estadoFisico, ubicacion, responsable, fechaResguardo, centroDeCosto, estado) values (0, "+numInformatica+","+ numUNAM+", "+numInv+", '"+descripcion+"',"+ marca+", "+modelo+", "+serie+","+familia+", "+tipo+", "+proveedor+", '"+fechaRegistro+"', "+clase+", "+uso+", "+nivelObsolescencia+", "+estadoFisico+", "+ubicacion+", "+responsable+",'"+fechaResguardo+"', "+centroDeCosto+","+estado+");";
        ConexionBD conexion = new ConexionBD();        
        conexion.conectarBD();
        insert = conexion.insertarBD(query);       
             query = "select idEquipo from Equipo where numInformatica =" + numInv + ";";
            conexion.consultarBD(query);
            ResultSet r = conexion.consultarBD(query);
            while(r.next()){
                this.idEquipo = r.getInt(1);
                this.setCount(this.count+1);
            }        
        return insert;

    }

/*
 * Metodo que regresa el numero de estado en el que se encuentra el equipo.
 */
    public int EstadoEquipo(int Estado) throws ClassNotFoundException, SQLException {
        int update;
        String query = "Update Equipo set estado = " + Estado+" where idEquipo="+this.getIdEquipo();
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;

    }

/*
 * Método que regresa el id del equipo.
 */
    public int getIdEquipo() {
        return idEquipo;
    }

    /*public int setIdEquipo(int idEquipo) throws ClassNotFoundException, SQLException {
    this.idEquipo = idEquipo;
    int update;
    String query = "Update Equipo set  idEquipo " + idEquipo + "   where idEquipo= " + this.idEquipo;
    ConexionBD conexion = new ConexionBD();
    conexion.conectarBD();
    update = conexion.actualizarBD(query);
    return update;
    }*/
    
/*
 * Método que regresa true si el equipo fue creado de caso contrario regresa false.
 */
    public boolean isCreado() {
        return creado;
    }
/*
 * Método que asigna el valor de la variable creado.
 */
    public void setCreado(boolean creado) {
        this.creado = creado;
    }
    
    
/*
 * Método que regresa el numero de informatica que tiene el equipo.
 */
    public int getNumInformatica() {
        return numInformatica;
    }

/*
 * Método que regresa 1 si el equipo fue actualizado mediante el numero de informatica del equipo.
 */
    public int setNumInformatica(int numInformatica) throws ClassNotFoundException, SQLException {
        this.numInformatica = numInformatica;              
        int update;
        String query = "Update Equipo set  numInformatica= " + numInformatica + " where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa el numero de la unam asociado al equipo.
 */
    public int getNumUNAM() {
        return numUNAM;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante el numero de la unam, asociado al equipo.
 */
    public int setNumUNAM(int numUNAM) throws ClassNotFoundException, SQLException {
        this.numUNAM = numUNAM;                
        int update;
        String query = "Update Equipo set  numUNAM= " + numUNAM + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa el numero de departamento asociado al equipo.
 */
    public int getNumDepto() {
        return numDepto;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante el numero de departamento.
 */
    public int setNumDepto(int numDepto) throws ClassNotFoundException, SQLException {
        this.numDepto = numDepto;                
        int update;
        String query = "Update Equipo set  numInv= " + numDepto + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa la descripcion del equipo.
 */
    public String getDescripcion() {
        return descripcion;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante la descripcion.
 */
    public int setDescripcion(String descripcion) throws ClassNotFoundException, SQLException {
        this.descripcion = descripcion;                
        int update;
        String query = "Update Equipo set  descripcion= '" + descripcion + "'  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa la marca del equipo.
 */
    public int getMarca() {
        return marca;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante la marca del equipo.
 */
    public int setMarca(int marca) throws ClassNotFoundException, SQLException {
        this.marca = marca;               
        int update;
        String query = "Update Equipo set  numUNAM= " + numUNAM + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa el id del modelo asociado al equipo.
 */
    public int getModelo() {
        return modelo;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante el modelo asociado al equipo.
 */
    public int setModelo(int modelo) throws ClassNotFoundException, SQLException {
        this.modelo = modelo;                
        int update;
        String query = "Update Equipo set  modelo= " + modelo + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa la serie del equipo.
 */
    public String getSerie() {
        return serie;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediantela serie del equipo.
 */
    public int setSerie(String serie) throws ClassNotFoundException, SQLException {
        this.serie = serie;                
        int update;
        String query = "Update Equipo set  serie= '" + serie + "'  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa el id de la familia asociado al equipo.
 */
    public int getFamilia() {
        return familia;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante la familia asociada al equipo.
 */
    public int setFamilia(int familia) throws ClassNotFoundException, SQLException {
        this.familia = familia;
        int update;
        String query = "Update Equipo set  familia= " + familia + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa el id del tipo asociado al equipo.
 */
    public int getTipo() {
        return tipo;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante la tipo asociado al equipo.
 */
    public int setTipo(int tipo) throws ClassNotFoundException, SQLException {
        this.tipo = tipo;
        int update;
        String query = "Update Equipo set  tipo= " + tipo + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }
/*
 * Método que regresa el id del proveedor asociado al equipo.
 */
    public int getProveedor() {
        return proveedor;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante el proveedor asociado al equipo.
 */
    public int setProveedor(int proveedor) throws ClassNotFoundException, SQLException {
        this.proveedor = proveedor;
        int update;
        String query = "Update Equipo set  proveedor= " + proveedor + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa la fecha de registro del equipo.
 */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante la fecha en la que se registro el equipo.
 */
    public int setFechaRegistro(String fechaRegistro) throws ClassNotFoundException, SQLException {
        this.fechaRegistro = fechaRegistro;
        int update;
        String query = "Update Equipo set  fechaRegistro= '" + fechaRegistro + "'   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa el id de la clase asociada al equipo.
 */
    public int getClase() {
        return clase;        
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante la clase asociada al equipo.
 */
    public int setClase(int clase) throws ClassNotFoundException, SQLException {
        this.clase = clase;
        int update;
        String query = "Update Equipo set  clase= " + clase + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }
/*
 * Método que regresa el id del uso asociado al equipo.
 */
    public int getUso() {
        return uso;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante el uso asociado al equipo.
 */
    public int setUso(int uso) throws ClassNotFoundException, SQLException {
        this.uso = uso;
        int update;
        String query = "Update Equipo set  uso= " + uso + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
        
    }

/*
 * Método que regresa el nivel asociado al equipo.
 */
    public int getNivel() {
        return nivel;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante el nivel asociado al equipo.
 */
    public int setNivel(int nivel) throws ClassNotFoundException, SQLException {
        this.nivel = nivel;
        int update;
        String query = "Update Equipo set  nivelObsolescencia= " + nivel + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa el id del estado físico asociado al equipo.
 */
    public int getEstadoFisico() {
        return estadoFisico;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante el estado fisico asociado al equipo.
 */
    public int setEstadoFisico(int estadoFisico) throws ClassNotFoundException, SQLException {
        this.estadoFisico = estadoFisico;
        int update;
        String query = "Update Equipo set  estadoFisico= " + estadoFisico + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa el id de la ubicación asociada al equipo.
 */
    public int getUbicacion() {
        return ubicacion;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante la ubicación asociada al equipo.
 */
    public int setUbicacion(int ubicacion) throws ClassNotFoundException, SQLException {
        this.ubicacion = ubicacion;
        int update;
        String query = "Update Equipo set  ubicacion= " + ubicacion + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;        
    }

/*
 * Método que regresa el id del responsable asociado al equipo.
 */
    public int getResponsable() {
        return responsable;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante el responsable asociada al equipo.
 */
    public int setResponsable(int responsable) throws ClassNotFoundException, SQLException {
        this.responsable = responsable;
        int update;
        String query = "Update Equipo set  responsable= " + responsable + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;        
    }

/*
 * Método que regresa la fecha de resguardo asociada al equipo.
 */
    public String getFechaResguardo() {
        return fechaResguardo;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante la ubicación asociada al equipo.
 */
    public int setFechaResguardo(String fechaResguardo) throws ClassNotFoundException, SQLException {
        this.fechaResguardo = fechaResguardo;                
        int update;
        String query = "Update Equipo set  fechaResguardo= '" + fechaResguardo + "'   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa el id del centro de costo asociada al equipo.
 */
    public int getCentroCosto() {
        return centroCosto;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante el centro de costo asociada al equipo.
 */
    public int setCentroCosto(int centroCosto) throws ClassNotFoundException, SQLException {
        this.centroCosto = centroCosto;
        int update;
        String query = "Update Equipo set  centroCosto= " + centroCosto + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

/*
 * Método que regresa el id del estado asociada al equipo.
 */
    public int getEstado() {
        return estado;
    }

/*
 * Método que regresa 1 si se actualizo el equipo mediante el estado asociado al equipo.
 */
    public int setEstado(int estado) throws ClassNotFoundException, SQLException {
        this.estado = estado;
        int update;
        String query = "Update Equipo set  estado= " + estado + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;        
    }
/*
 * Método que regresa el valor de count asociada al equipo.
 */
    public int getCount() {
        return count;
    }
/*
 * Método que asigna el valor de count del equipo.
 */
    public void setCount(int count) {
        this.count = count;
    }

    /*public static void main(String Args[]) throws ClassNotFoundException, SQLException {
/*        int inv = 1;
        //String nInv = Integer.toString(inv);
        Equipo e = new Equipo(inv);
        System.out.println("Se ingreso count para crear equipo: "+e.getCount());
        System.out.println("Fecha de resguardo de e: "+e.getFechaRegistro());
        System.out.println("Asignamos la fecha con set");
        int act= e.setFechaRegistro("2014-11-11");
        System.out.println("La fecha de registro ahora es: "+e.getFechaRegistro());
        System.out.println("num lineas actualizadas son: "+act);
        Equipo e1 = new Equipo(inv);
        System.out.println("Ahora la fecha de registro es: "+e1.getFechaRegistro());
        Equipo e = new Equipo();
        int cat = 3;
        int c2 = 2345;
        String x = "x";
        String fecha = "2015-12-12";         
        boolean inserto = e.InsertarEquipo(cat, cat, c2, x, cat, cat, cat, cat, cat, cat, fecha, cat, cat, cat, cat, cat, cat,fecha , cat,cat);        
            System.out.println("Si insertó y el id es: "+e.getIdEquipo());
    }
        Equipo e = new Equipo();
        System.out.println("El equipo fue creado? "+e.isCreado());
        System.out.println("El id del nuevo equipo es: "+ e.getIdEquipo());
        
    }*/
}
