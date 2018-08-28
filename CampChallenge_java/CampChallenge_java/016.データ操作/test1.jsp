<%-- 
    Document   : DATA1
    Created on : 2018/08/02, 16:12:50
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
// テキストボックスの情報
out.print(request.getParameter("txtName"));
// ラジオボタンの情報
out.print(request.getParameter("rdoSample"));
// テキストエリアの情報
out.print(request.getParameter("mulText"));
%>
    </body>
</html>
