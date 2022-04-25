//package Sliding_Window;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class CountOccurance {
//    public static void main(String[] args) {
//        String txt = "forxxorfxdofr";
//        String pat = "for";
//        int ans = 0;//check the number of Anagrams
//        int k = pat.length();//size of pattern
//        int n = txt.length();//length of string
//        Map<Character, Integer> m = new HashMap<>();
//        for (int i = 0; i < k; i++) {
//            m.put(pat.charAt(i),m.get(pat.charAt(i))+1);
//        }
//        int i = 0, j = 0, count = m.size();
//        while (j < n) {
//            if (m.find(txt[j]) != m.end())//if the char is present in the map decrease the count the char in the map
//                m[txt[j]]--;
//            if (m[txt[j]] == 0) {
//                count--;
//            }
//        }
//        if (j - i + 1 < k) j++;//to check the  j reach the window size
//        else if (j - i + 1 == k) {//to hit the window size
//            if (count == 0) {
//                ans++;
//            }
//
//            if (m.find(txt[i]) != m.end()) {
//                m[txt[i]]++;
//                if (m[txt[i]] == 1) count++;
//            }
//            i++;
//            j++;
//        }
//        System.out.println(ans);
//    }
//}
