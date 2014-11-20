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

    public Equipo() {
    }

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

    /*public int ActualizarEquipo(){
    int r;
        
    return r;
     
     

    }*/

    public boolean InsertarEquipo(int numInformatica, int numUNAM, int numInv, String descripcion, int marca, int modelo, int serie, int familia, int tipo,int proveedor, String fechaRegistro, int clase, int uso, int nivelObsolescencia, int estadoFisico, int ubicacion, int responsable, String fechaResguardo, int centroDeCosto, int estado) throws ClassNotFoundException, SQLException {
        boolean insert;                
        String query = "Insert into Equipo(numInformatica, numUNAM, numInv, descripcion, marca, modelo, serie, familia, tipo, proveedor, fechaRegistro, clase, uso, nivelObsolescencia, estadoFisico, ubicacion, responsable, fechaResguardo, centroDeCosto, estado) values ("+numInformatica+","+ numUNAM+", "+numInv+", '"+descripcion+"',"+ marca+", "+modelo+", "+serie+","+familia+", "+tipo+", "+proveedor+", '"+fechaRegistro+"', "+clase+", "+uso+", "+nivelObsolescencia+", "+estadoFisico+", "+ubicacion+", "+responsable+",'"+fechaResguardo+"', "+centroDeCosto+","+estado+");";
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

    public int EstadoEquipo(int Estado) throws ClassNotFoundException, SQLException {
        int update;
        String query = "Update Equipo set estado = " + Estado+" where idEquipo="+this.getIdEquipo();
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;

    }

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

    public int getNumInformatica() {
        return numInformatica;
    }

    public int setNumInformatica(int numInformatica) throws ClassNotFoundException, SQLException {
        this.numInformatica = numInformatica;              
        int update;
        String query = "Update Equipo set  numInformatica= " + numInformatica + " where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public int getNumUNAM() {
        return numUNAM;
    }

    public int setNumUNAM(int numUNAM) throws ClassNotFoundException, SQLException {
        this.numUNAM = numUNAM;                
        int update;
        String query = "Update Equipo set  numUNAM= " + numUNAM + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public int getNumDepto() {
        return numDepto;
    }

    public int setNumDepto(int numDepto) throws ClassNotFoundException, SQLException {
        this.numDepto = numDepto;                
        int update;
        String query = "Update Equipo set  numInv= " + numDepto + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int setDescripcion(String descripcion) throws ClassNotFoundException, SQLException {
        this.descripcion = descripcion;                
        int update;
        String query = "Update Equipo set  descripcion= '" + descripcion + "'  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public int getMarca() {
        return marca;
    }

    public int setMarca(int marca) throws ClassNotFoundException, SQLException {
        this.marca = marca;               
        int update;
        String query = "Update Equipo set  numUNAM= " + numUNAM + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public int getModelo() {
        return modelo;
    }

    public int setModelo(int modelo) throws ClassNotFoundException, SQLException {
        this.modelo = modelo;                
        int update;
        String query = "Update Equipo set  modelo= " + modelo + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public String getSerie() {
        return serie;
    }

    public int setSerie(String serie) throws ClassNotFoundException, SQLException {
        this.serie = serie;                
        int update;
        String query = "Update Equipo set  serie= '" + serie + "'  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public int getFamilia() {
        return familia;
    }

    public int setFamilia(int familia) throws ClassNotFoundException, SQLException {
        this.familia = familia;
        int update;
        String query = "Update Equipo set  familia= " + familia + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public int getTipo() {
        return tipo;
    }

    public int setTipo(int tipo) throws ClassNotFoundException, SQLException {
        this.tipo = tipo;
        int update;
        String query = "Update Equipo set  tipo= " + tipo + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public int getProveedor() {
        return proveedor;
    }

    public int setProveedor(int proveedor) throws ClassNotFoundException, SQLException {
        this.proveedor = proveedor;
        int update;
        String query = "Update Equipo set  proveedor= " + proveedor + "  where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public int setFechaRegistro(String fechaRegistro) throws ClassNotFoundException, SQLException {
        this.fechaRegistro = fechaRegistro;
        int update;
        String query = "Update Equipo set  fechaRegistro= '" + fechaRegistro + "'   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public int getClase() {
        return clase;        
    }

    public int setClase(int clase) throws ClassNotFoundException, SQLException {
        this.clase = clase;
        int update;
        String query = "Update Equipo set  clase= " + clase + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public int getUso() {
        return uso;
    }

    public int setUso(int uso) throws ClassNotFoundException, SQLException {
        this.uso = uso;
        int update;
        String query = "Update Equipo set  uso= " + uso + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
        
    }

    public int getNivel() {
        return nivel;
    }

    public int setNivel(int nivel) throws ClassNotFoundException, SQLException {
        this.nivel = nivel;
        int update;
        String query = "Update Equipo set  nivelObsolescencia= " + nivel + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public int getEstadoFisico() {
        return estadoFisico;
    }

    public int setEstadoFisico(int estadoFisico) throws ClassNotFoundException, SQLException {
        this.estadoFisico = estadoFisico;
        int update;
        String query = "Update Equipo set  estadoFisico= " + estadoFisico + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public int setUbicacion(int ubicacion) throws ClassNotFoundException, SQLException {
        this.ubicacion = ubicacion;
        int update;
        String query = "Update Equipo set  ubicacion= " + ubicacion + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;        
    }

    public int getResponsable() {
        return responsable;
    }

    public int setResponsable(int responsable) throws ClassNotFoundException, SQLException {
        this.responsable = responsable;
        int update;
        String query = "Update Equipo set  responsable= " + responsable + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;        
    }

    public String getFechaResguardo() {
        return fechaResguardo;
    }

    public int setFechaResguardo(String fechaResguardo) throws ClassNotFoundException, SQLException {
        this.fechaResguardo = fechaResguardo;                
        int update;
        String query = "Update Equipo set  fechaResguardo= '" + fechaResguardo + "'   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public int getCentroCosto() {
        return centroCosto;
    }

    public int setCentroCosto(int centroCosto) throws ClassNotFoundException, SQLException {
        this.centroCosto = centroCosto;
        int update;
        String query = "Update Equipo set  centroCosto= " + centroCosto + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;
    }

    public int getEstado() {
        return estado;
    }

    public int setEstado(int estado) throws ClassNotFoundException, SQLException {
        this.estado = estado;
        int update;
        String query = "Update Equipo set  estado= " + estado + "   where idEquipo= " + this.idEquipo;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        return update;        
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

   /* public static void main(String Args[]) throws ClassNotFoundException, SQLException {
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
    }*/

}
