package buoihoc19_8_2024.entities.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library librarys = new Library();
        int input;
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("1. Thêm 5 cuốn sách vào thư viện");
            System.out.println("2. Hiển thị danh sách sách hiện có trong thư viện.");
            System.out.println("3. Mượn một vài cuốn sách và hiển thị trạng thái của thư viện sau khi mượn.");
            System.out.println("4. Thực hiện việc trả sách và hiển thị trạng thái của thư viện.");
            System.out.println("0. Thoát");
            System.out.println("---------------------------------------------------");
             input = sc.nextInt();
            switch (input){
                case 1:
                    System.out.println("Thêm 5 cuốn sách");
                    for(int i = 1;i<6;i++){
                        System.out.println("Thêm tên sách thứ "+i);
                        if(i==1){
                            sc.nextLine();
                        }
                        String title = sc.nextLine();
                        System.out.println("Thêm tên tác giả thứ "+i);
                        String author = sc.nextLine();
                        System.out.println("Thêm mã sách thứ "+i);
                        String isnb = sc.nextLine();
                        librarys.addBook(new Book(title,author,isnb));
                    }
                    break;
                case 2:
                    System.out.println("Hiển thị danh sách có trong thư viện");
                    librarys.displayBooks();
                    break;
                case 3:
                    System.out.println("Mượn một vài cuốn sách và hiển thị trạng thái của thư viện sau khi mượn");
                    System.out.println("Nhập số sách muốn mượn");
                    int soLan = sc.nextInt();
                    int count = 1;
                    while (count<=soLan){
                        System.out.println("Nhập mã sách");
                        if(count ==1){
                            sc.nextLine();
                        }
                        String isbn = sc.nextLine();
                        System.out.println("Nhập tên người mượn");
                        String name = sc.nextLine();
                       try{
                           librarys.borrowBook(isbn,name);
                       } catch (Exception e){
                           System.out.println(e.getMessage());
                       }
                       count++;
                    }
                    break;
                case 4:
                    System.out.println("Thực hiện việc trả sách và hiển thị trạng thái của thư viện");
                    System.out.println("Nhập số sách muốn trả ");
                    int soLan1 = sc.nextInt();
                    int count1= 1;
                    while (count1<=soLan1){
                        if(count1 ==1){
                            sc.nextLine();
                        }
                        System.out.println("Nhập mã sách");
                        String isbn = sc.nextLine();
                        try{
                            librarys.returnBook(isbn);
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        count1++;
                    }
                    break;
                default:
                    System.out.println("Số không hợp lệ");
                    break;
            }
        }while (input != 0);
    }
}
