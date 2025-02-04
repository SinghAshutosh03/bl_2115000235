
import java.util.Scanner;

class Product {
    private static double discount = 10.0;

    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }


    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

 
    public void displayProduct() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid Product");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

    
        Product product = new Product(id, name, price, quantity);


        product.displayProduct();

        System.out.print("Enter new discount percentage: ");
        double newDiscount = sc.nextDouble();
        updateDiscount(newDiscount);
        product.displayProduct();
        
    }
}

