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
         String cargo=request.getParameter("txtCargo");
         ResultSet datos =cnx.consulta("select * from employees where job_id='"+cargo+"'");
        %>
        <tr bgcolor="orange">
            <% for(int i=1; i<cnx.campos;i++){%>  
            <th> <%=cnx.meta.getColumnName(i)%></th>
            <%}%>
        </tr>
        <%
         while(datos.next()){
         %>
       <tr>
        <% for(int i=1; i<cnx.campos;i++){%>
        <td><%=datos.getString(i) %></td>
        <%}%>
       </tr>
       <%  }   cnx.cerrar();
       %>
        </table>

    </body>
</html>