<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="librerias.Conexion"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empresa abc</title>
    </head>
    <body>
        <h1>Empresa MORE-listado de empleados</h1>
        <table border=1>
        <%
         Conexion cnx= new Conexion();
         cnx.conectarBD();
         ResultSet datos =cnx.consulta("select*from jobs");
         while(datos.next()){
        %>
       <tr>
             <td><%=datos.getString(1)%></td> <!-- forma de imprimir rapida--> 
             <td><%=datos.getString(2)%></td>
             <td><%=datos.getString(3)%></td>
             <td><%=datos.getString(4)%></td>
       </tr>
       <%  }   cnx.cerrar();
       %>
        </table>

    </body>
</html>

