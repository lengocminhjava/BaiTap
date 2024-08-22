package buoihoc19_8_2024.entities.bai2;

public abstract class Employee {
   private String employeeId;
   private String name;
   private double salary;

    public Employee() {
    }

    public Employee(String employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    //Lấy lương nhân viên
    abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
