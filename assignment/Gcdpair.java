package assignment;
import java.io.*;
import java.util.*;
//GCD Pairs (Contest)
//Given an array Arr of N elements. Find the maximum value of GCD(Arr[i], Arr[j]) where i != j.

public class Gcdpair {
        public static void main (String[] args) {
            // Your code here
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            System.out.println(gcd(arr,n));
        }

        public static int gcd(int[] arr, int n)
        {
            int high=0;
            for(int i =0;i<n;i++)
            {
                high = Math.max(high, arr[i]);
            }
            int[] divisors =  new int[high+1];
            for(int i=0;i<n;i++)
            {
                for(int j =1; j <=Math.sqrt(arr[i]);j++)
                {
                    if(arr[i]%j==0)
                    {
                        divisors[j]++;

                        if(j!=arr[i]/j)
                        {
                            divisors[arr[i]/j]++;
                        }
                    }
                }
            }

            for(int i = high ; i>=1 ;i--)
            {
                if(divisors[i]>1)
                    return i;
            }
            return 1;

        }
}
