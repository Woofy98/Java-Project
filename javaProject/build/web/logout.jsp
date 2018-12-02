
<%-- 
    Document   : logout
    Created on : Dec 2, 2018, 9:27:34 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(session!=null)
            {
                session.invalidate();
            }
            response.sendRedirect("index_1.html");
            %>
    </body>
</html>
