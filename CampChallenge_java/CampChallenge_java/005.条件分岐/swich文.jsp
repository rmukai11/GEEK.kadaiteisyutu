<%-- 
    Document   : swich文
    Created on : 2018/06/25, 15:02:11
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
        <% int num = 3;
switch ( num ) {
    case 1:
        out.print("ONE");
        break;
    case 2:
        out.print("TWO");
        break;
    default:
        out.print("想定外です");
        break;
}
         %>
         
    </body>
</html>
