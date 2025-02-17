import java.util.*;

public class DataStructureComparison {
    public static void main(String[] args) {
        int[] arr = new int[1_000_000];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }
        int target = 500_000;

        long startTime = System.nanoTime();
        boolean foundArray = Arrays.binarySearch(arr, target) >= 0;
        long arrayTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        boolean foundHashSet = hashSet.contains(target);
        long hashSetTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        boolean foundTreeSet = treeSet.contains(target);
        long treeSetTime = System.nanoTime() - startTime;

        System.out.println("HashSet search time: " + (hashSetTime / 1e6) + "ms.");
        System.out.println("TreeSet search time: " + (treeSetTime / 1e6) + "ms.");
        System.out.println("HashSet is fastest for lookups but requires extra memory.");
        System.out.println("TreeSet maintains order but is slightly slower than HashSet.");
    }
}

