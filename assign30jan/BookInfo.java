import java.util.*;
class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs" + price);
    }
}

public class BookInfo {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "J.K Rowling", 1000.00);
        book.displayDetails();
    }
}

