
import java.io.*;

public class FileReaderVsInputStreamReader {

    public static int readUsingFileReader(String fileName) {
        int lineCount = 0;
        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {
            while (br.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineCount;
    }

    public static int readUsingInputStreamReader(String fileName) {
        int lineCount = 0;
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {
            while (br.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineCount;
    }

    public static void main(String[] args) {
        String fileName = "data.txt";
        long startTime, fileReaderTime, inputStreamReaderTime;

        System.out.println("Reading using FileReader...");
        startTime = System.nanoTime();
        int fileReaderLines = readUsingFileReader(fileName);
        fileReaderTime = System.nanoTime() - startTime;
        System.out.println("FileReader read " + fileReaderLines + " lines in " + (fileReaderTime / 1e6) + "ms.");

        System.out.println("\nReading using InputStreamReader...");
        startTime = System.nanoTime();
        int inputStreamReaderLines = readUsingInputStreamReader(fileName);
        inputStreamReaderTime = System.nanoTime() - startTime;
        System.out.println("InputStreamReader read " + inputStreamReaderLines + " lines in " + (inputStreamReaderTime / 1e6) + "ms.");

        System.out.println("\nInputStreamReader is more efficient for large files.");
        System.out.println("FileReader is preferable for text-based data.");
    }
}

