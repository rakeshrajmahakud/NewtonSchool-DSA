package com.newtonschool;

import java.util.*;
public class maxxarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int arr[] = new int[input];
        for(int i=0;i<input;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=1;i<input;i++){
            if(arr[i]<arr[i-1]){
                max = -1;
            }
            max = max+1;
        }
        System.out.println(max);
    }
}
