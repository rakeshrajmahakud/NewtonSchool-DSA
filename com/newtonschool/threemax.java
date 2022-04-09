package com.newtonschool;

import java.util.Scanner;
public class threemax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int txtcase = sc.nextInt();
        for (int i= 0;i<txtcase;i++){
            int arrlen = sc.nextInt();
            int arr[] = new int[arrlen];
            for(int j = 0;j<arr.length;j++){
                arr[j] = sc.nextInt();
                System.out.print(arr[j]);
            }
        }
    }
}
