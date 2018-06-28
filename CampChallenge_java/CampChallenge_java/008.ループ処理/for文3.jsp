<%-- 
    Document   : for文3
    Created on : 2018/06/26, 17:06:21
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
            int result = 0;
            for ( int i = 1; i <= 100; i++){
                
                result += i;
            }
            
                out.print(result+"<br>");
            
            %>
            
    </body>
</html>
