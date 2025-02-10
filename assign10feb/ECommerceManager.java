
import java.util.ArrayList;
import java.util.List;


abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.15;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 15%";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.08;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 8%";
    }
}


class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}


public class ECommerceManager {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(201, "Laptop", 50000));
        products.add(new Clothing(202, "T-Shirt", 1500));
        products.add(new Groceries(203, "Rice", 800));

        for (Product product : products) {
            product.displayDetails();
            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                System.out.println("Tax: " + taxableProduct.calculateTax());
                System.out.println(taxableProduct.getTaxDetails());
            }
           
        }
    }
}

