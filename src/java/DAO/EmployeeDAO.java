

package DAO;

import java.sql.SQLException;
import java.util.List;
import Entity.Employee;

public interface EmployeeDAO {
    public void addEmployee(Employee Employee) throws SQLException;   
    public void updateEmployee(Employee Employee) throws SQLException;
    public Employee getEmployeeById(Long id) throws SQLException;    
    public List getAllEmployee() throws SQLException;              
    public void deleteEmployee(Employee Employee) throws SQLException;
}