import java.util.Scanner;

class FactorsFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++)
            if (number % i == 0) System.out.println(i);
        
    }
}
