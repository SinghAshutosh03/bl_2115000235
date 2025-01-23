import java.util.Scanner;

class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt(), factor = 1;
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                factor = i;
                break;
            }
        }
        System.out.println("Greatest Factor: " + factor);
        input.close();
    }
}
