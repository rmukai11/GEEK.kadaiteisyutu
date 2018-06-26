<%-- 
    Document   : 配列1
    Created on : 2018/06/26, 10:11:09
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
//           String[] data = {"10", "100", "soeda". "hayashi", "-20", "118", "END"};
             String[] data = {"10", "100", "soeda", "hayashi", "-20", "180", "END"};
              out.print(data[4]);
              
%>

    </body>
</html>
