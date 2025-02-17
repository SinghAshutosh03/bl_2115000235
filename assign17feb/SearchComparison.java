import java.util.Arrays;

public class SearchComparison{
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[1_000_000]; 
        for (int i = 0; i < arr.length; i++) arr[i] = i;
        int target = 500_000;

        long startTime, linearTime, binaryTime;

        startTime = System.nanoTime();
        int linearResult = linearSearch(arr, target);
        linearTime = System.nanoTime() - startTime;

        Arrays.sort(arr);

        startTime = System.nanoTime();
        int binaryResult = binarySearch(arr, target);
        binaryTime = System.nanoTime() - startTime;

        System.out.println("Linear Search found target at index " + linearResult + " in " + (linearTime / 1e6) + "ms.");
        System.out.println("Binary Search found target at index " + binaryResult + " in " + (binaryTime / 1e6) + "ms.");
        System.out.println("Binary Search performs much better for large datasets, provided data is sorted.");
    }
}

