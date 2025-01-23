import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight (kg) and height (cm):");
        double weight = input.nextDouble();
        double height = input.nextDouble() / 100; // Convert height from cm to meters

        double bmi = weight / (height * height);
        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.println("BMI: " + bmi + ", Status: " + status);
        input.close();
    }
}

