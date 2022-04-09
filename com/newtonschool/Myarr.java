package com.newtonschool;

import java.util.Scanner;
public class Myarr {
    
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int sum = 0;
        for(int i=1; i<n;i++){
            ar[i] = ar[i-1]+i;
            sum +=ar[i];
        }
        
        System.out.println(sum);
    }
}
