
import java.util.*;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (Integer element : list) {
            if (!seen.contains(element)) {
                resultList.add(element);
                seen.add(element);
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> resultList = removeDuplicates(list);

        System.out.println("List after removing duplicates: " + resultList);
    }
}

