/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author hp
 */

  
public class InsertImage {  
public static void main(String[] args) {  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe");  
              
PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
ps.setString(1,"sonoo");  
  
FileInputStream fin=new FileInputStream("images/pic7.jpg");  
ps.setBinaryStream(2,fin,fin.available());  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
          
con.close();  
}catch (Exception e) {e.printStackTrace();}  
}  
}  
   
