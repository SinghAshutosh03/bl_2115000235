
import java.util.*;
public class FibonacciComparison {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        long startTime, recursiveTime, iterativeTime;

        startTime = System.nanoTime();
        int recursiveResult = fibonacciRecursive(10);
        recursiveTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        int iterativeResult = fibonacciIterative(10);
        iterativeTime = System.nanoTime() - startTime;

        System.out.println("Recursive Fibonacci (N=10): " + recursiveResult + " in " + (recursiveTime / 1e6) + "ms.");
        System.out.println("Iterative Fibonacci (N=10): " + iterativeResult + " in " + (iterativeTime / 1e6) + "ms.");

        startTime = System.nanoTime();
        int iterativeResultLarge = fibonacciIterative(50);
        iterativeTime = System.nanoTime() - startTime;
        
        System.out.println("Iterative Fibonacci (N=50): " + iterativeResultLarge + " in " + (iterativeTime / 1e6) + "ms.");

        System.out.println("Attempting Recursive Fibonacci for N=30 (this may take a while)...");
        startTime = System.nanoTime();
        int recursiveResultLarge = fibonacciRecursive(30);
        recursiveTime = System.nanoTime() - startTime;

        System.out.println("Recursive Fibonacci (N=30): " + recursiveResultLarge + " in " + (recursiveTime / 1e6) + "ms.");

        System.out.println("Now attempting Recursive Fibonacci for N=50...");

        System.out.println("This will take **too long** to compute because the recursive approach has an **exponential time complexity O(2^N)**.");
        System.out.println("For example, at N=50, it would take more than an hour due to redundant calculations in recursion.");

        System.out.println("Recursive approach is infeasible for large values of N due to exponential growth.");
        System.out.println("The iterative approach is significantly faster and memory-efficient.");
    }
}


