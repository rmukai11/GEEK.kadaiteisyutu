<%-- 
    Document   : swich文2
    Created on : 2018/06/25, 15:30:58
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
          char word = 'A';
             switch ( word ) {
             case 'A' :
             out.print("英語");
              break;
              case 'あ':
              out.print("日本語です");
              break;
              default:
              break;
        
              
              
              
            
            
            
        }
            %>
            
    </body>
</html>
