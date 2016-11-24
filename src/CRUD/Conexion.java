

package CRUD;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alicia Sandoval
 */

public class Conexion {
    
    public static final String user= "root";
    public static final String password= "";   
    public static final String URL = "jdbc:mysql://localhost:3306/aplicacion";


    public Connection connection;
    
    public Connection getConnection(){
        return connection;
    }
    
    public void setConnection(Connection connection){
        this.connection = connection;
    }
    
     public Conexion conectar(String host, String bd, String user, String pass){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String BaseDeDatos = "jdbc:mysql://" + host + "/" +
                    bd + "?user=" + user + "&password=" + pass;
            setConnection(DriverManager.getConnection(BaseDeDatos));
            if(getConnection() != null){
                System.out.println("Conexion Exitosa");
            } else {
                System.out.println("Conexion Fallida");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }
    
    public ResultSet consultar(String sql){
        ResultSet resultado;
        try {
            Statement sentencia = getConnection().createStatement(
                ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar");
            e.printStackTrace();
            return null;
        }
        return resultado;
    }
    
    public boolean ejecutar(String sql){
        try {
            Statement sentencia = getConnection().createStatement(
                ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql);
            sentencia.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    

    
    
}
