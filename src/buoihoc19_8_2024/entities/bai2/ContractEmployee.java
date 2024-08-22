package buoihoc19_8_2024.entities.bai2;

public class ContractEmployee extends Employee{
    // Số tiền hợp đồng
    private double contractAmount;

    public ContractEmployee(double contractAmount) {
        this.contractAmount = contractAmount;
    }

    public ContractEmployee(String employeeId, String name, double contractAmount) {
        super(employeeId, name, 0);
        this.contractAmount = contractAmount;
    }

    @Override
    double calculateSalary() {
        return contractAmount;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "contractAmount=" + contractAmount ;
    }
}
