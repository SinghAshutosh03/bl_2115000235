import java.util.*;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car");
        v1.displayVehicleDetails();
        System.out.println("Registration Fee: Rs" + registrationFee);
        
        Vehicle.updateRegistrationFee(6000.0);
        System.out.println("Updated Registration Fee: Rs" + registrationFee);
    }
}

