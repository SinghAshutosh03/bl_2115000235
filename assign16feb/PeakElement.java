
import java.util.*;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 3, 2};
        System.out.println(findPeak(arr));
    }

    public static int findPeak(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) right = mid;
            else left = mid + 1;
        }
        return arr[left];
    }
}

