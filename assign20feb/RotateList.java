
import java.util.*;

public class RotateList {

    public static List<Integer> rotateList(List<Integer> list, int positions) {
        int size = list.size();
        positions = positions % size;
        List<Integer> rotatedList = new ArrayList<>();

        for (int i = positions; i < size; i++) {
            rotatedList.add(list.get(i));
        }

        for (int i = 0; i < positions; i++) {
            rotatedList.add(list.get(i));
        }

        return rotatedList;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int positions = 2;

        List<Integer> rotatedList = rotateList(list, positions);

        System.out.println("Rotated List: " + rotatedList);
    }
}

