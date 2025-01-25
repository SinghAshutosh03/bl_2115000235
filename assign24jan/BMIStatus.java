import java.util.Scanner;
class BMIStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        double[] height = new double[numPersons];
        double[] weight = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");

            System.out.print("Enter height in meters: ");
            height[i] = input.nextDouble();

            System.out.print("Enter weight in kg: ");
            weight[i] = input.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        System.out.println("\nBMI Details:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ": Height=" + height[i] + "m, Weight=" + weight[i] + "kg, BMI=" + bmi[i] + ", Status=" + status[i]);
        }
    }
}

