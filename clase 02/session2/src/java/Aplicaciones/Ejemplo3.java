
package Aplicaciones;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ejemplo3 extends HttpServlet {
 public String tmail, tclave;
 public String xemail="pierre@gmail.com";
 public String xclave = "pierre";
 public PrintWriter sal;
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        sal =res.getWriter();
        tmail=req.getParameter("txtEmail");
        tclave=req.getParameter("txtPassword");
        cabecera(sal);
        if(valida()==true)
            correcto(sal);
        else
            incorrecto(sal);
        pie(sal);
        }

   
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        processRequest(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        processRequest(req, res);
    }
    public void cabecera(PrintWriter salida){
        salida.println("<html><head><title>Aplicacion 3 - Servlets </title></head>");
    }
    public void correcto(PrintWriter salida){
        salida.println("<body>");
        salida.println("<h1>Bienvenidos</h1>");
    }
     public void incorrecto(PrintWriter salida){
        salida.println("<body>");
        salida.println("<h1>Error</h1>");
    }
      public void pie(PrintWriter salida){
        salida.println("<body>");
        salida.println("</body></html>");
    }
     public boolean valida(){
        boolean cierto=false;
        if(tmail.equals(xemail) && tclave.equals(xclave))
            cierto=true;
        return cierto;
    }

}
