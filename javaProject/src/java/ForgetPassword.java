/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class ForgetPassword extends HttpServlet {

 @Override
 public void  doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();   
           
             String email = request.getParameter("Email");
            String name=request.getParameter("sname");
 
           
   String s;
   
     try {
         s = val.add(name,email);
         out.println(s);
     } catch (SQLException | ClassNotFoundException ex) {
         Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
     }
   
   
              
     
}
   
}     
    

