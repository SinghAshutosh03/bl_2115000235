import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        for (int valid = 0; valid == 0; ) {
            if (number > 0) {
                valid = 1; // Valid input
            } else {
                System.out.println("Invalid input. Enter a positive number.");
                System.out.print("Enter a positive number: ");
                number = input.nextInt();
            }
        }
        int[] frequency = new int[10];
        int temp = number;
        for (int t = temp; t > 0; t /= 10) {
            int digit = t % 10;
            frequency[digit]++;
        }
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

      
    }
}

