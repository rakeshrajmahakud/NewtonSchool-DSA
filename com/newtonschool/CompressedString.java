package com.newtonschool;
import java.util.*;

public class CompressedString {
    static void compress_str(String str){
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count == 1) {
                System.out.print(str.charAt(i) + "1");
            }else {
                System.out.print(str.charAt(i));
                System.out.print(count);
            }
        }
        System.out.println();
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Test case");
        int t = sc.nextInt();
        while(t != 0){
            System.out.println("Enter the upper case siring (without space)which you wants to compress:");
            String str = sc.next();
            compress_str(str);
            t--;
        }
    }
}
