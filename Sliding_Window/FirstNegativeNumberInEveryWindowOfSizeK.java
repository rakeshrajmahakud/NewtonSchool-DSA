package Sliding_Window;
import java.util.*;

public class FirstNegativeNumberInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1,5,9,-1,4,4,8,-2,-4,-5,4,-7};
        int k = 3;
        int i = 0;
        int j = 0;
        Queue<Integer> q = new ArrayDeque<>();
        while(j< arr.length){
            if (arr[j]<0) q.add(arr[j]);
            if ((j-i+1)<k) j++;
            else if ((j-i+1)==k){
                if (q.isEmpty()){
                    System.out.print(0+",");
                }else{
                    System.out.print(q.peek()+",");
                }
                if (q.size()>0 && arr[i]==q.peek()){
                    q.poll();
                }
                i++;
                j++;
            }
        }
    }
}
