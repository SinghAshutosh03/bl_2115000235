
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class WordFrequencyCounter {

    public static void countWordFrequency(String fileName) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        Pattern pattern = Pattern.compile("\\b[\\w']+\\b", Pattern.UNICODE_CASE);

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line.toLowerCase());
                while (matcher.find()) {
                    String word = matcher.group();
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Word Frequency: " + wordCountMap);
    }

    public static void main(String[] args) {
        String fileName = "Read.txt";
        countWordFrequency(fileName);
    }
}

