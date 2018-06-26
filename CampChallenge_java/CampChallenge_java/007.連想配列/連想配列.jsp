<%-- 
    Document   : 連想配列
    Created on : 2018/06/26, 13:28:05
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
        <%@ page import="java.util.HashMap" %>
        <%
            HashMap<String,String> prof=new HashMap<String,String>();
//            HashMap<String,String> prof2=
//                    new HashMap<>();
//            HashMap<String,String> prof3=
//                    new HashMap<>();
//            HashMap<String,String> prof4=
//                    new HashMap<>();
            prof.put("1","AAA"); 
            prof.put("name","word");
            prof.put("Soeda","33");
            prof.put("20","20");
            out.print(prof);
//            prof2.put("name","word");
//            prof3.put("Soeda","33");
//            prof4.put("20","20");
//            
            
            
            %>
            
            
                
    </body>
</html>
