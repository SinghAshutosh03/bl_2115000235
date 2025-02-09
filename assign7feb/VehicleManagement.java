
import java.util.Scanner;

interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println("Charging " + model + " with battery capacity: " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelCapacity;

    PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    public void refuel() {
        System.out.println("Refueling " + model + " with fuel capacity: " + fuelCapacity + " liters");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(180, "Ford Mustang", 60);

        ev.displayInfo();
        ev.charge();

        pv.displayInfo();
        pv.refuel();
    }
}

