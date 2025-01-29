import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
       

        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = length1 < length2 ? length1 : length2;

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
                return;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\"");
                return;
            }
        }

        if (length1 == length2) {
            System.out.println("Both strings are equal.");
        } else if (length1 < length2) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\"");
        }
    }
}

