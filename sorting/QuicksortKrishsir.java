package sorting;

import java.util.Arrays;

public class QuicksortKrishsir {
    private static void swap(int[] arr, int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }
    public static int partitionIndex(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l, j = l;
        while (i <= r) {
            if (arr[i] <= pivot) {
                if (i != j) swap(arr, i, j);
                j++;
            }
            i++;
        }
        return j - 1;
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int pi = partitionIndex(arr, l, r);
        quickSort(arr, l, pi - 1);
        quickSort(arr, pi + 1, r);
    }

    public static void main(String[] args) {
        int[] arr = {45, 35, 25, 15, 55, 35, 31};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
