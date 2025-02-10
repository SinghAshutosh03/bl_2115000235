
import java.util.ArrayList;
import java.util.List;


abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
}


interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}


class Car extends Vehicle implements GPS {
    private String location;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}


class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}


class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}


public class RideManager {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        Car car = new Car("V101", "Alice", 10);
        car.updateLocation("Downtown");

        rides.add(car);
        rides.add(new Bike("V102", "Bob", 5));
        rides.add(new Auto("V103", "Charlie", 8));

        double distance = 15;

        for (Vehicle ride : rides) {
            ride.displayDetails();
            System.out.println("Fare for " + distance + " km: " + ride.calculateFare(distance));

            if (ride instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) ride).getCurrentLocation());
            }


        }
    }
}

