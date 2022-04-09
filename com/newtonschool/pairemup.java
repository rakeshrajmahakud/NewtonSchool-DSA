package com.newtonschool;

public class pairemup {
    public static void main(String[] args) {
        int arr[] = {3,1,1,4};
        int max = 0;
        for (int i = 1; i < arr.length; i=i+2) {
            if((arr[i]+arr[i-1]) > max){
                max = arr[i]+arr[i-1];
            }    
        }
        System.out.print(max);
    }
}
