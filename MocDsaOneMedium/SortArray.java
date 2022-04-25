package MocDsaOneMedium;
/*Problem 1:
        Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
        Example 1:
        Input:
        N = 5
        arr[]= {0 2 1 2 0}
        Output:
        0 0 1 2 2
     Explanation: 0s 1s and 2s are segregated into ascending order. */

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0};
        int n = arr.length;
        divide(arr,0,n-1);
        for (int i:arr) {
            System.out.print(i+" ");
        }

    }
    public static void conquer(int[] arr, int si,int mid, int ei){
        int[] merged = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while(idx1<=mid && idx2 <= ei){
            if (arr[idx1]<=arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++]=arr[idx2++];
            }
        }
        while (idx1<=mid){
            merged[x++] = arr[idx1++];
        }
        while (idx2<=ei){
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j=si ;i<merged.length; i++,j++) {
            arr[j] = merged[i];
        }
    }
    public static void divide(int[] arr,int si,int ei){
        if(si>=ei) return;
        int mid = (si+ei)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);

    }

}
