
import java.io.*;

public class ReadWrite {
    public static void main(String[] args) {
        String readFile = "read.txt";
        String writeFile = "write.txt";

        try (FileInputStream fis = new FileInputStream(readFile);
             FileOutputStream fos = new FileOutputStream(writeFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }
}

