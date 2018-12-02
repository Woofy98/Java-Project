/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.*;

/**
 *
 * @author hp
 */
public class SignUpServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        try{
        String name = req.getParameter("Name");
        String email = req.getParameter("Email");
        String password = req.getParameter("pass");
        String confirm = req.getParameter("confirmpass");
        String q1 = req.getParameter("Ques1");
        String q2 = req.getParameter("Ques2");
        String q3 = req.getParameter("Ques3");
        String option = req.getParameter("option");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
       Statement st=con.createStatement();
       String query="insert into register_user(name,email,pass,confirmpass,q1,q2,q3,option)"+"values(?,?,?,?,?,?,?,?)";
       
       PreparedStatement ps=con.prepareStatement(query);
       ps.setString(1,name);
       ps.setString(2,email);
       ps.setString(3,password);
       ps.setString(4,confirm);
       ps.setString(5,q1);
       ps.setString(6,q2);
       ps.setString(7,q3);
       ps.setString(8,option);
       
       ps.execute();
       con.close();
       res.sendRedirect("index_1.html");
//        ResultSet rs = ps.executeQuery();
       
}
        catch(Exception e)
        {
        out.println("error!");
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
