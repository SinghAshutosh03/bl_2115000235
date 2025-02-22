
import java.io.*;

class FileCopy{
    public static void main(String[] args) {
        String readFile = "read.txt";
        String writeFile = "write2.txt";
        final int BUFFER_SIZE = 4096;

        long startTime, endTime;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(readFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(writeFile))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            startTime = System.nanoTime();

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            endTime = System.nanoTime();
            System.out.println("Buffered Streams copy completed in: " + (endTime - startTime) + " nanoseconds.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(readFile);
             FileOutputStream fos = new FileOutputStream(writeFile)) {

            int byteData;
            startTime = System.nanoTime();

            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            endTime = System.nanoTime();
            System.out.println("Unbuffered Streams copy completed in: " + (endTime - startTime) + " nanoseconds.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }
}

