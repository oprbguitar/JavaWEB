package librerias;
import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {
    public Connection con;
    public Statement sen;  // manejar diferentes comandos sql
    public ResultSet res;   // para guardar un conj de datos
    public ResultSetMetaData meta; // permite conocer la estructura de cada dato
    public String driver="oracle.jdbc.driver.OracleDriver";
    public String cadena="jdbc:oracle:thin:@localhost:1521:XE";
    public String usuario="hr";
    public String clave="hr";
    public int campos;
    
    public void conectarBD(){
        try {
        Class.forName(driver);
        con= DriverManager.getConnection(cadena,usuario,clave);
        sen=con.createStatement();
        JOptionPane.showMessageDialog(null, "Conexion OK");
         } catch (ClassNotFoundException e1) {
             JOptionPane.showMessageDialog(null, "Error en el driver");
        }catch (SQLException e2) {
             JOptionPane.showMessageDialog(null, "Error en la conexion");  
        }
    }
    public ResultSet consulta(){
            try {
           res=sen.executeQuery("select*from employees");
           meta=res.getMetaData();
           campos=meta.getColumnCount(); 
           } catch (SQLException e3) {
               JOptionPane.showMessageDialog(null, "Error en la consulta");  
            }
            return res;
    }
    public void cerrar(){
        try {
            res.close();
            sen.close();
            con.close();
        } catch (Exception e4) {
            JOptionPane.showMessageDialog(null, "Error al finalizar");
        }
    }
}
