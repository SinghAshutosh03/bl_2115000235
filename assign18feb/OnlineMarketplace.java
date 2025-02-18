
import java.util.ArrayList;
import java.util.List;

enum ProductCategory {
    BOOK, CLOTHING, GADGET
}

class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public T getCategory() { return category; }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return name + " (" + category + ") - $" + price;
    }
}

class Catalog<T extends Product<?>> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public List<T> getProducts() {
        return products;
    }

   
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
        System.out.println("Discount applied to " + product.getName() + ": $" + discount);
    }
}

public class OnlineMarketplace {
    public static void main(String[] args) {
        Product<ProductCategory> book = new Product<>("Java Programming", 45.99, ProductCategory.BOOK);
        Product<ProductCategory> clothing = new Product<>("T-Shirt", 19.99, ProductCategory.CLOTHING);
        Product<ProductCategory> gadget = new Product<>("Smartwatch", 199.99, ProductCategory.GADGET);

        Catalog<Product<ProductCategory>> catalog = new Catalog<>();
        catalog.addProduct(book);
        catalog.addProduct(clothing);
        catalog.addProduct(gadget);

        System.out.println("Before Discount:");
        for (Product<?> p : catalog.getProducts()) {
            System.out.println(p);
        }

        Catalog.applyDiscount(book, 10);
        Catalog.applyDiscount(clothing, 15);
        Catalog.applyDiscount(gadget, 5);

        System.out.println("\nAfter Discount:");
        for (Product<?> p : catalog.getProducts()) {
            System.out.println(p);
        }
    }
}

