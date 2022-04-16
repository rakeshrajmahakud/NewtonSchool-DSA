package MocDsaOneEasy;
import java.util.Arrays;
import Searching.BinarySearch;
//Question:  {4,5,7,8,3,4,4,5} Sort this array and fine most repeated elements.


public class SortAndFindMostRepeatedElement {
    public static void main(String[] args) {
        int[] arr = {4,5,7,7,7,7,8,3,4,4,5};
        Arrays.sort(arr);
        int max = 0;
        int count =0;
        int res = 0;
        for (int i= 1;i<arr.length;i++){
            if (arr[i]==arr[i-1]){
                count++;
            }else{
                if(count >max){
                    max = count;
                    res = arr[i-1];
                }
                count = 1;
            }
        }
        System.out.println("max occurance of k element is "+ max);
        System.out.println(" the most repeated element is "+ res);

    }

}
