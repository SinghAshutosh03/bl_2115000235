import java.util.Scanner;

class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        for (int i = 100; i > 0; i--)
            if (i % number == 0) System.out.println(i);
        
    }
}
