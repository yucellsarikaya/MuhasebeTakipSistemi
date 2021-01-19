/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Class.Buying;
import Class.StokList;
import Database.Conn;
import Database.UserDatabase;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sarik
 */
public class ServletBuying extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletBuying</title>");            
            out.println("</head>");
            out.println("<body>");    
            
            out.println("</body>");
            out.println("</html>");
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
            String urunAdi = request.getParameter("urunAdi");
            float ucret = Float.parseFloat(request.getParameter("ucret"));
            float kdv = Float.parseFloat(request.getParameter("kdv"));
            int adet = Integer.parseInt(request.getParameter("adet"));
            String musteriAdi = request.getParameter("musteriAdi");
            String sirketAdi = request.getParameter("sirketAdi");
            String telefon = request.getParameter("tel");
            HttpSession session=request.getSession(); 
            int x = (int) session.getAttribute("id");
            Buying alis = new Buying(urunAdi, ucret, kdv, adet, musteriAdi, sirketAdi, telefon, x);
            StokList stoklist = new StokList(urunAdi, ucret, kdv, adet, x);
            UserDatabase regUser = new UserDatabase(Conn.getConnection());
            
            if (regUser.urunKayit(alis, stoklist)) {
                String mesaj = "mesaj";
                session.setAttribute("mesaj",mesaj); 
               response.sendRedirect("buying.jsp");
            } else {
                response.sendRedirect("error.jsp");
            }    
        
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
