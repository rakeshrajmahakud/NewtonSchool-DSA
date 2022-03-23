package Sliding_Window;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//first negative integer in every window of size K
public class FindNegetiveInteger {
    public static void main(String[] args) {
        int[] arr = {3,5,-7,-9,11,-2,5,-18,-4,2,-2,5,8};
        Queue<Integer> q= new LinkedList<>();
        int k =3;  // winddow size
        int i = 0;
        int j = 0;
        int p = 0;
        int n = arr.length;
        long[] ans = new long[n-k+1];
        while(j<n){
            if(arr[j]<0) q.add(arr[j]);
            if (j-i+1 <k) j++;
            else if((j-i+1)==k){
                if (q.size() == 0) {
                    ans[p++] = 0;
                }else{
                    ans[p++] = q.peek();
                }
                if (q.size()>0 && arr[i]==q.peek()){
                    q.poll();
                }
                i++;
                j++;
            }
        }
        // --while loop end --
        for (int l = 0; l < ans.length; l++) {
            System.out.print(ans[l] + " ");
        }
    }
}
