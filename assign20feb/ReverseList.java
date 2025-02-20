import java.util.*;

public class ReverseList {

    public static void reverseArrayList(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }

    public static void reverseLinkedList(LinkedList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(2);
        arrayList.add(13);
        arrayList.add(45);
        arrayList.add(57);

        System.out.printf("ArrayList: %s\n", arrayList);
        reverseArrayList(arrayList);
        System.out.printf("Reversed ArrayList: %s\n", arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(16);
        linkedList.add(41);
        linkedList.add(8);
        linkedList.add(17);

        System.out.printf("LinkedList: %s\n", linkedList);
        reverseLinkedList(linkedList);
        System.out.printf("Reversed LinkedList: %s\n", linkedList);
    }
}

