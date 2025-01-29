import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.next();
        System.out.print("Enter the new word: ");
        String newWord = scanner.next();
        String modifiedSentence = "";
        int i = 0, length = sentence.length();
        int oldWordLength = oldWord.length();

        while (i < length) {
            boolean match = true;
            if (i + oldWordLength <= length) {
                for (int j = 0; j < oldWordLength; j++) {
                    if (sentence.charAt(i + j) != oldWord.charAt(j)) {
                        match = false;
                        break;
                    }
                }
            } else {
                match = false;
            }
            if (match) {
                modifiedSentence += newWord;
                i += oldWordLength; // Skip over the old word
            } else {
                modifiedSentence += sentence.charAt(i);
                i++;
            }
        }

        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}

