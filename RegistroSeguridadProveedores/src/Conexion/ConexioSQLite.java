package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexioSQLite {

    public static Connection conectar = null;
    public static Statement sentencia;
    public static ResultSet resultado;
    public static String query = "";

//METODO DE CONEXION
    public void coneccionbase() {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            conectar = DriverManager.getConnection("jdbc:sqlite:ValidacionesSQLite.db");
            sentencia = conectar.createStatement();
            System.out.println("CONECTO BIEN ...");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("CONECTO MAL ....");
        }
    }

    //METODO CONECTAR TABLAS
    public Connection Conectar() {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            conectar = DriverManager.getConnection("jdbc:sqlite:ValidacionesSQLite.db");
            System.out.println("CONECTO BIEN TABLA ........");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conectar;
    }

//METODOS DE DESCONEXION
    public static void cerrar() {
        try {
            conectar.close();
            System.out.println("CONEXION CERRADA ...");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("NO SE CERRO CONEXION ...");
        }
    }

//METODO DE INSERTAR
    public boolean insert_registro(
            String FECHA_INGRESO,
            String FECHA_SALIDA,
            String NUMERO_FICHA,
            String NOMBRE_CONDUCTOR,
            String EMPRESA,
            String CEDULA,
            String PLACA,
            String AUTORIZADO,
            String GUARDA,
            String ESTADO,
            String OBSERVACIONES) {

        try {        
                                                         
            query = "INSERT INTO REGISTRO_SEGURIDAD "
                    + "(ID_REGISTRO, "
                    + "FECHA_ENTRADA, "
                    + "FECHA_SALIDA, "
                    + "N_FICHA, "
                    + "NOMBRE_CONDUCTOR,"
                    + "EMPRESA, "
                    + "CEDULA, "
                    + "PLACA, "
                    + "AUTORIZADO, "
                    + "GUARDA, "
                    + "ESTADO, "
                    + "OBSERVACIONES ) "
                    + "VALUES "
                    + "(NULL,'" + FECHA_INGRESO + "' ,'" + FECHA_SALIDA + "', " + NUMERO_FICHA + ", '" + NOMBRE_CONDUCTOR + "', '" + EMPRESA + "', " + CEDULA + ","
                    + "'" + PLACA + "', '" + AUTORIZADO + "','" + GUARDA + "' , '" + ESTADO + "', '" + OBSERVACIONES + "') ";
            System.out.println(query);

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }
    }

    //METODO DE ACTUALIZAR REGISTROS
    public boolean upgrade_registro(String ID,
            String FECHA_INGRESO,
            String FECHA_SALIDA,
            String NUMERO_FICHA,
            String NOMBRE_CONDUCTOR,
            String EMPRESA,
            String CEDULA,
            String PLACA,
            String AUTORIZADO,
            String GUARDA,
            String ESTADO,
            String OBSERVACIONES) {

        try {

            query = "UPDATE"
                    + " REGISTRO_SEGURIDAD"
                    + " SET "
                    + "  FECHA_ENTRADA = '" + FECHA_INGRESO + "',"
                    + "  FECHA_SALIDA = '" + FECHA_SALIDA + "',"
                    + "  N_FICHA = '" + NUMERO_FICHA + "',"
                    + "  NOMBRE_CONDUCTOR = '" + NOMBRE_CONDUCTOR + "',"
                    + "  EMPRESA = '" + EMPRESA + "',"
                    + "  CEDULA = '" + CEDULA + "',"
                    + "  PLACA = '" + PLACA + "',"
                    + "  AUTORIZADO = '" + AUTORIZADO + "',"
                    + "  GUARDA = '" + GUARDA + "',"
                    + "  ESTADO = '" + ESTADO + "',"
                    + "  OBSERVACIONES = '" + OBSERVACIONES + "'"
                    + " WHERE"
                    + "  ID_REGISTRO = " + ID + ";";

            System.out.println(query);
            
            sentencia.executeUpdate(query);
            System.out.println("ACTUALIZADO ...");

           
            
            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ACTUALIZADO ...");
            return false;

        }
    }


 
    //METODO PARA INSERTAR AUTORIZADO
    public boolean insert_autorizado(
            String NOMBRE) {

        try {
            query = "INSERT INTO AUTORIZACION "
                    + "(ID_AUTORIZACION, NOMBRE_COMPLETO )"
                    + " VALUES "
                    + " (NULL,'" + NOMBRE + "')";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }   
    
    //METODO PARA ACTUALIZAR AUTORIZADO
    public boolean upgrade_autorizado(String ID,
            String NOMBRE) {

        try {
            query = "UPDATE"
                    + " AUTORIZACION "
                    + " SET "
                    + "  NOMBRE_COMPLETO = '" + NOMBRE.toUpperCase() + "'"
                    + " WHERE"
                    + "  ID_AUTORIZACION = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }
      
        //METODO PARA ELIMINAR  AUTORIZADO
    public boolean delete_autorizado(String REGISTRO) {

        try {

            query = "DELETE FROM AUTORIZACION WHERE ID_AUTORIZACION = " + REGISTRO + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    
    
        //METODO PARA INSERTAR GUARDA
    public boolean insert_guarda(
            String NOMBRE) {

        try {
            query = "INSERT INTO GUARDAS "
                    + "(ID_GUARDAS, NOMBRE_COMPLETO )"
                    + " VALUES "
                    + " (NULL,'" + NOMBRE + "')";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }   
    
    //METODO PARA ACTUALIZAR GUARDA
    public boolean upgrade_guarda(String ID,
            String NOMBRE) {

        try {
            query = "UPDATE"
                    + " GUARDAS "
                    + " SET "
                    + "  NOMBRE_COMPLETO = '" + NOMBRE.toUpperCase() + "'"
                    + " WHERE"
                    + "  ID_GUARDAS = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }
      
        //METODO PARA ELIMINAR  GUARDA
    public boolean delete_guarda(String REGISTRO) {

        try {

            query = "DELETE FROM GUARDAS WHERE ID_GUARDAS = " + REGISTRO + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    
    
    //METODO PARA INSERTAR CONDUCTOR
    public boolean insert_conductor(
            String CEDULA,
            String NOMBRE,
            String EMPRESA,
            String PLACA) {

        try {
            query = "INSERT INTO CONDUCTORES "
                    + "(ID_CONDUCTOR, CEDULA, NOMBRE_CONDUCTOR, EMPRESA, PLACA_VEHICULO )"
                    + " VALUES "
                    + " (NULL,'" + CEDULA + "','"+ NOMBRE +"','" + EMPRESA + "','" + PLACA + "')";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }   
    
    //METODO PARA ACTUALIZAR CONDUCTOR
    public boolean upgrade_conductor(String ID,
            String CEDULA,
            String NOMBRE,
            String EMPRESA,
            String PLACA) {

        try {
            query = "UPDATE"
                    + " CONDUCTORES "
                    + " SET "
                    + "  CEDULA = '" + CEDULA.toUpperCase() + "',"
                    + "  NOMBRE_CONDUCTOR = '" + NOMBRE.toUpperCase() + "',"
                    + "  EMPRESA = '" + EMPRESA.toUpperCase() + "',"
                    + "  PLACA_VEHICULO = '" + PLACA.toUpperCase() + "'"
                    + " WHERE"
                    + "  ID_CONDUCTOR = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("ACTUALIZADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }
        
        //METODO PARA ELIMINAR CONDUCTOR
    public boolean delete_conductor(String REGISTRO) {

        try {

            query = "DELETE FROM CONDUCTORES WHERE ID_CONDUCTOR = " + REGISTRO + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    

    
    
    
}
