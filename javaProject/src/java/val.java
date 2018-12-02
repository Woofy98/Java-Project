
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class val {
     public static String  add(String a,String name) throws SQLException, ClassNotFoundException
      {
     
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
        Statement st=con.createStatement();
        
        ResultSet rs= st.executeQuery("Select * from register_user where q1='"+a+"'  and email='"+name+"'");
        
        int flag=0;
        while(rs.next())
        {
           String  s1=rs.getString("q1");
            String s2=rs.getString("email");
            
            if(s1.equals(a)&& s2.equals(name))
            {
                response.sendRedirect("newpassword.html");
                return("ok verified"+"\n");
               
           
              //  response.sendRedirect("test.html");     
            }
           
        }
     System.out.println("fdkhb");
    return "sklnghuj";      
     
}
     public static void main(String args[]) throws SQLException, ClassNotFoundException
             {
                 val.add("Mount Carmel","soodradhika98@gmail.com");
             }
}

