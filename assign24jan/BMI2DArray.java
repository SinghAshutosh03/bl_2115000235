
import java.util.Scanner;
class BMI2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        double[][] personData = new double[numPersons][3]; // 0: weight, 1: height, 2: BMI
        String[] weightStatus = new String[numPersons];
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");

            System.out.print("Enter height in meters: ");
            personData[i][1] = input.nextDouble();

            System.out.print("Enter weight in kg: ");
            personData[i][0] = input.nextDouble();

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nBMI Details:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ": Height=" + personData[i][1] + "m, Weight=" + personData[i][0] + "kg, BMI=" + personData[i][2] + ", Status=" + weightStatus[i]);
        }

    }
}

