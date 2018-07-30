/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Camp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author amuro
 */
public class Method8 extends HttpServlet {

    String[] userProfile(int Result){
        String[] data1 = {"1","技育太郎","東京","男","プログラマー"};
        String[] data2 = {"2","技育花子","北海道","女","システムエンジニア"};
        String[] data3 = {"3","技育三郎","大阪","男","Webエンジニア"};
        
           if(Result == Integer.parseInt(data1[0])) {
               return data1 ;
           }else if(Result == Integer.parseInt(data2[0])){
               return data2;
           }else if(Result == Integer.parseInt(data3[0])){
               return data3;
            }else{
               return null;
           }
    }
    
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
            /* TODO output your page here. You may use following sample code. */
           
            Random rand = new Random();
            Integer index = rand.nextInt(3);
            index = (index + 1);
            
            
            
             // 三回繰り返す
            for(int A =1; A <=3; A++ ){
                
               //繰り返しを用いて表示
                String[] Data = userProfile(A);
                for(int i = 1; i < Data.length; i++){
                    out.print(Data[i] + "<br>");
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
