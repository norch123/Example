
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" type="text/css" href="style/Style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="add" action="http://localhost:8080/Example/AddEmployee" method="post" action="pkg1/AddEmployee" >           
             <form name="add" action="jsp1.jsp" >  
        <button  style="position:absolute; right: 200px;width: 150px; top: 80px; height: 40px">Сохранить</button>
        <table border="1" width="70%"><tr>
               <td width="300" ><b>Имя</b></td>
               <td width= "300"><b>Фамилия</b></td>
               <td width="300" ><b>Отчество</b></td>
               <td width="300" ><b>Возраст</b></td>
               <td width="300"><b>Опыт</b></td>
               <td width="300"><b>Описание</b></td>
            </tr> 
            <% for (int i = 1; i<7; i++) {
            %>            
           <td width="119"><input type = "text" name ="param<%=i%>" size = 25></td>
              <%}%>
           </table>
             </form>
        </form>
    </body>
</html>
