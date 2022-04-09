package com.newtonschool;

import java.util.Scanner;
// Given an array of integers of size N, your task is to find the maximum j - i such that Arr[j] > Arr[i] where 0 < = i < j < = N-1.
public class onedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int arr[] = new int[input];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < arr.length; i++) {

                if(arr[i-1]<arr[i]){
                    count +=1;
                }
                else count = -1;
        }
        System.out.println(count);
    }
}
