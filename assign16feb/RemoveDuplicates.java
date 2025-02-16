
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c);
            }
        }
        System.out.println(sb.toString());
    }
}

