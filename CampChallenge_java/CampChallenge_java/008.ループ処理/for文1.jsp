<%-- 
    Document   : for文1
    Created on : 2018/06/26, 14:38:46
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
             long total = 1;
            for(int i = 1; i <= 20; i++){
                
               total *=8;
               out.print(i+"回目:"+total+"<br>");
               
            }
                 out.print(total);
           

                        
                        
            
                
                
                
                %>
                
                
    </body>
</html>
