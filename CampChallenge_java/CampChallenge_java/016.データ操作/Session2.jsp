<%-- 
    Document   : Session2
    Created on : 2018/08/07, 15:44:23
    Author     : amuro
--%>   
<%      
    //セッション開始の指示
        HttpSession GO = request.getSession();

    //フォームに打ち込まれたfile達を読み込みsaveする
        String save1 = (String)GO.getAttribute("file1");
        String save2 = (String)GO.getAttribute("file2");
        String save3 = (String)GO.getAttribute("file3");
        
    //初期値を空文字にする
    if(save1 == null){
        save1 ="";
    }
    if(save3 == null){
        save3 ="";
    }
    
        
    //性別の初期値設定(男性）
    boolean man = false;
        if(save2 != null){
              if(save2.equals("1")){
                  man = true;
              }
          } 
        //(女性)
    boolean woman =false;
          if(save2 != null){
              if(save2.equals("2")){
                  woman = true;
              }
          } 
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./Session2-2.jsp" method="post">
    
    <!-- //フォーム作成 -->
    
    名前:<input type="text" name="DataA" value="<%=save1%>"><br>
    性別:<input type="radio" name="DataB"value="1" <%if(man){out.print("checked");}%>>男性
        <input type="radio" name="DataB"value="2"<%if(woman){out.print("checked");}%>>女性<br>
    趣味:<textarea name="DataC"><%=save3%></textarea>
      <input type="submit" value="保存">
      
      
    </form>
         </body>
            <html>
 