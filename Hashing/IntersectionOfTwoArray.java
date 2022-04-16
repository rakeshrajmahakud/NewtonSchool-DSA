package Hashing;

import java.util.HashSet;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] arr =  {13,11,12,20};
        int[] arr2 = {1,2,3,20};
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for (int i = 0 ;i<arr2.length;i++){
            if(set.contains(arr2[i])) {
              count++;
               set.remove(arr2[i]);
           }
        }
        System.out.println(count);
    }
}
