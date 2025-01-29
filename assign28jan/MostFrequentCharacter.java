import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        

        char[] charArray = input.toCharArray();
        int[] frequency = new int[256]; // Array to store frequency of each character

        for (int i = 0; i < charArray.length; i++) {
            frequency[charArray[i]]++;
        }

        char mostFrequent = charArray[0];
        int maxCount = frequency[mostFrequent];

        for (int i = 1; i < charArray.length; i++) {
            if (frequency[charArray[i]] > maxCount) {
                mostFrequent = charArray[i];
                maxCount = frequency[charArray[i]];
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}

