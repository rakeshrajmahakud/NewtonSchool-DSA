package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1,1,9,11,1,6,4,1,9,9,9,4,1};
        Map<Integer,Integer> map = new HashMap<>();

        int dup = 0;
//        System.out.print(j);
        for (int i:arr) {
            int freq;
            if (map.containsKey(i)){
                freq = map.get(i);
                freq = freq +1;
                dup = dup+1;
            }else {
                freq = 1;
            }
            map.put(i,freq);
        }
        System.out.println(map);
        System.out.println(dup);
    }
}
