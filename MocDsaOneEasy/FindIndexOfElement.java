package MocDsaOneEasy;
//Question :   {1,2,5,7,9,20,25} Find index of element 20 using binary search.


public class FindIndexOfElement {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,9,20,25};
        int l = 0;
        int r = arr.length;
        int k = 20;
        System.out.println("index of k is " + binary(arr,l,k,r));
    }
    public static int binary(int[] arr,int l ,int k,int r){
        int m = l+(r-l)/2;
        if (l>=r) return -1;
        else if(k == arr[m]) return m;
        else if (k<arr[m]) return binary(arr,l,k,r=m-1);
        return binary(arr,l = m+1,k,r);
    }
}
