
<html>
    <head>
       
        <title>Aplicacion JSP </title>
    </head>
    <body>
      <% 
      String usuario=request.getParameter("txtEmail");
      String clave=request.getParameter("txtPassword");
      if(usuario.equals("pierre@gmail.com")&& clave.equals("pierre")){
              out.println("<h1>Bienvenido</h1>");
      }else{
          out.println("<h1>Error</h1>");
      }
      %>
     
    </body>
</html>
