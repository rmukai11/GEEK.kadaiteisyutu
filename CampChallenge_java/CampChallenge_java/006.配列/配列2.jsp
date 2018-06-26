<%-- 
    Document   : 配列2
    Created on : 2018/06/26, 10:47:51
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
        <% String[] data = {"10", "100", "soeda", "hayashi", "-20", "180", "END"};
              
            
             
              data[2] = "33";
              out.print(data[2]);
              
              
            
        %>
        
    </body>
</html>
