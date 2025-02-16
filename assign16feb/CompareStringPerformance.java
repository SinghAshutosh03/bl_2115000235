
import java.util.*;
public class CompareStringPerformance {
    public static void main(String[] args) {
        int n = 1000000;
        
        StringBuffer sbf = new StringBuffer();
        long start1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbf.append("hello");
        }
        long end1 = System.nanoTime();
        
        StringBuilder sbd = new StringBuilder();
        long start2 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbd.append("hello");
        }
        long end2 = System.nanoTime();
        
        System.out.println("StringBuffer Time: " + (end1 - start1));
        System.out.println("StringBuilder Time: " + (end2 - start2));
    }
}

