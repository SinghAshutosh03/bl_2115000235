
import java.util.*;
public class SumNaturalNumbers1 {
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input. Enter a natural number.");
            return;
        }
        int recursiveResult = recursiveSum(n);
        int formulaResult = formulaSum(n);
        System.out.println("Sum using recursion: " + recursiveResult);
        System.out.println("Sum using formula: " + formulaResult);
        System.out.println("Both computations match: " + (recursiveResult == formulaResult));
    }
}

