

package Controller;

import DAO.Factory;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entity.Employee;


public class ShowEmployee extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
        String page = "view/showjsp.jsp";
        String ss = request.getParameter("listFamilyEmployee");
        Long id = Long.parseLong(ss);
       try{
          Employee e =  Factory.getInstance().getEmployeeDAO().getEmployeeById(id);
      String[] attributeEmpl = {
            "Family: " + e.getLast_name(), 
            "Name: " + e.getFirst_name(),
            "SecondName: " + e.getSecond_name(),
            "Age: "+e.getAge(),
            "Description: "+ e.getDescription(),
            "Expirience: "+ e.getExpirience()};      
        request.setAttribute("text", attributeEmpl);
        request.setAttribute("t", "true");
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        if (dispatcher != null) {
 
            dispatcher.forward(request, response);
 
       }
            }
      catch(SQLException e) {
                
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
