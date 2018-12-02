import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class newpass extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try{
                     String pass=request.getParameter("newPass");
                     String conf=request.getParameter("confirmPass");
                     String nmail=request.getParameter("mail");
                     Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
        Statement st=con.createStatement();
                     String query="update register_user set pass='"+pass+"',confirmpass='"+conf+"'  where email='"+nmail+"'";
                     int i=st.executeUpdate(query);
                     if(i>0)
                         response.sendRedirect("index_1.html");
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
                     
    }

}
