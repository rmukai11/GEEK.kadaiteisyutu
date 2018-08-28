<%-- 
    Document   : query_string_output
    Created on : 2018/08/06, 14:03:49
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
         
            //入力値を表示
            
        String total = request.getParameter("total");
            out.println("合計金額は"+ total + "です" + "<br>");
            
        String count = request.getParameter("count");
            out.print("数量は" + count + "です" + "<br>");
            
           //選択項目を文字列から数値化 
        String A = request.getParameter("A");
        int ty = Integer.parseInt(A);
            if(ty == 1){
                out.print("雑貨購入です" + "<br>");
            }else if(ty == 2){
                out.print("生鮮食品購入です" + "<br>");
            }else{
                out.print("その他購入です" + "<br>");
            }
            
            //商品の単価
            String to = request.getParameter("total");
                int TO = Integer.parseInt(to);
            String co = request.getParameter("count");  
                int CO = Integer.parseInt(co);
                int PO =(TO / CO);
            
            out.print("商品単価は" + PO + "です" + "<br>");
            
            //ポイント付与
            if(TO < 3000){
                out.print(TO * 0 +"ポイントプレセント");
            }else if(TO < 5000){
                out.print((int)(TO * 0.04)+ "ポイントプレゼント");
            }else{
                out.print((int)(TO * 0.05) + "ポイントプレゼント");
            }
            
            %>
            
    </body>
</html>
