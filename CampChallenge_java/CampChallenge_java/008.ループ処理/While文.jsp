<%-- 
    Document   : While文
    Created on : 2018/06/27, 17:22:31
    Author     : amuro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int C = 1000;
             int count = 1;
              while(C>100) {
                  
              C /= 2;
              
              count--;}
              
              out.print(C);
             


              %>
           
              
              
              
              
              
              
              
              
            
    </body>
</html>
