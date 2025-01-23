import java.util.Scanner;

class FriendComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ages and heights of Amar, Akbar, and Anthony:");
        int age1 = input.nextInt(), height1 = input.nextInt();
        int age2 = input.nextInt(), height2 = input.nextInt();
        int age3 = input.nextInt(), height3 = input.nextInt();
        System.out.println("Youngest Age: " + Math.min(age1, Math.min(age2, age3)));
        System.out.println("Tallest Height: " + Math.max(height1, Math.max(height2, height3)));
        
    }
}
