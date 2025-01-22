import java.util.Scanner;

public class AthleteRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of side 1 in meters: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side 2 in meters: ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of side 3 in meters: ");
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km in meters

        int rounds = (int) Math.ceil(totalDistance / perimeter);

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}
