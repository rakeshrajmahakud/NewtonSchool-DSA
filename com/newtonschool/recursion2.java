package com.newtonschool;

import java.util.Scanner;
class recursion2 {
    static int fact(int n){
        if(n == 1){
            return 1;
        }else{
         
           return n*fact(n-1);
        }
}
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            int k = fact(input);
            System.out.println(k);
    }


}
