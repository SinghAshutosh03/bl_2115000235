
import java.util.*;

public class TemperatureWeightVolumeConverter {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }
    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println("In Celsius: " + convertFahrenheitToCelsius(fahrenheit));

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("In Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("In kilograms: " + convertPoundsToKg(pounds));

        System.out.print("Enter weight in kilograms: ");
        double kg = sc.nextDouble();
        System.out.println("In pounds: " + convertKgToPounds(kg));

        System.out.print("Enter volume in gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("In liters: " + convertGallonsToLiters(gallons));

        System.out.print("Enter volume in liters: ");
        double liters = sc.nextDouble();
        System.out.println("In gallons: " + convertLitersToGallons(liters));
    }
}

