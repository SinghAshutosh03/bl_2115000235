import java.util.Arrays;
import java.util.Scanner;

class ResizeArrayLargestTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        for (int valid = 0; valid == 0; ) {
            if (number > 0) {
                valid = 1;
            } else {
                System.out.println("Invalid number. Please enter a positive number.");
                System.out.print("Enter a positive number: ");
                number = input.nextInt();
            }
        }
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int count = 0;

        for (int temp = number; temp > 0; temp /= 10) {
            if (count == maxDigits) {             
                maxDigits += 10;
                digits = Arrays.copyOf(digits, maxDigits);
            }
            digits[count++] = temp % 10;
        }
        digits = Arrays.copyOf(digits, count);
        Arrays.sort(digits);
        int largest = digits[count - 1];
        int secondLargest = (count > 1) ? digits[count - 2] : -1;

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + (secondLargest != -1 ? secondLargest : "None"));

       
    }
}

