import java.util.*;
class PrimeNum {
    public static void main(String[] args) {
	System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean isPrime = true;

        if (number > 1) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }

        
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}















