/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;



import DAO.Impl.EmployeeDAOImpl;

public class Factory {
     
      private static EmployeeDAO employeeDAO = null;
      private static Factory instance = null;

      public static synchronized Factory getInstance(){
            if (instance == null){
              instance = new Factory();
            }
            return instance;
      }

      public EmployeeDAO getEmployeeDAO(){
          
            if (employeeDAO == null){
              employeeDAO = new EmployeeDAOImpl();
            }
            return employeeDAO;
      }  
}