
import java.util.*;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void showDetails() {
        System.out.println("EBook - ISBN: " + ISBN + ", Title: " + title);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("123456", "Game of Thrones", "John ");
        book.display();

        EBook ebook = new EBook("7891011", "House of dragons", "John");
        ebook.showDetails();
    }
}

