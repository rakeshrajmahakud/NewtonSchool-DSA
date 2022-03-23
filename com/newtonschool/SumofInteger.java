package com.newtonschool;
//this is sagar sir recursive problem
public class SumofInteger {
        public static int sum(int num) {
            if(num==1){
                return 1;
            }
            return num+sum(num-1);
        }

        public static void main( String[] args ) {
            int input = 5;
            int result = sum(input);
            System.out.println("Sum is " + result);
        }
}
