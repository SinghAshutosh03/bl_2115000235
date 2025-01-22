import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for x: ");
        double x = input.nextDouble();

        System.out.print("Enter value for y: ");
        double y = input.nextDouble();

        System.out.print("Enter value for z: ");
        double z = input.nextDouble();

        double result1 = x + y * z;
        double result2 = x * y + z;
        double result3 = z + x / y;

        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", and " + result3);
    }
}
