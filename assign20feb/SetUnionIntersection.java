
import java.util.*;

public class SetUnionIntersection {

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.printf("Set1: %s\n", set1);
        System.out.printf("Set2: %s\n", set2);

        Set<Integer> unionSet = union(set1, set2);
        Set<Integer> intersectionSet = intersection(set1, set2);

        System.out.printf("Union: %s\n", unionSet);
        System.out.printf("Intersection: %s\n", intersectionSet);
    }
}

