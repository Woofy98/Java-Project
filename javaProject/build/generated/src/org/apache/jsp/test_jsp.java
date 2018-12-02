package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\t<title>YOUR HOME</title>\n");
      out.write("\t<link rel=\"icon\" type=\"image/jpg\" href=\"Capture.jpg\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"abc.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width , initial-scale=1\">\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("    \t\t$(\"#mob\").click(function(){\n");
      out.write("        \t\t$('.more').slideDown(\"slow\");},function(){$('.more').slideUp(\"slow\");});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("        <style>\n");
      out.write("            @media screen and (max-width: 1335px){\n");
      out.write("                .main{\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("                .main_right{\n");
      out.write("                    width: 100%;\n");
      out.write("                    margin: 0px;\n");
      out.write("                }\n");
      out.write("                .vid iframe{\n");
      out.write("                    width: 90%;\n");
      out.write("                    margin: 0px;\n");
      out.write("                    margin-left: 5%;\n");
      out.write("                }\n");
      out.write("                .vid .v1{\n");
      out.write("                    width: 100%;\n");
      out.write("                    margin: 0px;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"header\" id=\"top\">\n");
      out.write("\t<div id=\"hhh\">\n");
      out.write("\t\t<h2>\n");
      out.write("\t\t\t<a href=\"test.jsp\"><b>YOUR HOME</b></a>\n");
      out.write("\t\t</h2>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"nnn\">\n");
      out.write("          \n");
      out.write("\t\t<span class=\"navigation_top\">\n");
      out.write("\t\t\t<a href=\"test.jsp\" style=\"text-decoration:none\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-home\">&nbsp</i>HOME\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</span>\n");
      out.write("                <span class=\"navigation_top\">\n");
      out.write("\t\t\t<a href=\"1BHKDelhi.html\" style=\"text-decoration:none\" id=\"rev\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-search\">&nbsp</i>1BHK\n");
      out.write("\t\t\t\t<i class=\"fa fa-caret-down\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("                    \n");
      out.write("\t\t</span>\n");
      out.write("                <span class=\"navigation_top\">\n");
      out.write("\t\t\t<a href=\"2BHKDelhi.html\" style=\"text-decoration:none\" id=\"rev\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-search\">&nbsp</i>2BHK\n");
      out.write("\t\t\t\t<i class=\"fa fa-caret-down\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("                    \n");
      out.write("\t\t</span>\n");
      out.write("                <span class=\"navigation_top\">\n");
      out.write("\t\t\t<a href=\"3BHKDelhi.html\" style=\"text-decoration:none\" id=\"rev\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-search\">&nbsp</i>3BHK\n");
      out.write("\t\t\t\t<i class=\"fa fa-caret-down\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("                    \n");
      out.write("\t\t</span>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t<span class=\"navigation_top\">\n");
      out.write("\t\t\t<a href=\"index_1.html\" style=\"text-decoration:none\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-home\">&nbsp</i>LOGOUT\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</span>\n");
      out.write("                \n");
      out.write("                \t\n");
      out.write("\t\t<span class=\"navigation_top\">\n");
      out.write("\t\t\t<a href=\"apartment.html\" style=\"text-decoration:none\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-home\">&nbsp</i>Apartments\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</span>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"sss\">\n");
      out.write("\t\t<a href=\"https://twitter.com/\"><i id=\"social\" class=\"fa fa-twitter\" style=\"color: #0084b4\"></i></a>\n");
      out.write("\t\t<a href=\"#\"><i id=\"social\" class=\"fa fa-instagram\" style=\"color: #fb3958\"></i></a>\n");
      out.write("\t\t<a href=\"https://www.youtube.com/\"><i id=\"social\" class=\"fa fa-youtube\" style=\"color: red\"></i></a>\n");
      out.write("\t\t<a href=\"#\"><i id=\"social\" class=\"fa fa-facebook\" style=\"color: #3B5998\"></i></a>\n");
      out.write("\t</div>\n");
      out.write("</div>,\n");
      out.write("\n");
      out.write("<div class=\"more\">\n");
      out.write("    <h4 style=\"margin-top: 0px\"><a href=\"1BHKDelhi.html\">1BHK</a></h4>\n");
      out.write("\t<h4><a href=\"2BHKDelhi.html\">2BHK</a></h4>\n");
      out.write("\t<h4><a href=\"3BHKDelhi.html\">3BHK</a></h4>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"ppp\" style=\"border-bottom: 1px solid #333;\">\n");
      out.write("\t<h2>HOME</h2>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"nw1\">\n");
      out.write("        ");
  try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
                Statement st= con.createStatement();
                String query = "select * from cities";
                ResultSet rs = st.executeQuery(query);
                int i =0;
                while(rs.next()){
                    i++;
                    if(i==1){
                        out.println("<div class=\"n1\" id=\"n11\"><a href=\'"+rs.getString(3)+"\' target=\"_self\"><img class=\"i2\" src=\'"+rs.getString(2)+"\' alt =\"Smily face\" height=\"350\" width=\"270\"><h2>"+rs.getString(1)+"</h2></a></div>");
                    }
                    else{
                        out.println("<div class=\"n1\"><a href=\'"+rs.getString(3)+"\' target=\"_self\"><img class=\"i2\" src=\'"+rs.getString(2)+"\' alt =\"Smily face\" height=\"350\" width=\"270\"><h2>"+rs.getString(1)+"</h2></a></div>");
                    }
                }
            }
        catch(Exception e){
        }
        
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"main\">\n");
      out.write("\t<div id=\"ppp\" style=\"border-bottom: 1px solid #333;\">\n");
      out.write("\t\t<h2>LATEST</h2>\n");
      out.write("\t<!--<h2 style=\"float: right; margin-right: 200;\">FEED</h2>-->\n");
      out.write("\t</div>\n");
      out.write("        ");
  try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
                Statement st= con.createStatement();
                String query2 = "select * from myapartments";
                ResultSet rs2 = st.executeQuery(query2);
                while(rs2.next()){
                       int id=rs2.getInt(1);
                        out.println("<div class=\"r1\"><div class=\"rr1\"><a href=\'"+rs2.getString(5)+"\'><img src=\'"+rs2.getString(4)+"\' height=\"250\" width=\"350\"></a></div>");
                        out.println("<div class=\"rr2\"><h2><a>"+rs2.getString(3)+"</a></h2>");
                        out.println("<h4 style=\"font-size: 16px; text-align: justify;\">"+rs2.getString(2)+"</h4>");
                        out.println("<a href='delete?id="+id+"'>Edit</a></div></div>");
                }
            }
            catch(Exception e){}
        
      out.write("\t\n");
      out.write("</div>\n");
      out.write("<div class=\"main_right\">\n");
      out.write("\t<div class=\"side_head\" style=\"border-bottom: 1px solid #333;\">\n");
      out.write("\t\t<h2 style=\"margin-left: 0; margin-bottom: 10;\">FEED</h2>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"side\">\n");
      out.write("\t\t<a class=\"twitter-timeline\" data-width=\"100%\" data-height=\"100%\" href=\"https://twitter.com/TwitterDev/timelines/539487832448843776?ref_src=twsrc%5Etfw\">National Park Tweets - Curated tweets by TwitterDev</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"side\" onclick=\"location.href='https://www.apple.com/in/iphone-x/'\" style=\"cursor: pointer;\">\n");
      out.write("\t\t<video id=\"advid\" height=\"200\" width=\"100\" autoplay=\"\" muted loop>\n");
      out.write("\t\t\t<source src=\"ad.mp4\" type=\"video/mp4\">\n");
      out.write("\t\t</video>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"side\" style=\"height: 30%; border:0;\">\n");
      out.write("\t\t<button style=\"padding: 35; padding-left: 32; padding-right: 32;\" onclick=\"location.href='file:///F:/HTML%20Project/feedback.html?';\">FEEDBACK</button>\n");
      out.write("\t\t<button style=\"padding: 35; padding-left: 20; padding-right: 20; margin-left: 30;\" onclick=\"location.href='file:///F:/HTML%20Project/contact.html';\">CONTACT US</button>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div class=\"vid\" >\n");
      out.write("\t<div id=\"ppp\" style=\"border-bottom: 1px solid #333; margin-bottom: 15;\"><h2>MINI SWITZERLAND\n");
      out.write("</h2></div>\n");
      out.write("\t<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/cA3RiEwXS2w\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>\n");
      out.write("\t<div class=\"v1\">\n");
      out.write("\t\t<h2 style=\"padding-left: 0; padding-top: 0; color: black\">Chopta-Tungnath</h2>\n");
      out.write("\t\t<h4 style=\"font-size: 16px;\">\n");
      out.write("Chopta\n");
      out.write("Village\n");
      out.write("Chopta, starting point for treks to Tungnath and Chandrashila.\n");
      out.write("Chopta, starting point for treks to Tungnath and Chandrashila.\n");
      out.write("Country\tIndia\n");
      out.write("State\tUttarakhand\n");
      out.write("\n");
      out.write("The route to Chandrashila\n");
      out.write("Chopta is a small region of meadows and evergreen forest area which is a part of kedarnath wildlife sanctuary located in Uttarakhand state, India and a base for trekking to Tungnath, third temple of Panch Kedar, which lies 3.5 kilometres (2.2 mi) away. Located at a distance of 1.5 kilometres (0.93 mi) from Tungnath is Chandrashila, a rising to over 4,000 metres (13,000 ft).\n");
      out.write("\n");
      out.write("Chopta is an unspoiled natural destination lying in the lap of the Uttarakhand Himalayas and offers views of the imposing Himalayan range including Trishul, Nanda Devi and Chaukhamba. It is located at an elevation of 2,680 metres (8,790 ft) above sea level. Chopta village is surrounded by forests of pine, deodar and rhododendron and is rich in flora and fauna include rare species of birds and musk deer.</h4>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"top_buton\">\n");
      out.write("\t<a href=\"#top\"><button>Top</button></a>\n");
      out.write("</div>\n");
      out.write("<div class=\"footer\">\n");
      out.write("\n");
      out.write("\t<div id=\"hhh1\"><h2><a href=\"file:///F:/HTML%20Project/homepage1.html#top\">YOUR HOME</a></h2></div>\n");
      out.write("\t<div id=\"sss1\"><a href=\"https://twitter.com/\"><i id=\"social\" class=\"fa fa-twitter\" style=\"color: #0084b4\"></i></a>\n");
      out.write("\t<a href=\"#\"><i id=\"social\" class=\"fa fa-instagram\" style=\"color: #fb3958\"></i></a>\n");
      out.write("\t<a href=\"https://www.youtube.com/\"><i id=\"social\" class=\"fa fa-youtube\" style=\"color: red\"></i></a>\n");
      out.write("\t<a href=\"#\"><i id=\"social\" class=\"fa fa-facebook\" style=\"color: #3B5998\"></i></a></div>\n");
      out.write("\t<br>\n");
      out.write("</div>\n");
      out.write("<div id=\"add\">\n");
      out.write("\t<div id=\"add1\">\n");
      out.write("\t\t<i class=\"fa fa-map-marker\"></i><span style=\"padding-left: 25;\">Chitkara University</span><br><span style=\"padding-left: 65; font-size: 18;\">HIMACHAL PRADESH</span><br>\n");
      out.write("\t\t<i class=\"fa fa-phone\"></i><span style=\"padding-left: 25;\">+91 91019-02037<br>\n");
      out.write("\t\t<i class=\"fa fa-envelope-o\"></i><span style=\"padding-left: 25;\">soodradhika@gmail.com\n");
      out.write("\t</div>\t\n");
      out.write("\t<div id=\"add2\">\n");
      out.write("\t\t<h5 style=\"padding-left: 380;\">Feedback<br><br>\n");
      out.write("\n");
      out.write("\t\tPlease send us your ideas, bug reports, suggestions!<br> Any feedback would be appreciated.</h5>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<!--<a class=\"twitter-timeline\" data-width=\"270\" data-height=\"242\" href=\"https://twitter.com/TwitterDev/timelines/539487832448843776?ref_src=twsrc%5Etfw\">National Park Tweets - Curated tweets by TwitterDev</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>-->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
