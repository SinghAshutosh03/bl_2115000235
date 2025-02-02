
import java.util.*;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 5000.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("John", "Sedan", 5);
        rental.display();
    }
}

