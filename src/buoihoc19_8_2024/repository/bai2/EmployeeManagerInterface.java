package buoihoc19_8_2024.repository.bai2;

import buoihoc19_8_2024.entities.bai2.Employee;
import buoihoc19_8_2024.entities.bai2.EmployeeNotFoundException;

public interface EmployeeManagerInterface {
   void addEmployee(Employee employee);
   void removeEmployee(String employeeId) throws EmployeeNotFoundException;
   void findEmployeeById(String employeeId) throws EmployeeNotFoundException;
   void calculateTotalSalary();
   void listAllEmployees();
}
