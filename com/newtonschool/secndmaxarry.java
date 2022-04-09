package com.newtonschool;

public class secndmaxarry {
    //find the second maximum element and array
    public static void main(String[] arge){

        int ar[] = new int[3];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] =3;
        int max = 0;
        for(int i=1; i<ar.length;i++){
            if(max<ar[i]){
                max = ar[i];
            }
        }
        int secmax = 0;
        for(int i= 0;i<ar.length;i++){
            if(secmax <ar[i] && ar[i] != max ){
                secmax = ar[i];
            }
        }
        
        System.out.println(secmax);
    }
}
