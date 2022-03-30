/*First non- repeating character in a String
        Time Limit: 2 sec
        Memory Limit: 128000 kB
        Problem Statement
        Given a string s, find the first non- repeating character in the string and return its index. If it does not exist, return -1.
        Input
        First line of the input contains the string s.
//        Constraints
        1<= s. length <= 100000
//      Output
        Print the index of the first non- repeating character in a string
        Example
        Input
        s = "newtonschool"
        Output
        1
        Explanation
        "e" is the first non- repeating character in a string
 */
package Hashing;
import java.util.*;

public class FirstNonRepetingCharacter {
    static int nonrep(String s)
    {
        char[] str=s.toCharArray();
        HashMap <Character,Integer> map = new HashMap<>();
        for(char c:str)
        {
            //System.out.println(c);
            if (map.get(c)==null)
                map.put(c,1);
            else
                map.put(c,map.get(c)+1);
        }
        //System.out.println(map);
        int index=0;
        for(char c:str)
        {
            if(map.get(c)==1) return index;
            index+=1;
        }
        return -1;
    }
    public static void main (String[] args) {
        // Your code here
//        Scanner scn = new Scanner(System.in);
//        String s = scn.nextLine();
//        System.out.println(nonrep(s));


    }
}
