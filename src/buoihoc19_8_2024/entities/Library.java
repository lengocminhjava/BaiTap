package buoihoc19_8_2024.entities;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
    private List<Book> books;
    private Set<String> borrowedBooks;
    private Map<String, String> borrowedBy;
    public void addBook(Book book){
        books.add(book);
    }
    public void borrowBook(String ISBN, String borrower) throws Exception{

    }
    public void returnBook(String ISBN) throws Exception{

    }
    public void displayBooks(){

    }
}
