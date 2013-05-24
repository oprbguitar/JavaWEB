
package Aplicaciones;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class Ejemplo5 extends HttpServlet {
    public Connection con;
    public Statement sen;  // manejar diferentes comandos sql
    public ResultSet res;   // para guardar un conj de datos
    public ResultSetMetaData meta;
    public  int campos;// permite conocer la estructura de cada dato
    public String driver="oracle.jdbc.driver.OracleDriver";
    public String cadena="jdbc:oracle:thin:@localhost:1521:XE";
    public String usuario="hr";
    public String clave="hr";
    PrintWriter salida;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       salida = response.getWriter();
       salida.println("<html>");
       salida.println("<head><title>Aplicacion Servlet</title></head>");
        try {
            conectar();
            imprimir();
            cerrar();                    
        } catch (Exception e) {
        }
      
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
      public void conectar()throws SQLException, ClassNotFoundException{
      
        Class.forName(driver);
        con= DriverManager.getConnection(cadena,usuario,clave);
        sen=con.createStatement();
       }
       public void imprimir() throws SQLException{
           res=sen.executeQuery("select * from employees");
           meta=res.getMetaData();
           salida.println("<table>"); 
           while (res.next()) {
             salida.println("</tr");
               for (int i = 1; i < meta.getColumnCount(); i++) {
                   salida.println("<td>"+res.getString(i)+"</td>");
               }
               salida.println("</tr>");
            }
           salida.println("</table>");
        }
       public void cerrar()throws SQLException{
        res.close();
        sen.close();
        con.close();
        }

}
