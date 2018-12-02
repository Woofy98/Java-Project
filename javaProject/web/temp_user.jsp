<%-- 
    Document   : test
    Created on : Nov 24, 2018, 8:01:44 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>

	<title>YOUR HOME</title>
	<link rel="icon" type="image/jpg" href="Capture.jpg">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="abc.css">
        <link rel="stylesheet" type="text/css" href="css.css">
	<meta name="viewport" content="width=device-width , initial-scale=1">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script>
		$(document).ready(function(){
    		$("#mob").click(function(){
        		$('.more').slideDown("slow");},function(){$('.more').slideUp("slow");});
		});
	</script>
        <style>
            @media screen and (max-width: 1335px){
                .main{
                    width: 100%;
                }
                .main_right{
                    width: 100%;
                    margin: 0px;
                }
                .vid iframe{
                    width: 90%;
                    margin: 0px;
                    margin-left: 5%;
                }
                .vid .v1{
                    width: 100%;
                    margin: 0px;
                }
            }
        </style>
</head>
<body>
<div class="header" id="top">
	<div id="hhh">
		<h2>
			<a href="test.jsp"><b>YOUR HOME</b></a>
		</h2>
	</div>
	<div id="nnn">
          
		<span class="navigation_top">
			<a href="test.jsp" style="text-decoration:none">
				<i class="fa fa-home">&nbsp</i>HOME
			</a>
		</span>
                <span class="navigation_top">
			<a href="1BHKDelhi.html" style="text-decoration:none" id="rev">
				<i class="fa fa-search">&nbsp</i>1BHK
				<i class="fa fa-caret-down"></i>
			</a>
                    
		</span>
                <span class="navigation_top">
			<a href="2BHKDelhi.html" style="text-decoration:none" id="rev">
				<i class="fa fa-search">&nbsp</i>2BHK
				<i class="fa fa-caret-down"></i>
			</a>
                    
		</span>
                <span class="navigation_top">
			<a href="3BHKDelhi.html" style="text-decoration:none" id="rev">
				<i class="fa fa-search">&nbsp</i>3BHK
				<i class="fa fa-caret-down"></i>
			</a>
                    
		</span>
		
			
		<span class="navigation_top">
			<a href="logout.jsp" style="text-decoration:none">
				<i class="fa fa-home">&nbsp</i>LOGOUT
			</a>
		</span>
                
		
	</div>
	<div id="sss">
		<a href="https://twitter.com/"><i id="social" class="fa fa-twitter" style="color: #0084b4"></i></a>
		<a href="#"><i id="social" class="fa fa-instagram" style="color: #fb3958"></i></a>
		<a href="https://www.youtube.com/"><i id="social" class="fa fa-youtube" style="color: red"></i></a>
		<a href="#"><i id="social" class="fa fa-facebook" style="color: #3B5998"></i></a>
	</div>
</div>,

<div class="more">
    <h4 style="margin-top: 0px"><a href="1BHKDelhi.html">1BHK</a></h4>
	<h4><a href="2BHKDelhi.html">2BHK</a></h4>
	<h4><a href="3BHKDelhi.html">3BHK</a></h4>
</div>

<div id="ppp" style="border-bottom: 1px solid #333;">
	<h2>HOME</h2>
</div>


<div class="nw1">
        <%  try{
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
        %>
</div>
<div class="main">
	<div id="ppp" style="border-bottom: 1px solid #333;">
		<h2>LATEST</h2>
	<!--<h2 style="float: right; margin-right: 200;">FEED</h2>-->
	</div>
         <%  try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
                Statement st= con.createStatement();
                String query2 = "select * from myapartments";
                ResultSet rs2 = st.executeQuery(query2);
                while(rs2.next()){
                       int id=rs2.getInt(1);
                        out.println("<div class=\"r1\"><div class=\"rr1\"><a href=\'"+rs2.getString(5)+"\'><img src=\'"+rs2.getString(4)+"\' height=\"250\" width=\"350\"></a></div>");
                        out.println("<div class=\"rr2\"><h2><a>"+rs2.getString(3)+"</a></h2>");
                        out.println("<h4 style=\"font-size:10px; text-align: justify;\"><a>"+rs2.getString(2)+"</a></h4>");
                        out.println("<a href='delete?id="+id+"'>BOOK APARTMENT</a></div></div>");
                }
            }
            catch(Exception e){}
        %>	
