package buoihoc19_8_2024.entities.bai1;

import buoihoc19_8_2024.repository.bai1.libraryInterFace;

import java.util.*;

public class Library implements libraryInterFace {
    private List<Book> books = new ArrayList<>();
    private Set<String> borrowedBooks = new HashSet<>();
    private Map<String, String> borrowedBy = new HashMap<>();
    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void borrowBook(String ISBN, String borrower) throws Exception {
        if(borrowedBooks.contains(ISBN)){
              throw new ArithmeticException("Sách đã mượn rồi không thể mượn");
        }
        boolean istrue = false;
        for(Book book:books){
            if(ISBN.equals(book.getISBN())){
                borrowedBooks.add(ISBN);
                borrowedBy.put(ISBN,borrower);
                istrue = true;
            }
        }
        if(!istrue){
              throw new Exception("Sách không có trong thư viện");
        }else {
            System.out.println("Mượn sách thành công");
        }
    }

    @Override
    public void returnBook(String ISBN) throws Exception {
        if (!borrowedBooks.contains(ISBN)) {
            throw new Exception("Sách chưa được mượn");
        }
        borrowedBooks.remove(ISBN);
        borrowedBy.remove(ISBN);
        System.out.println("Trả sách thành công");
    }

    @Override
    public void displayBooks() {
            if(books.isEmpty()){
                System.out.println("Chưa có sách nào trong thư viện");
            }
            else {
                for (Book book : books) {
                    System.out.println(book);
                }
            }
    }
}
