package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfAnagrams {
    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";
        int k = pat.length();
        int n = txt.length();
        int i = 0;
        int j = 0;
        int count = 0;
        int res = 0;
        Map<Character, Integer> hm = new HashMap<>();
        for (i=0; i<k; i++) {
            if (hm.containsKey(pat.charAt(i))) {
                hm.put(pat.charAt(i), hm.get(pat.charAt(i))+1);
            } else {
                hm.put(pat.charAt(i), 1);
                count++;
            }
        }
        i=0;
        while (j<n) {
            if (hm.containsKey(txt.charAt(j))) {
                hm.put(txt.charAt(j), hm.get(txt.charAt(j))-1);
                if ( hm.get(txt.charAt(j)) == 0) {
                    count--;
                }
            }
            if (j-i+1 == k) {
                if (count == 0) {
                    res++;
                }
                if (hm.containsKey(txt.charAt(i))) {
                    if (hm.get(txt.charAt(i)) == 0) {
                        count++;
                    }
                    hm.put(txt.charAt(i), hm.get(txt.charAt(i))+1);
                }
                i++;
            }
            j++;
        }
        System.out.println(res);
    }
}
