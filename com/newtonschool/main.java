package com.newtonschool;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework25
class main {
    public static void main (String[] args) {
        // Your code here
    Scanner data = new Scanner(System.in);
    int input = data.nextInt();
    int m  = ((input + 8)/3)%5;
    System.out.print(m*5);
    }
    
    
}
