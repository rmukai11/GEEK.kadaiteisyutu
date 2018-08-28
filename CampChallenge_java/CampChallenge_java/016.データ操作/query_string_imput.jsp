<%-- 
    Document   : query_string_imput
    Created on : 2018/08/06, 12:58:43
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
    <form action="query_string_output.jsp" method="get">
        総額：<input type="text" name="total"><br>
        数量：<input type="number" name="count"><br>
        種別：<input type="radio" name="A"value="1">雑貨 <input type="radio"name="A"value="2">生鮮食品　<input type="radio"name="A"value="3">その他<br>
            <input type="submit" value="送信">
    
    </form>
    </body>
</html>
