import java.io.*;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.ResultSet;

/**
 *
 * @author hp
 */
public class LoginServlet extends HttpServlet {

    public void processRequest(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out=res.getWriter();
        String email = req.getParameter("Email");
        String password = req.getParameter("pass");
        HttpSession session = req.getSession();
        String s1="";
        String s2="";
        String s3="";
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
        Statement st=con.createStatement();
        
        ResultSet rs= st.executeQuery("Select * from register_user");
        
        while(rs.next())
        {
            s1=rs.getString("email");
            s2=rs.getString("pass");
            s3=rs.getString("option");
            if(email.equals(s1)&&password.equals(s2)&&s3.equals("Dealer"))
            {
                out.print("Welcome"+"\n");
                session.setAttribute("email",s1);
                res.sendRedirect("test.jsp");
                //HttpSession sess=req.getSession();
                //sess.setAttribute("userType", "dealer");
            }
           else  if(email.equals(s1)&&password.equals(s2)&&s3.equals("customer"))
            {
                out.print("Welcome"+"\n");
                session.setAttribute("email",s1);
                res.sendRedirect("temp_user.jsp");
            }
            else
            {
                out.println("No record found");
                // res.sendRedirect("index.html");
            }
        }
        }
        catch (Exception e)
        {
            
            out.print(e);
        }
    }
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
        processRequest(req, res) ;
    }
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
         processRequest(req, res) ;
        
    }
}

