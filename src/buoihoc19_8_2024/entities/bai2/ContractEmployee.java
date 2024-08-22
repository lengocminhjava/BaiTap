package buoihoc19_8_2024.entities;

public class ContractEmployee extends Employee{
    // Số tiền hợp đồng
    private double contractAmount;

    public ContractEmployee(double contractAmount) {
        this.contractAmount = contractAmount;
    }

    public ContractEmployee(String employeeId, String name, double salary, double contractAmount) {
        super(employeeId, name, salary);
        this.contractAmount = contractAmount;
    }

    @Override
    double calculateSalary() {
        return contractAmount;
    }
}
