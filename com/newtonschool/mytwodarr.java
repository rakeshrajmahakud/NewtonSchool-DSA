package com.newtonschool;

public class mytwodarr {
        public static void main(String[] arge){
            int ar[][] = new int[3][3];
              int sum1 = 0;
              int sum2 = 0;
              int sum3 = 0;
            for(int i=0; i<3;i++){
                for (int j=0;j<3;j++){
                    ar[i][j] = j;
                    System.out.print(ar[i][j]+" ");
                }
                System.out.println();  
            }
            

            
            // System.out.println(sum);
        }
    
}
