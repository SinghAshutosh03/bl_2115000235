
import java.util.*;

public class GenerateBinaryNumbers {

    public static List<String> generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {
            String binary = queue.remove();
            result.add(binary);
            queue.add(binary + "0");
            queue.add(binary + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        List<String> binaryNumbers = generateBinaryNumbers(N);

        System.out.printf("First %d binary numbers: %s\n", N, binaryNumbers);
    }
}

