package MyPractice;

import java.util.Arrays;

public class ZigzagArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        Arrays.sort(arr);
        int i = 0;
        while (i<= arr.length-2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i=i+2;
        }
//        for (int k: arr) {
//            System.out.print(k+" ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}
