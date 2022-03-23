package Sliding_Window;
//using brute force method
 //Maximum of all sub arrays of size K
// // Given an array A and an integer K. Find the maximum for each and every contiguous sub array of size K.
public class MaxOfAllSubarraysOfSizeKBruteForce {
    private static int[] maxofAllSubarray_BruteForce(int[] a, int k) {
        int n = a.length;
        int[] maxOfSubarrays = new int[n - k + 1];
        int idx = 0;

        for(int i = 0; i <= n-k; i++) {
            int maxElement = Integer.MIN_VALUE;
            for(int j = i; j < i+k; j++) {
                if(maxElement < a[j]) {
                    maxElement = a[j];
                }
            }
            maxOfSubarrays[idx++] = maxElement;
        }
        return maxOfSubarrays;
    }

    public static void main(String[] args) {
        int[] a = {3,6,4,2,8,11,4,1,2,5};
        int k = 3;
        int[] result = maxofAllSubarray_BruteForce(a, k);

        // printing the result
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
