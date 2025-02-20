
import java.util.*;

public class SetSubset {

    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        for (Integer element : set1) {
            boolean found = false;
            for (Integer el : set2) {
                if (element.equals(el)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.printf("Set1: %s\n", set1);
        System.out.printf("Set2: %s\n", set2);

        boolean result = isSubset(set1, set2);

        System.out.printf("Is Set1 a subset of Set2 ? %b\n", result);
    }
}

