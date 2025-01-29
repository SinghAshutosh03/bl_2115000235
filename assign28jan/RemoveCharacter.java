import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);
       

        char[] charArray = input.toCharArray();
        char[] resultArray = new char[charArray.length];
        int index = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charToRemove) {
                resultArray[index] = charArray[i];
                index++;
            }
        }

        // Construct new string manually
        String result = "";
        for (int i = 0; i < index; i++) {
            result += resultArray[i];
        }

        System.out.println("Modified String: " + result);
    }
}

