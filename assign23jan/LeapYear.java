

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the year
        System.out.print("Enter a year (year >= 1582): ");
        int year = input.nextInt();

        // Check if the year is in the Gregorian calendar range
        if (year < 1582) {
            System.out.println("The year " + year + " is not valid. Leap Year calculations only work for years >= 1582.");
        } else {
            // PART 1: Using multiple if-else statements
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("The year " + year + " is a Leap Year.");
                    } else {
                        System.out.println("The year " + year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println("The year " + year + " is a Leap Year.");
                }
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }

            // PART 2: Using a single if statement with multiple logical conditions
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        }
    }
}

