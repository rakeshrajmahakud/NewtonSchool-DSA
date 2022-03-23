package homeworkNineFeb;

import java.util.*;
public class MedianOfTwoSortedArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the size of first array");
        int m = sc.nextInt();
        // System.out.println("enter the size of second array");
        int n = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        // System.out.println("enter array a elements :");
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        // System.out.println("enter array b elements :");
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.printf("%.2f",Median(a,b));
    }
    public static double Median(int[] a, int[] b) {
        int m=a.length;
        int n=b.length;
        int i=0;   //pointer for first array
        int j=0;   //pointer for second array
        int[] merged=new int[m+n];
        int x=0;  //pointer for merged array

        while(i<m && j<n) {
            if(a[i]<b[j]) {
                merged[x++]=a[i++];
            }
            else {
                merged[x++]=b[j++];
            }

        }
        while(i<m) {
            merged[x++]=a[i++];
        }
        while(j<n) {
            merged[x++]=b[j++];
        }
        //Merged is ready

        int mid=(m+n)/2;
        double median;
        //even
        if((m+n)%2==0) {
            //indexes

            int prev=mid-1;
            median = Double.valueOf(merged[mid]+merged[prev])/2;
            System.out.println(median);
        }
        //odd
        else {
            median=merged[mid];
        }
        return median;
    }
}
