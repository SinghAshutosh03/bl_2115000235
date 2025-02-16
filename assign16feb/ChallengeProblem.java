
import java.util.Arrays;

public class ChallengeProblem {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 4;

        System.out.println("First Missing Positive: " + findFirstMissingPositive(arr));
        System.out.println("Target Index: " + binarySearch(arr, target));
    }

    public static int findFirstMissingPositive(int[] arr) {
        Arrays.sort(arr); // Sorting is allowed
        int smallest = 1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallest) {
                smallest++;
            }
        }
        return smallest;
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr); // Sorting before binary search
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}

