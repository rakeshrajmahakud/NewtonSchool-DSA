package sorting;
// apna college
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,12,18,12,24,2,8,9};
        for (int i = 1; i < arr.length; i++) {
            int curr =arr[i];
            int j = i-1;
            while (j>=0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
    }
}
