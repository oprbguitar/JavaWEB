package Aplicaciones;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ejemplo1 extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html"); // para devolver resultados en formato html
        PrintWriter salida = res.getWriter();
        salida.println("");
        salida.println("<head><title>Aplicacion 1 - Servlets </title></head>");
        salida.println("<body>");
        salida.println("<h1>Primer ejemplo - servlets </h1>");
        salida.println("......................................");
        salida.println("</body></html>");
      }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse res)
            throws ServletException, IOException {
        processRequest(request, res);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse res)
            throws ServletException, IOException {
        processRequest(request, res);
    }

}
