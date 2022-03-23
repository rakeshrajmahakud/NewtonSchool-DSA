package Sliding_Window;
//bruteforce approach to find max
// here k value is 3

public class SlidingWindow_problem1 {
    public static void main(String[] args) {
        int[] arr = {1,8,9,4,5,5,6,20,18,11,6,16,19,3,9};
        int sum=0;
        int max=0;
        int index = 0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i; j < i+3; j++) {
                sum = sum + arr[j];
            }
            if (sum>max){
                max =sum;
                index = i;
            }
            sum = 0;
        }
        System.out.println(max);
        System.out.println("the max value index start from "+ index + " & ends with "+ (index+2));
    }
}
