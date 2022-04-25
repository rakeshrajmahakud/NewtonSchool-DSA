//gfg question link;
//https://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/
package MyPractice;
import java.util.Arrays;

public class ZigZagArraySecondApproach {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (flag){
                if (arr[i]>arr[i+1]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            else{
                if (arr[i]<arr[i+1]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag = !flag;
        }

        System.out.println(Arrays.toString(arr));
    }
}
