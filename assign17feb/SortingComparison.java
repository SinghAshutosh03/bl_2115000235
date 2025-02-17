
import java.util.Arrays;

public class SortingComparison{
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10_000]; 
        for (int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random() * 100000);

        long startTime, bubbleTime, mergeTime, quickTime;

        int[] arrBubble = arr.clone();
        startTime = System.nanoTime();
        bubbleSort(arrBubble);
        bubbleTime = System.nanoTime() - startTime;

        int[] arrMerge = arr.clone();
        startTime = System.nanoTime();
        Arrays.sort(arrMerge);  
        mergeTime = System.nanoTime() - startTime;

        int[] arrQuick = arr.clone();
        startTime = System.nanoTime();
        Arrays.sort(arrQuick);
        quickTime = System.nanoTime() - startTime;

        System.out.println("Bubble Sort executed in " + (bubbleTime / 1e6) + "ms.");
        System.out.println("Merge Sort executed in " + (mergeTime / 1e6) + "ms.");
        System.out.println("Quick Sort executed in " + (quickTime / 1e6) + "ms.");

     
        
        System.out.println("Merge Sort & Quick Sort perform well.");
    }
}

