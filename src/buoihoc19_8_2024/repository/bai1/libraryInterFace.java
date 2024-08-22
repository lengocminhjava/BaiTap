package buoihoc19_8_2024.repository.bai1;

import buoihoc19_8_2024.entities.bai1.Book;

public interface libraryInterFace {
    void addBook(Book book);
    void borrowBook(String ISBN, String borrower) throws Exception;
    void returnBook(String ISBN) throws Exception;
    void displayBooks();
}
