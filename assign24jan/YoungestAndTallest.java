
import java.util.Scanner;

class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

       
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Enter age: ");
            ages[i] = input.nextInt();
            while (ages[i] <= 0) {
                System.out.println("Invalid age. Please enter a positive value.");
                System.out.print("Enter age: ");
                ages[i] = input.nextInt();
            }

            System.out.print("Enter height in cm: ");
            heights[i] = input.nextDouble();
            while (heights[i] <= 0) {
                System.out.println("Invalid height. Please enter a positive value.");
                System.out.print("Enter height in cm: ");
                heights[i] = input.nextDouble();
            }
        }

       
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
        }

        // Output results
        System.out.println("\nYoungest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        input.close();
    }
}

