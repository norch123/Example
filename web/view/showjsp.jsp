

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import ="Entity.Employee" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="style/Style.css">
        <title>JSP Page</title>
    </head>
    <body>
              <% String[] empl = (String[])request.getAttribute("text");    
               String gg = (String)request.getAttribute("t");  
              for (String e: empl) {
            %>    
                <h1><%=e %></h1><br>
            <%}%>
            <%if(gg == "tre"){
            %>  
            <h1><%=gg %></h1><br>
              <%}%>
    </body>
</html>
