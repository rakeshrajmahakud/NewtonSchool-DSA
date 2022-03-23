package com.newtonschool;

import java.util.Scanner;

public class Myfunc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String z = sc.next();
        calculator(x,y,z);

    }
    public static void calculator(int x ,int y ,String z){
        switch (z) {
            case "+":{
                System.out.println(add(x,y));
                break;
            }
            case "-":{
                System.out.println(sub(x,y));
                break;
            }
            case "table":{
                table(x,y);
                break;
            }
            default:{
                System.out.println("invalid input");
            }

        }
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static void table(int a,int b){
        for(int i=b;i<10;i++){
            System.out.println(a +" * "+i+" = "+(a * i));
        }
    }
}
