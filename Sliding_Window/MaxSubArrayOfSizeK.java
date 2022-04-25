package Sliding_Window;

public class MaxSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,11,2,5,18,4,22,5,8};
        int k =3;  // winddow size
        // solution part
        int i =0;    //start
        int j =0;    // end
        int n = arr.length;
        int sum = 0;
        int mx = 0;
        while(j<n){
            sum = sum + arr[j];
            if ((j-i+1)<k) {
                j++;
            }
            else if ((j-i+1)==k){
                mx = Math.max(mx,sum);
                sum = sum-arr[i];
                i++;
                j++;
            }
        }
        System.out.println(mx);

    }
}
