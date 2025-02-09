
import java.util.Scanner;

class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void getOrderStatus() {
        System.out.println("Order ID: " + orderId + ", Date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivered on: " + deliveryDate);
    }
}

public class OrderSystem {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(5001, "2025-01-10", "TN123456", "2025-01-15");
        d.getOrderStatus();
    }
}

