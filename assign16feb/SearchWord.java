
import java.util.*;

public class SearchWord {
    public static void main(String[] args) {
        String[] sentences = {"Hello world", "Java is fun", "Programming is awesome"};
        String word = "Java";
        System.out.println(findSentence(sentences, word));
    }

    public static String findSentence(String[] sentences, String word) {
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) return sentences[i];
        }
        return "Not Found";
    }
}

