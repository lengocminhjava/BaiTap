package buoihoc19_8_2024.repository;

import buoihoc19_8_2024.entities.Book;

public interface libraryInterFace {
    void addBook(Book book);
    void borrowBook(String ISBN, String borrower) throws Exception;
    void returnBook(String ISBN) throws Exception;
    void displayBooks();
}
