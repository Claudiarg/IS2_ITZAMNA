/*
 * Clase Alta.
 * Contiene los métodos e información de altas en equipos.
 */

package Controlador;

import Conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author beth
 */
public class Altas {
    
    private int idAltas;
    private int movimiento;
    private int equipoaltas;
    private String claveActivoFijo;
    private String placa;
    private String ip;
    private String puerto;
    private String nombrePC;
    private String grupoTrabajo;
    private String sistemaOperativo;
    private String servicePack;
    private String servidorAntivirus;
    private String versionAntivirus;
    private String observProb;
    private String segmentos;
    private String nombreUsuario;
    private String responsableLev;

/*
 * Método constructor vacio que inserta una nueva alta en la tabla de la base de datos.
 */
    public Altas() throws ClassNotFoundException, SQLException {
        ConexionBD c = new ConexionBD();
        c.conectarBD();        
        int idAlta = 0;        
        String query = "insert into Altas (idAltas) values (0);";
        boolean a = c.insertarBD(query);                
            query = "select max(idAltas) AS idA FROM Altas";
            ResultSet r = c.consultarBD(query);
            while(r.next()){
               idAlta = r.getInt(1);                
               System.out.println("Si ingrese a while para asignar el id en altas");
            }            
            this.idAltas = idAlta;
        c.desconectarBD();
    }

/*
 * Método constructor de altas que recibe un id, un id de movimiento, un id de equipo que se dará de alta  y una cadena 
 * que representa la clave de activo fijo.
 */
    public Altas(int idAltas, int movimiento, int equipoaltas, String claveActivoFijo) {
        this.idAltas = idAltas;
        this.movimiento = movimiento;
        this.equipoaltas = equipoaltas;
        this.claveActivoFijo = claveActivoFijo;
    }
/*
 * Método que regresa el id del objeto altas.
 */
    public int getIdAltas() {
        return idAltas;
    }

/*
 * Método que asigna un numero de id de altas
 */
    public void setIdAltas(int idAltas) {
        this.idAltas = idAltas;
    }

/*
 * Método que regresa el id de movimiento.
 */
    public int getMovimiento() {
        return movimiento;
    }

/*
 * Método que asigna el id del Movimiento.
 */
    public void setMovimiento(int movimiento) throws ClassNotFoundException, SQLException {
        this.movimiento = movimiento;             
        int update;
        String query = "Update Altas set  movimiento= " +movimiento + " where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();
    }

/*
 * Método que regresa el id del equipo.
 */
    public int getEquipoaltas() {
        return equipoaltas;
    }

/*
 * Método que asigna el id de equipo que se dará de alta.
 */
    public void setEquipoaltas(int equipoaltas) throws ClassNotFoundException, SQLException {
        this.equipoaltas= equipoaltas;
        int update;
        String query = "Update Altas set  equipoaltas= " +equipoaltas + " where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();
    }

/*
 * Metodo que regresa la clave activo fijo.
 */
    public String getClaveActivoFijo() {
        return claveActivoFijo;
    }
/*
 * Metodo que asigna la clave activo fijo
 */
    public void setClaveActivoFijo(String claveActivoFijo) throws ClassNotFoundException, SQLException {
        this.claveActivoFijo = claveActivoFijo;
        int update;
        String query = "Update Altas set claveActivoFijo = '" +claveActivoFijo + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

/*
 * Metodo que regresa el nombre de placa
 */
    public String getPlaca() {
        return placa;
        
    }
/*
 * Método que asigna el nombre de la placa del equipo.
 */
    public void setPlaca(String placa) throws ClassNotFoundException, SQLException {
        this.placa = placa;
        int update;
        String query = "Update Altas set placa = '" +placa + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
        
    }

/*
 * Metodo que regresa la ip del equipo
 */
    public String getIp() {
        return ip;
    }
    
/*
 * Método que asigna la ip al equipo.
 */
    public void setIp(String ip) throws ClassNotFoundException, SQLException {
        this.ip = ip;
        int update;
        String query = "Update Altas set ip = '" +ip + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

/*
 * Metodo que regresa el puerto del equipo.
 */
    public String getPuerto() {
        return puerto;
    }

/*
 * Método que asigna el puerto al equipo.
 */
    public void setPuerto(String puerto) throws ClassNotFoundException, SQLException {
        this.puerto = puerto;
        int update;
        String query = "Update Altas set puerto = '" +puerto + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }


/*
 * Metodo que regresa el nombre de la PC
 */
    public String getNombrePC() {
        return nombrePC;
    }

/*
 * Método que asigna el nombre al equipo.
 */
    public void setNombrePC(String nombrePC) throws ClassNotFoundException, SQLException {
        this.nombrePC = nombrePC;
        int update;
        String query = "Update Altas set nombrePC = '" +nombrePC+ "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }


/*
 * Metodo que regresa el grupo de trabajo del equipo
 */
    public String getGrupoTrabajo() {
        return grupoTrabajo;
    }

/*
 * Método que asigna el grupo de trabajo al equipo.
 */
    public void setGrupoTrabajo(String grupoTrabajo) throws ClassNotFoundException, SQLException {
        this.grupoTrabajo = grupoTrabajo;
        int update;
        String query = "Update Altas set grupoTrabajo = '" +grupoTrabajo + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

/*
 * Metodo que regresa el sistema operativo del equipo
 */
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

/*
 * Método que asigna el sistema operativo al equipo.
 */
    public void setSistemaOperativo(String sistemaOperativo) throws ClassNotFoundException, SQLException {
        this.sistemaOperativo = sistemaOperativo;
        int update;
        String query = "Update Altas set claveActivoFijo = '" +claveActivoFijo + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

/*
 * Metodo que regresa el servicepack del equipo
 */
    public String getServicePack() {
        return servicePack;
    }

/*
 * Método que asigna el servicepack al equipo.
 */
    public void setServicePack(String servicePack) throws ClassNotFoundException, SQLException {
        this.servicePack = servicePack;
        int update;
        String query = "Update Altas set servicePack = '" +servicePack+ "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

/*
 * Metodo que regresa el nombre del servidor antivirus del equipo.
 */
    public String getServidorAntivirus() {
        return servidorAntivirus;
    }

/*
 * Método que asigna el servidor antivirus al equipo.
 */
    public void setServidorAntivirus(String servidorAntivirus) throws ClassNotFoundException, SQLException {
        this.servidorAntivirus = servidorAntivirus;
        int update;
        String query = "Update Altas set servidorAntivirus = '" +servidorAntivirus + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

/*
 * Metodo que regresa la version del antivirus del equipo.
 */
    public String getVersionAntivirus() {
        return versionAntivirus;
    }

/*
 * Método que asigna la version de antivirus al equipo.
 */
    public void setVersionAntivirus(String versionAntivirus) throws ClassNotFoundException, SQLException {
        this.versionAntivirus = versionAntivirus;
        int update;
        String query = "Update Altas set  versionAntivirus= '" +versionAntivirus+ "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

/*
 * Metodo que regresa las observaciones del equipo
 */
    public String getObservProb() {
        return observProb;
    }

/*
 * Método que asigna observaciones al equipo.
 */
    public void setObservProb(String observProb) throws ClassNotFoundException, SQLException {
        this.observProb = observProb;
        int update;
        String query = "Update Altas set observP = '" +observProb+ "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

/*
 * Metodo que regresa los segmentos del equipo
 */
    public String getSegmentos() {
        return segmentos;
    }

/*
 * Método que asigna los segmentos al equipo.
 */
    public void setSegmentos(String segmentos) throws ClassNotFoundException, SQLException {
        this.segmentos = segmentos;
        int update;
        String query = "Update Altas set segmentos = '" +segmentos+ "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

/*
 * Metodo que regresa el nombre del usuario que se le asigno el equipo
 */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

/*
 * Método que asigna el nombre del usuario dl equipo.
 */
    public void setNombreUsuario(String nombreUsuario) throws ClassNotFoundException, SQLException {
        this.nombreUsuario = nombreUsuario;
        int update;
        String query = "Update Altas set  nombreUsuario= '" +nombreUsuario + "' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }

/*
 * Metodo que regresa el nombre del responsable del equipo
 */
    public String getResponsableLev() {
        return responsableLev;
    }

/*
 * Método que asigna el nombre del responsable del equipo.
 */
    public void setResponsableLev(String responsableLev) throws ClassNotFoundException, SQLException {
        this.responsableLev = responsableLev;
        int update;
        String query = "Update Altas set responsableLevantamiento = '"+responsableLev +"' where idAltas= " + this.idAltas;
        ConexionBD conexion = new ConexionBD();
        conexion.conectarBD();
        update = conexion.actualizarBD(query);
        conexion.desconectarBD();        
    }
    
    
    
}
