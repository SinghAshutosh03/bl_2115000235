
import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        String targetWord = "hello";
        int count = 0;

        try {
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals(targetWord)) {
                        count++;
                    }
                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        System.out.println("Word count: " + count);
    }
}

