
import java.util.*;
public class StringConcatenation{
    public static void main(String[] args) {
        long startTime, stringTime, builderTime, bufferTime;

        String str = "";
        startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            str += "A";
        }
        stringTime = System.nanoTime() - startTime;

        StringBuilder sb = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("A");
        }
        builderTime = System.nanoTime() - startTime;

        StringBuffer sbf = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            sbf.append("A");
        }
        bufferTime = System.nanoTime() - startTime;

        System.out.println("String execution time: " + (stringTime / 1e6) + "ms.");
        System.out.println("StringBuilder execution time: " + (builderTime / 1e6) + "ms.");
        System.out.println("StringBuffer execution time: " + (bufferTime / 1e6) + "ms.");
        System.out.println("StringBuilder & StringBuffer are much more efficient than String.");
        System.out.println("Use StringBuilder for single-threaded operations and StringBuffer for multi-threaded.");
    }
}

