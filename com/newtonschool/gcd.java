package com.newtonschool;

public class gcd {
    public static void main(String[] args) {
        int x = 12,y = 8;
        while(x!=y){
            if(x>y){
                x = x-y;
            }else{
                y =y-x;
            }
        }
        System.out.println(y);
    }
}
