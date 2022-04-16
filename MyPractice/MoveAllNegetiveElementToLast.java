package MyPractice;
/*Move all negative elements to end in order with extra space allowed
----------------------------------------------------------------------
 Given an unsorted array of both negative and positive integer.
 The task is place all negative element at the end of array without
 changing the order of positive element and negative element.*/
//------------------------------------------------------------------------
public class MoveAllNegetiveElementToLast {
    public static void main(String[] args) {
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = arr.length;
        approachOne(arr,n);
        System.out.println();
        approachTwo(arr,n);
        System.out.println();
        approachThree(arr,0,n-1);
    }

    //approach one by temp arr and extra space ...complexity O(n).
    //without changing order
    static void approachOne(int[] arr,int n){
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i <n ; i++) {
            if (arr[i] >=0) temp[j++] = arr[i];
        }
        if (j==n || j == 0) {
            System.out.print("already arranged");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]<0) temp[j++] = arr[i];
        }

        for (int i:temp) {
            System.out.print(i + " ");
        }
    }
    //approach 2 by using in place technique and swapping technique
    //note order is not important here
    static void approachTwo(int[] arr, int n){
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>=0) {
                if (i!=j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
    //approach 3 : two pointer and binary search approach-----
//    time complexity O(n)
    public static void approachThree(int[] arr,int left,int right){

        while (left<=right){
            if (arr[left]<0 && arr[right]<0){
                left++;
            }else if (arr[left]>= 0 && arr[right]>=0) {
                left++;
                right--;
            }
            else {
                right--;
            }
        }
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }



}