</div>
<div class="main_right">
	<div class="side_head" style="border-bottom: 1px solid #333;">
		<h2 style="margin-left: 0; margin-bottom: 10;">FEED</h2>
	</div>

	<div class="side">
		<a class="twitter-timeline" data-width="100%" data-height="100%" href="https://twitter.com/TwitterDev/timelines/539487832448843776?ref_src=twsrc%5Etfw">National Park Tweets - Curated tweets by TwitterDev</a> <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
	</div>
	<div class="side" onclick="location.href='https://www.apple.com/in/iphone-x/'" style="cursor: pointer;">
		<video id="advid" height="200" width="100" autoplay="" muted loop>
			<source src="ad.mp4" type="video/mp4">
		</video>
	</div>
	<div class="side" style="height: 30%; border:0;">
		<button style="padding: 35; padding-left: 32; padding-right: 32;" onclick="location.href='file:///F:/HTML%20Project/feedback.html?';">FEEDBACK</button>
		<button style="padding: 35; padding-left: 20; padding-right: 20; margin-left: 30;" onclick="location.href='file:///F:/HTML%20Project/contact.html';">CONTACT US</button>
	</div>
</div>

<br>
<br>
<div class="vid" >
	<div id="ppp" style="border-bottom: 1px solid #333; margin-bottom: 15;"><h2>MINI SWITZERLAND
</h2></div>
<iframe width="560" height="315" src="https://www.youtube.com/embed/cA3RiEwXS2w" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	<div class="v1">-->
		<h2 style="padding-left: 0; padding-top: 0; color: black">Chopta-Tungnath</h2>
		<h4 style="font-size: 16px;">
Chopta
Village
Chopta, starting point for treks to Tungnath and Chandrashila.
Chopta, starting point for treks to Tungnath and Chandrashila.
Country	India
State	Uttarakhand

The route to Chandrashila
Chopta is a small region of meadows and evergreen forest area which is a part of kedarnath wildlife sanctuary located in Uttarakhand state, India and a base for trekking to Tungnath, third temple of Panch Kedar, which lies 3.5 kilometres (2.2 mi) away. Located at a distance of 1.5 kilometres (0.93 mi) from Tungnath is Chandrashila, a rising to over 4,000 metres (13,000 ft).

Chopta is an unspoiled natural destination lying in the lap of the Uttarakhand Himalayas and offers views of the imposing Himalayan range including Trishul, Nanda Devi and Chaukhamba. It is located at an elevation of 2,680 metres (8,790 ft) above sea level. Chopta village is surrounded by forests of pine, deodar and rhododendron and is rich in flora and fauna include rare species of birds and musk deer.</h4>
	</div>
</div>
<div class="top_buton">
	<a href="#top"><button>Top</button></a>
</div>
<div class="footer">

	<div id="hhh1"><h2><a href="file:///F:/HTML%20Project/homepage1.html#top">YOUR HOME</a></h2></div>
	<div id="sss1"><a href="https://twitter.com/"><i id="social" class="fa fa-twitter" style="color: #0084b4"></i></a>
	<a href="#"><i id="social" class="fa fa-instagram" style="color: #fb3958"></i></a>
	<a href="https://www.youtube.com/"><i id="social" class="fa fa-youtube" style="color: red"></i></a>
	<a href="#"><i id="social" class="fa fa-facebook" style="color: #3B5998"></i></a></div>
	<br>
</div>
<div id="add">
	<div id="add1">
		<i class="fa fa-map-marker"></i><span style="padding-left: 25;">Chitkara University</span><br><span style="padding-left: 65; font-size: 18;">HIMACHAL PRADESH</span><br>
		<i class="fa fa-phone"></i><span style="padding-left: 25;">+91 91019-02037<br>
		<i class="fa fa-envelope-o"></i><span style="padding-left: 25;">soodradhika@gmail.com
	</div>	
	<div id="add2">
		<h5 style="padding-left: 380;">Feedback<br><br>

		Please send us your ideas, bug reports, suggestions!<br> Any feedback would be appreciated.</h5>
	</div>
</div>

</body>
</html>
<!--<a class="twitter-timeline" data-width="270" data-height="242" href="https://twitter.com/TwitterDev/timelines/539487832448843776?ref_src=twsrc%5Etfw">National Park Tweets - Curated tweets by TwitterDev</a> <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>-->