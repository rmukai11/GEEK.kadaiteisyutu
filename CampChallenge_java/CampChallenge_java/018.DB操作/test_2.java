/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author amuro
 */
public class test_2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
//          protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
            Connection DB = null;
            PreparedStatement db_st = null;
            ResultSet data = null;
    
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                DB = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?serverTimezone=JST", "mukai", "37519418");
                out.print("接続成功！");
                
                
                db_st = DB.prepareStatement("insert into profiles (profilesID,name,tel,age,birthday) values (?,?,?,?,?)");
                db_st.setInt(1, 5);
                db_st.setString(2, "向井 良太");
                db_st.setString(3,"090-1111-2222");
                db_st.setInt(4,24);
                db_st.setString(5,"1994-05-21");
                
                int A = db_st.executeUpdate();
                
                DB.close();
                db_st.close();
//                data.close();
    
        
            } catch (SQLException e_con) {
                out.println("接続失敗" + e_con.toString());
            } catch(Exception e){
                out.println("接続時にエラーが発生しました。" + e.toString());
            } finally{
                if (DB != null){
                    try {
                        DB.close();
                    } catch (SQLException ex) {
                        out.print(ex.getMessage());
                    }
                }
            }
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }



    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
