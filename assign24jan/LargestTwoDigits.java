
import java.util.Scanner;

class LargestTwoDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Validate the input using a for-loop
        for (int valid = 0; valid == 0; ) {
            if (number > 0) {
                valid = 1; // Mark as valid input
            } else {
                System.out.println("Invalid number. Please enter a positive number.");
                System.out.print("Enter a positive number: ");
                number = input.nextInt();
            }
        }

        // Calculate digit count and extract digits
        int temp = number;
        int count = 0;

        // Find the number of digits using a for-loop
        for (int t = temp; t > 0; t /= 10) {
            count++;
        }

        // Create an array for digits and extract them
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Find the largest and second largest digit
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < count; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output the result
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + (secondLargest != -1 ? secondLargest : "None"));

        input.close();
    }
}

