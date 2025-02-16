import java.io.*;

public class CompareAll {
    public static void main(String[] args) {
        int n = 1000000;
        
        StringBuilder sb = new StringBuilder();
        long start1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        long end1 = System.nanoTime();
        
        StringBuffer sbf = new StringBuffer();
        long start2 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbf.append("hello");
        }
        long end2 = System.nanoTime();
        
        System.out.println("StringBuilder Time: " + (end1 - start1));
        System.out.println("StringBuffer Time: " + (end2 - start2));

        try {
            FileReader fr = new FileReader("largefile.txt");
            BufferedReader br = new BufferedReader(fr);
            int wordCount = 0;
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                wordCount += words.length;
            }
            
            br.close();
            System.out.println("Word Count: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        
        try {
            FileInputStream fis = new FileInputStream("largefile.txt");
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            int wordCount = 0;
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                wordCount += words.length;
            }

            br.close();
            System.out.println("Word Count Using InputStreamReader: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

