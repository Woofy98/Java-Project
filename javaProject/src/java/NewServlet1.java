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
public class NewServlet1 extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        try{
        String id1 = req.getParameter("id");
        String apt_name = req.getParameter("name");
        String descr = req.getParameter("desc");
        String path = req.getParameter("path");
        String loca = req.getParameter("loc");
         String owner = req.getParameter("owner");
          String link = req.getParameter("href");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
       Statement st=con.createStatement();
       String query="insert into myapartments(id,name,description,path,location,owner,href)"+"values(?,?,?,?,?,?,?)";
       String query1="insert into myapartments(ApartmentName)"+"values(?)";
       PreparedStatement ps=con.prepareStatement(query);
       ps.setString(1,id1);
       ps.setString(2,apt_name);
       ps.setString(3,descr);
       ps.setString(4,path);
       ps.setString(5,loca);
       ps.setString(6,owner);
       ps.setString(7,link);
     
       
       ps.execute();
       
      res.sendRedirect("test.jsp");
       con.close();
//        ResultSet rs = ps.executeQuery();
       
}
        catch(Exception e)
        {
            out.println("error!" + e);
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
