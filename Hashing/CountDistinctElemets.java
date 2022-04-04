package Hashing;

import java.util.HashSet;
//very easy lavel qn
public class CountDistinctElemets {
    public static void main(String[] args) {
        int[] arr = {1,5,5,7,9,6,4,3,7,4};
        HashSet<Integer> set = new HashSet<>();
        for (int i:arr) {
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
