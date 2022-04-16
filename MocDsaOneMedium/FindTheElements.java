package MocDsaOneMedium;
import java.util.*;
////////////////DSA 1  MEDIUM LEVEL MOC//////////////////////

// Java program to find elements that are
// larger than half of the elements in array

public class FindTheElements {
    // Print elements larger than n/2 element
    static void findLarger(int arr[], int n)
    {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Print last ceil(n/2) elements
        for (int i = n-1; i >= n/2; i--)
            System.out.print(arr[i] + " ");
    }

    // Driver program
    public static void main(String[] args)
    {
        int arr[] = {1, 3, 6, 1, 0, 9};
        int n = arr.length;
        findLarger(arr, n);
    }
}
