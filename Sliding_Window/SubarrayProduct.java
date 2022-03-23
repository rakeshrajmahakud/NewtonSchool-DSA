package Sliding_Window;

import java.util.ArrayDeque;
import java.util.Deque;

public class SubarrayProduct {
    public static void main(String[] args) {
        int[] nums = {1,5,2,3,6,4};
        int k = 4;
        int l=nums.length, i=0, j=0, t=0;
        int res= 1;
        Deque<Integer> dq=new ArrayDeque<Integer>();
        while(j<l){
            while(!dq.isEmpty() && dq.peekLast()<nums[j]){
                dq.removeLast();
            }
            dq.add(nums[j]);
            if(j-i+1<k)
                j++;
            else if(j-i+1==k){
                res *=dq.peek();
                if(dq.peek()==nums[i])  dq.remove();
                i++;
                j++;
            }
        }
        System.out.print(res);
    }
}
