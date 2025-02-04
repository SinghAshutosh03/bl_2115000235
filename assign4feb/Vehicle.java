
import java.util.Scanner;

class Vehicle {
    private static double registrationFee = 500.0;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

   
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

   
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }


    public void displayVehicle() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid Vehicle");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        System.out.print("Enter Owner Name: ");
        String owner = sc.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String type = sc.nextLine();
        System.out.print("Enter Registration Number: ");
        String regNum = sc.nextLine();

       
        Vehicle vehicle = new Vehicle(owner, type, regNum);


        vehicle.displayVehicle();

        System.out.print("Enter new Registration Fee: ");
        double newFee = sc.nextDouble();
        updateRegistrationFee(newFee);
        vehicle.displayVehicle();
   
    }
}

