package buoihoc19_8_2024.entities.bai2;

public class PartTimeEmployee extends Employee{
    //Số giờ làm việc
    private int hoursWorked;
    //Mức lương theo giờ
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String name, int hoursWorked, double hourlyRate) {
        super(employeeId, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked*hourlyRate;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                ", Total Salary: " + calculateSalary();
    }
}
