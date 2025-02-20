import java.util.*;
public class SetToSortedList {

    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        for (int i = 0; i < sortedList.size(); i++) {
            for (int j = i + 1; j < sortedList.size(); j++) {
                if (sortedList.get(i) > sortedList.get(j)) {
                    int temp = sortedList.get(i);
                    sortedList.set(i, sortedList.get(j));
                    sortedList.set(j, temp);
                }
            }
        }
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        System.out.printf("Set: %s\n", set);

        List<Integer> sortedList = convertToSortedList(set);

        System.out.printf("Sorted List: %s\n", sortedList);
    }
}

