<%-- 
    Document   : Kadai3-2
    Created on : 2018/08/05, 16:44:14
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
             // 受け取るパラメータの文字コード
request.setCharacterEncoding("UTF-8");

out.print(request.getParameter("USERtel"));
out.print(request.getParameter("USERurl"));
%>

    </body>
</html>
