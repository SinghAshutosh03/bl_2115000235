
import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public String toString() {
        return name + " ($" + price + ")";
    }
}

class Electronics extends WarehouseItem {
    int quantity;

    public Electronics(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    public String toString() {
        return super.toString() + " [Quantity: " + quantity + "]";
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name, double price) {
        super(name, price);
    }
}

class Furniture extends WarehouseItem {
    int warranty;

    public Furniture(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    public String toString() {
        return super.toString() + " [Warranty: " + warranty + " years]";
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}

public class SmartWarehouse {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Headphone", 1500, 10));
        electronicsStorage.addItem(new Electronics("Laptop", 1200.99, 5));
        electronicsStorage.addItem(new Electronics("Smartphone", 799.49, 20));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple", 0.99));
        groceriesStorage.addItem(new Groceries("Milk", 2.50));
        groceriesStorage.addItem(new Groceries("Bread", 1.20));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Sofa", 450.00, 2));
        furnitureStorage.addItem(new Furniture("Dining Table", 899.99, 3));
        furnitureStorage.addItem(new Furniture("Chair", 149.99, 1));

        System.out.println(" Electronics in Storage:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\n Groceries in Storage:");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("\n Furniture in Storage:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}

