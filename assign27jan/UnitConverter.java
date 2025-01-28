Import java.util.*;
public class UnitConverter {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        System.out.println("In miles: " + convertKmToMiles(km));

        System.out.print("Enter distance in miles: ");
        double miles = sc.nextDouble();
        System.out.println("In kilometers: " + convertMilesToKm(miles));

        System.out.print("Enter height in meters: ");
        double meters = sc.nextDouble();
        System.out.println("In feet: " + convertMetersToFeet(meters));

        System.out.print("Enter height in feet: ");
        double feet = sc.nextDouble();
        System.out.println("In meters: " + convertFeetToMeters(feet));
    }
}

