

package Controller;

import DAO.Factory;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import Entity.Employee;


public class AddEmployee extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
        String page = "/GetFamily";
        String first_name = request.getParameter("param1");
        String last_name = request.getParameter("param2");
        String second_name = request.getParameter("param3");
        int age = Integer.parseInt(request.getParameter("param4"));
        String expirience = request.getParameter("param5");
        String description = request.getParameter("param6");
        Employee e = new Employee();
        e.setFirst_name(first_name);
        e.setLast_name(last_name);
        e.setSecond_name(second_name);
        e.setAge(age);
        e.setExpirience(expirience);
        e.setDescription(description);
        try{
        Factory.getInstance().getEmployeeDAO().addEmployee(e);
        }
        catch(SQLException ex)
        {
            
        }
           RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        if (dispatcher != null) {
 
            dispatcher.forward(request, response);
 
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
