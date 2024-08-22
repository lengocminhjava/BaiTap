package buoihoc19_8_2024.entities.bai2;

public class FullTimeEmployee extends Employee{
      private double bonus;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String employeeId, String name, double salary) {
        super(employeeId, name, salary);
    }

    public FullTimeEmployee(double bonus) {
        this.bonus = bonus;
    }

    public FullTimeEmployee(String employeeId, String name, double salary, double bonus) {
        super(employeeId, name, salary);
        this.bonus = bonus;
    }
    @Override
    double calculateSalary() {
        return bonus+getSalary();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + bonus + ", Total Salary: " + calculateSalary();
    }
}
