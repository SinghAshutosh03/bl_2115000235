import java.util.Scanner;

class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base and power:");
        int base = input.nextInt(), power = input.nextInt(), result = 1;
        for (int i = 1; i <= power; i++) result *= base;
        System.out.println("Result: " + result);
        
    }
}
