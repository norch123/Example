
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import ="Entity.Employee" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style/Style.css">
         <script type="text/javascript"></script>
         <script src="js/click.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
         <form>
        <table border="1" width="70%"><tr>
               <td width="300" ><b>Имя</b></td>
               <td width= "300"><b>Фамилия</b></td>
               <td width="300" ><b>Отчество</b></td>
               <td width="300" ><b>Возраст</b></td>
               <td width="300"><b>Опыт</b></td>
               <td width="300"><b>Описание</b></td>
            </tr> 
            <% String[] empl = (String[])request.getAttribute("text"); 
                for (int i = 0; i<empl.length; i++) {
            %>            
            <td width="119"><input type = "text" name ="param<%=i%>" size = 25 value="<%=empl[i] %>"></td>
              <%}%>
            <% 
             Employee em = (Employee)request.getAttribute("empl");
             request.getSession().setAttribute("emp",em);
            %> 
            </table> 
          <button  name = "changeSave" style="position:absolute; right: 200px;width: 150px; top: 80px; height: 40px" onClick="myOnClick(this)">Сохранить</button>
           </form>          
    </body>
</html>
