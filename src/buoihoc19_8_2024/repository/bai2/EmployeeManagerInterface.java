package buoihoc19_8_2024.repository;

import buoihoc19_8_2024.entities.Employee;
import buoihoc19_8_2024.entities.EmployeeNotFoundException;

public interface EmployeeManagerInterface {
   void addEmployee(Employee employee);
   void removeEmployee(String employeeId) throws EmployeeNotFoundException;
   void findEmployeeById(String employeeId) throws EmployeeNotFoundException;
   void calculateTotalSalary();
   void listAllEmployees();
}
