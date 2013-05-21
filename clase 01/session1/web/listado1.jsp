<%@ page import="librerias.Conexion"%>
<%@ page import="java.sql.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empresa abc</title>
    </head>
    <body>
        <h1>Empresa MORE-listado de empleados</h1>
        <%
         Conexion cnx= new Conexion();
         cnx.conectarBD();
         ResultSet datos =cnx.consulta();
         out.println("<table border=1>");
         while(datos.next()){
             out.println("<tr>");
             out.println("<td>"+datos.getInt(1)+"</td>");
             out.println("<td>"+datos.getString(2)+"</td>");
             out.println("<td>"+datos.getString(3)+"</td>");
             out.println("<td>"+datos.getString(4)+"</td>");
             out.println("</tr>");
         }
         out.println("</table>");
         cnx.cerrar();
        %>
    </body>
</html>
