package buoihoc19_8_2024.entities;

import buoihoc19_8_2024.repository.EmployeeManagerInterface;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager implements EmployeeManagerInterface {
    private List<Employee> employees = new ArrayList<>();
    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void removeEmployee(String employeeId) throws EmployeeNotFoundException {
        boolean isTrue = false;
        for (Employee employee:employees){
            if(employeeId.equals(employee.getEmployeeId())){
                employees.remove(employee);
                isTrue = true;
            }
        }
        if(!isTrue){
            throw new EmployeeNotFoundException();
        }
        System.out.println("Xóa thành công");
    }

    @Override
    public void findEmployeeById(String employeeId) throws EmployeeNotFoundException {
        boolean isTrue = false;
        for (Employee employee:employees){
            if(employeeId.equals(employee.getEmployeeId())){
                System.out.println(employee);
                isTrue = true;
            }
        }
        if(!isTrue){
            throw new EmployeeNotFoundException();
        }
        System.out.println("Tìm thành công");
    }

    @Override
    public void calculateTotalSalary() {
        double sum = 0;
        for (Employee employee:employees){
                sum+=employee.calculateSalary();
        }
        System.out.println("Lương tất cả các nhân viên là: "+sum);
    }

    @Override
    public void listAllEmployees() {
        System.out.println();
        if(employees.isEmpty()){
            System.out.println("Chưa có nhân viên nào");
        }else
        {
            for (Employee employee:employees){
                System.out.println(employee);
            }
        }
    }
}
