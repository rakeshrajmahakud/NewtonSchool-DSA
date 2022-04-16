package MyPractice;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        // write your code herearr2
        int[]arr1={1, 3, 9};
        int[]arr2={8,5,2};
        merge(arr1,arr2);
    }
    static void merge (int[] arr1, int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[]ans=new int[n1+n2];
        int i=0,j=n2-1,k=0;
        while(i<n1 && j>0){
            if(arr1[i]<arr2[j]){
                ans[k++]=arr1[i++];
            }
            else{
                ans[k++]=arr2[j--];
            }

        }
        while(j>=0){
            ans[k++]=arr2[j--];
        }
        while(i<n1){
            ans[k++]=arr1[i++];
        }
        for(int l=0;l<ans.length;l++){
            System.out.print(ans[l]+" ");
        }
    }
}
