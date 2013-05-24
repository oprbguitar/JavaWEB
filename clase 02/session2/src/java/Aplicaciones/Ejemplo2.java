package Aplicaciones;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ejemplo2 extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter sal = res.getWriter();
        String email=req.getParameter("txtEmail");
        String pass=req.getParameter("txtPassword");
        sal.println("<head><title>Ejemplo 2 - Servlets </title></head>");
        sal.println("<body>");
        if(email.equals("pierre@gmail.com"))
            if(pass.equals("pierre")){
                sal.println("<h1>Bienvenidos</h1>");
                sal.println("Tus datos registrados son correctos</br>");
                sal.println("Email: "+email+"</br>");
                sal.println("Password: "+pass+"</br>");
                sal.println("<a href='Ejemplo1'>Ingresar<a>");
              } else{
                sal.println("Error, password errado</br>");
                sal.println("<a href='login.jsp'>Regresar<a>");
            }
        else{
            sal.println("Error,Email incorrecto</br>");
            sal.println("<a href='login.jsp'>Regresar<a>");
        }
                
                
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
