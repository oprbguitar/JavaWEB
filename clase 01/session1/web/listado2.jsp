<%@ page import="librerias.Conexion"%>
<%@ page import="java.sql.*"%>
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
         ResultSet datos =cnx.consulta("select*from departments");
         while(datos.next()){
        %>
       <tr>
             <td><%out.println(datos.getInt(1));%></td>
             <td><%out.println(datos.getString(2));%></td>
             <td><%out.println(datos.getString(3));%></td>
             <td><%out.println(datos.getString(4));%></td>
       </tr>
       <%  }   cnx.cerrar();
       %>
        </table>

    </body>
</html>
