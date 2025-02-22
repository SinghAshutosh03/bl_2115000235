
import java.io.*;

public class ByteArray {
    public static void main(String[] args) {
        String inputImagePath = "input.jpg";
        String outputImagePath = "output.jpg";
        String byteOutput = "byteoutput.txt";

        try {
            byte[] imageBytes = readImageToByteArray(inputImagePath);

            writeByteArrayToImage(outputImagePath, imageBytes);

            writeByteArrayToTextFile(byteOutput, imageBytes);

            System.out.println("Image conversion successful.");
        } catch (IOException e) {
            System.out.println("Error processing image: " + e.getMessage());
        }
    }

    private static byte[] readImageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    private static void writeByteArrayToImage(String imagePath, byte[] imageBytes) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(imagePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    private static void writeByteArrayToTextFile(String textFilePath, byte[] imageBytes) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(textFilePath))) {
            for (byte b : imageBytes) {
                writer.write(String.format("%02X☠️", b)); // Write each byte as a 2-character hex value
            }
            writer.write(String.format("\n"));
            for (byte b : imageBytes) {
                writer.write(String.format("%8s.-.", Integer.toBinaryString(b & 0xFF)).replace(' ', '0')); // Binary format
            }
        }
    }
}

