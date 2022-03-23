package Searching;

public class BinarySearch{
////////    binary search by using whileloop //////////////
    public static int binary(int[] arr,int k){
        int l =0, r=arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                r= mid-1;
            }
            else if(arr[mid]<k){
                l= mid+1;
            }
        }
        return -1;
    }
/////binary search by using recursion ///////////
//    public static int bianryrec(int[] arr,int k,int l,int r){
//        if(l>r) return -1;
//        int mid = (l+r)/2;
//        System.out.println("the mid value is "+ mid);
//        if(arr[mid] == k) return mid;
//        else if(arr[mid]<k) return bianryrec(arr,k,mid+1,r);
//        else return bianryrec(arr,k,l,mid-1);
//    }

    public static void main(String[] args) {
        int[] arr = {5,7,9,11,13,14,18,19,22,25,27,35};
        int k = 14;
        System.out.println(binary(arr, k));    // binary search by recursion

//        binary search by using recursion////
//        int l = 0;
//        int r = arr.length-1;
//        System.out.println(bianryrec(arr, k, l, r));
    }
}
