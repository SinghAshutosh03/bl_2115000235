
import java.util.Arrays;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 5, 6};
        int target = 4;
        System.out.println(Arrays.toString(findFirstLast(arr, target)));
    }

    public static int[] findFirstLast(int[] arr, int target) {
        int first = -1, last = -1;
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                first = mid;
                right = mid - 1; // Keep searching on the left side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                last = mid;
                left = mid + 1; // Keep searching on the right side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}

