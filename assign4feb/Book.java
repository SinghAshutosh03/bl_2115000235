import java.util.Scanner;

class Book {
    private static String libraryName = "City Library";
    
    private final String isbn;
    private String title;
    private String author;


    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

   
    public void displayBook() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid Book");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

  
        Book book = new Book(title, author, isbn);

        displayLibraryName();
        book.displayBook();
     
    }
}

