
import java.util.*;

class Book2 {
    String title;
    String author;
    double price;
    boolean available;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Available: " + available);
    }

    public static void main(String[] args) {
        Book book = new Book("Game of Thrones", "John Snow", 2000.0);
        book.display();
        book.borrowBook();
        book.display();
    }
}

