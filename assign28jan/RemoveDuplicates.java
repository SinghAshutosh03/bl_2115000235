import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
       

        char[] charArray = input.toCharArray();
        String result = "";

        for (int i = 0; i < charArray.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (charArray[i] == charArray[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result += charArray[i];
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}

