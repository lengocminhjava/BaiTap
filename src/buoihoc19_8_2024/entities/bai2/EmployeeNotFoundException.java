package buoihoc19_8_2024.entities;

public class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException() {
        super("Không tồn tại nhân viên");
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
