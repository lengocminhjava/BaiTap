public class DivideByZeroExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        if (denominator == 0) {
            throw new ArithmeticException("Không thể chia cho 0.");
        }

        // Thực hiện phép chia nếu không có lỗi
        int result = numerator / denominator;
        System.out.println("Kết quả: " + result);

        // In ra thông báo "continue"
        System.out.println("continue");
    }
}
