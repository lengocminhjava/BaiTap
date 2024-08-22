package buoihoc19_8_2024.entities.bai2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();
        int input;
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("1. Thêm một nhân viên vào danh sách");
            System.out.println("2. Xóa một nhân viên khỏi danh sách dựa vào employeeId.");
            System.out.println("3. Tìm kiếm và trả về thông tin của nhân viên dựa vào employeeId.");
            System.out.println("4. Tính tổng lương của tất cả các nhân viên trong danh sách.");
            System.out.println("5. Liệt kê tất cả các nhân viên trong công ty");
            System.out.println("0. Thoát");
            System.out.println("---------------------------------------------------");
            input = sc.nextInt();
            switch (input){
                case 1:
                    boolean isTrue = true;
                    int employeeType = 0;
                    while (isTrue){
                    System.out.println("Chọn loại nhân viên (1: Full-Time, 2: Contract), 3:Part-time");
                    try{
                        employeeType = sc.nextInt();
                        sc.nextLine();
                    }catch (Exception e){
                        System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
                        sc.nextLine();
                        continue;
                    };
                    if(employeeType==1||employeeType==2||employeeType==3){
                        isTrue = false;
                    }
                    else {
                        System.out.println("Loại nhân viên không hợp lệ. Vui lòng chọn lại.");
                    }
                }
                        System.out.println("Nhập mã nhân viên");
                        String employeeId = sc.nextLine();
                        System.out.println("Nhập tên nhân viên");
                        String name = sc.nextLine();
                        if(employeeType == 1){
                            System.out.println("Lương cơ bản của nhân viên");
                            double salary = getInput(Double.class);
                            System.out.println("Nhập tiền thưởng của nhân viên");
                            double bonus  = getInput(Double.class);
                            employeeManager.addEmployee(new FullTimeEmployee(employeeId,name,salary,bonus));
                        }else if(employeeType == 2) {
                            System.out.println("Nhập số tiền hợp đồng của nhân viên");
                            double contractAmount = getInput(Double.class);
                            employeeManager.addEmployee(new ContractEmployee(employeeId,name,contractAmount));
                        }else if(employeeType == 3) {
                            System.out.println("Nhập số giờ làm việc");
                            int hoursWorked = getInput(Integer.class);
                            System.out.println("Nhập mức lương theo giờ");
                            double hourlyRate = getInput(Double.class);
                            employeeManager.addEmployee(new PartTimeEmployee(employeeId,name,hoursWorked,hourlyRate));
                        }
                    break;
                case 2:
                    System.out.println("Nhập vào mã cần xóa");
                    sc.nextLine();
                    String employeeRemove = sc.nextLine();
                    try {
                        employeeManager.removeEmployee(employeeRemove);
                    }
                  catch (EmployeeNotFoundException e){
                      System.out.println(e.getMessage());
                  }
                    break;
                case 3:
                    System.out.println("Nhập mã nhân viên cần tìm");
                    sc.nextLine();
                    String employeeById = sc.nextLine();
                    try{
                        employeeManager.findEmployeeById(employeeById);
                    }catch (EmployeeNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    employeeManager.calculateTotalSalary();
                    break;
                case 5:
                    employeeManager.listAllEmployees();
                    break;
                default:
                    System.out.println("Số không hợp lệ");
                    break;
            }
        }while (input != 0);
    }
    public static <T> T getInput(Class<T> type) {
        Object number = null;
        boolean valid = false;
        while (!valid) {
            try {
                if (type == Integer.class) {
                    number = scanner.nextInt();
                } else if (type == Double.class) {
                    number = scanner.nextDouble();
                } else {
                    throw new IllegalArgumentException();
                }
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Nhập không hợp lệ. Vui lòng nhập đúng loại số.");
                scanner.next();
            }
        }
        return type.cast(number);
    }
}
