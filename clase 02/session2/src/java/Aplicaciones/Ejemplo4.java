
package Aplicaciones;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ejemplo4 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter salida = response.getWriter();
        salida.println("<html>");
        salida.println("<head><title>Aplicacion - Servlets 4 </title></head>");
        salida.println("<body>");
        salida.println("<form action='valida.jsp' method='post'>");
        salida.println("<table>");
        salida.println("<tr>");
        salida.println("<td>Email</td>");
        salida.println("<td><input type='text' name='txtEmail' value=''</td>");
        salida.println("</tr>");
        salida.println("<tr>");
        salida.println("<td>Password</td>");
        salida.println("<td><input type='password' name='txtPassword' value=''</td>");
        salida.println("</tr>");
        salida.println("<tr>");
        salida.println("<td><input type='submit' value='Aceptar'</td>");
        salida.println("<td><input type='reset' value='Limpiar'</td>");
        salida.println("</tr>");
        salida.println("</table></form></body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
