<%-- 
    Document   : Session2-2
    Created on : 2018/08/14, 12:30:43
    Author     : amuro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //キャラ設定
        request.setCharacterEncoding("UTF-8");
    //セッション開始指示
        HttpSession GO = request.getSession();
    //フォームにセーブされたfileをDataに初期値として保存
        GO.setAttribute("file1", request.getParameter("DataA"));
        GO.setAttribute("file2", request.getParameter("DataB"));
        GO.setAttribute("file3", request.getParameter("DataC"));
    %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
        
        // 名前
        out.print("名前は"+request.getParameter("DataA")+ "<br>");
        // 性別
        String A = request.getParameter("DataB");
            int gender = Integer.parseInt(A);
                if(gender == 1){
                    out.print("男性です" + "<br>");
                }else{
                    out.print("女性です" + "<br>");
                }
        // 趣味
        out.print("趣味は"+request.getParameter("DataC"));
%>
        
    </body>
</html>
