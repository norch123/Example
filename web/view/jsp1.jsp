

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page language="java" import="java.util.*" %>
<%@page language="java" import ="Entity.Employee" %>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="style/Style.css">
         <script type="text/javascript"></script>
         <script src="js/click.js"></script>
        <title>Стартовая страница</title>
    </head>
    <body>
       <form name="select">
        <select name="listFamilyEmployee">
            <% List<Employee> data = (List<Employee>)request.getAttribute("list");
               for (Employee e: data ) {
            %>   
           
            <option value = <%=e.getId_employee()%> > <%=e.getLast_name()%> <%=e.getFirst_name()%> </option>
              <%}%>
             <% String s = request.getParameter("listFamilyEmployee");  %>          
           </select>   
           <button name = "delete" style="position:absolute;right: 40%;width: 150px;top: 220px; height: 40px" onClick="myOnClick(this)">Удалить</button>   
           <button name = "add"  style="position:absolute;right: 40%;width: 150px;top: 280px; height: 40px" onClick="myOnClick(this)">Добавить</button> 
           <button name = "show"  style="position:absolute;right: 40%;width: 150px;top:340px; height: 40px" onClick="myOnClick(this)">Показать</button>
           <button name = "change"  style="position:absolute;right: 40%;width: 150px;top:400px; height: 40px" onClick="myOnClick(this)">Редактировать</button>
        </form>
    </body>
</html>
