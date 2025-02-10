
import java.util.ArrayList;
import java.util.List;


abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public void displayDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}


interface Discountable {
    double applyDiscount();
}


class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}


class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; 
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }
}


public class FoodOrderManager {
    public static void main(String[] args) {
        List<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(new VegItem("Paneer", 200, 2));
        foodItems.add(new NonVegItem("Chicken", 300, 1));

        for (FoodItem item : foodItems) {
            item.displayDetails();
            if (item instanceof Discountable) {
                Discountable discountItem = (Discountable) item;
                System.out.println("Discount: " + discountItem.applyDiscount());
            }
           
        }
    }
}

