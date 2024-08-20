package buoihoc19_8_2024.entities;

public class Main {
    public static void main(String[] args) {
        Library librarys = new Library();
        Book book1 = new Book("ten","avc","123");
        librarys.addBook(book1);
        librarys.displayBooks();
    }
}
