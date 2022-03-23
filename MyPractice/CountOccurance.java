package MyPractice;

import java.util.Arrays;

public class CountOccurance {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,5,7,9,11};
        int n = arr.length;
        int k = 4;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(k==arr[i]){
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
