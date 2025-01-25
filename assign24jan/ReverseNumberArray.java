
import java.util.Scanner;

class ReverseNumberArray {
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
        int count = 0;
        int temp = number;
        for (int t = temp; t > 0; t /= 10) {
            count++;
        }

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

       
        System.out.println("Reversed Number:");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}

