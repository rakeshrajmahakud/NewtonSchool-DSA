package com.newtonschool;

import java.util.Scanner;
public class hello{
   
    public static void main(String args[]){
    Scanner x = new Scanner(System.in);
    int y = x.nextInt();
        switch (y) {
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("feb");
            break;
            case 3: System.out.println("march");
            break;
            case 4: System.out.println("april");
            break;
            case 5: System.out.println("may");
            break;
            default:System.out.println("Provide valid input");
        }
    }
}