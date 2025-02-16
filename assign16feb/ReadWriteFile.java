
import java.io.*;

public class ReadWriteFile {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter("output.txt");

            while (true) {
                String input = br.readLine();
                if (input.equals("exit")) break;
                fw.write(input + "\n");
            }

            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}

