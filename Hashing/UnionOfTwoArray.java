package Hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr = {10,12,13,14,11,10,10};
        int[] arr2 = {10,12,11,15,6,3};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i< arr.length;i++){
            set.add(arr[i]);
        }
        for (int i = 0; i< arr2.length;i++){
            set.add(arr2[i]);
        }

        System.out.println(set);
        System.out.println(set.size());
    }
}
