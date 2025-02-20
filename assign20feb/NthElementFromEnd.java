
import java.util.LinkedList;

public class NthElementFromEnd {

    public static String findNthFromEnd(LinkedList<String> list, int N) {
        if (list == null || list.size() < N) {
            return "Invalid input";
        }

        String slow = null, fast = null;

        for (int i = 0; i < N; i++) {
            fast = list.get(i);
        }

        for (int i = N; i < list.size(); i++) {
            slow = fast;
            fast = list.get(i);
        }

        return slow;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        String result = findNthFromEnd(list, n);

        System.out.println("The " + n + "th element from the end is: " + result);
    }
}

