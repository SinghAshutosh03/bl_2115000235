
Import java.util.*;
public class AdvancedUnitConverter {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in yards: ");
        double yards = sc.nextDouble();
        System.out.println("In feet: " + convertYardsToFeet(yards));

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        System.out.println("In yards: " + convertFeetToYards(feet));

        System.out.print("Enter height in meters: ");
        double meters = sc.nextDouble();
        System.out.println("In inches: " + convertMetersToInches(meters));

        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();
        System.out.println("In meters: " + convertInchesToMeters(inches));
        System.out.println("In centimeters: " + convertInchesToCm(inches));
    }
}

