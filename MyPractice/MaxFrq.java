package MyPractice;
//Find sub array with given sum (handle negative numbers)
//given an unsorted array of integers , find a sub array that added to a given number .if there is more then one sub array with sum of the given number,print any of them


public class MaxFrq {
    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5}; //test this  first case array
        int sum = 33;
        int[] arr2 = {10,2,-2,-20,-10}; //test this second case array
        int sum1 = -10;
        iterableApproch(arr2,sum1);

    }
    // iterable approach (time complexity = n^2) // so this is not a good approach
    public static int iterableApproch(int[] arr,int sum){
        int curr_sum;
        for (int i = 0; i < arr.length; i++) {
            curr_sum = 0;
            for (int j = i; j < arr.length; j++) {
                curr_sum = curr_sum +arr[j];
                if (curr_sum == sum){
                    System.out.println("sum found in between index " + i + " and " + j);
                    return 1;
                }
            }
        }
        System.out.println("no sub array found ");
        return -1;
    }

    //Optimized approach

}
