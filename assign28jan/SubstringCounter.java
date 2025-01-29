import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring to count: ");
        String subString = scanner.nextLine();
       

        int mainLength = mainString.length();
        int subLength = subString.length();
        int count = 0;

        for (int i = 0; i <= mainLength - subLength; i++) {
            boolean match = true;
            for (int j = 0; j < subLength; j++) {
                if (mainString.charAt(i + j) != subString.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}

