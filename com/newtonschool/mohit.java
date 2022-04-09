package com.newtonschool;

import java.util.*;
public class mohit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n-1];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int sum = 0;
        int tempsum = 0;
        for(int i=0;i<arr.length;i++){
           sum += arr[i];
        }
        for(int i=1;i<=n;i++){
            tempsum += i;
         }

        System.out.print(tempsum-sum);
  
    } 
}
