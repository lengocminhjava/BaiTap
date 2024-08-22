package buoihoc19_8_2024.entities;

public class PartTimeEmployee extends Employee{
    //Số giờ làm việc
    private int hoursWorked;
    //Mức lương theo giờ
    private double hourlyRate;

    public PartTimeEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public PartTimeEmployee(String employeeId, String name, double salary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked*hourlyRate;
    }
}
