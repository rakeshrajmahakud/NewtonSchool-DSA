package Sliding_Window;
import java.util.*;
import java.util.Scanner;
//optimized method
// //Maximum of all subarrays of size K
// // Given an array A and an integer K. Find the maximum for each and every contiguous subarray of size K.
public class MaxOfAllSubarrayOfSizeK {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int l=nums.length, i=0, j=0, t=0;
        int[] res=new int[l-k+1];
        Deque<Integer> dq=new ArrayDeque<Integer>();
        while(j<l){
            while(!dq.isEmpty() && dq.peekLast()<nums[j]){
                dq.removeLast();
            }
            dq.add(nums[j]);
            if(j-i+1<k)
                j++;
            else if(j-i+1==k){
                res[t++]=dq.peek();
                if(dq.peek()==nums[i])  dq.remove();
                i++;
                j++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {3,6,4,2,8,11,4,1,2,5};
        int k = 3;
        int[] resultarray = maxSlidingWindow(nums,k);

        for (int i: resultarray) {
            System.out.print(i+" ");
        }
    }

}
