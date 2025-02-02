
import java.util.*;

class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: Rs" + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("Harry Potter", "J.K. Rowling", 1000);
        
        defaultBook.display();
        customBook.display();
    }
}

