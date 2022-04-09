package com.newtonschool;

import java.util.Scanner;
public class donation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int max = 0;
        long total = 0L;
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
            total +=arr[i];
            }
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                System.out.print(0+" ");
            }else{
                total = total +(max-arr[i]);
                System.out.print(max-arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println(total);   
    }
}
