package com.newtonschool;

public class recursion {
    static int myfinc(int n){
        if(n == 0){
            return 1;
        }else{
            // System.out.println(n);
           return n*myfinc(n-1);
        }
    }
    public static void main(String[] args){
        int k = myfinc(5);
        System.out.println(k);
    }
}
