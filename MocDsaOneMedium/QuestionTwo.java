package MocDsaOneMedium;
import java.util.HashSet;
import java.util.Set;

/*Problem 2:
        You are given an unsorted array with both positive and negative elements.
        You have to find the smallest positive number missing from the array.
        Input:  {2, 3, 7, 6, 8, -1, -10, 15}
        Output: 1
        Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
        Output: 4
        Input: {1, 1, 0, -1, -2}
        Output: 2 */
public class QuestionTwo {
    public static void main(String[] args) {
        int[] arr ={ 2, 3, -7, 6, 8, 1, -10, 15 };
        int n = arr.length;
        System.out.println(number(arr,n));
    }
    public static int number(int[] arr, int n){
        int x = 1;
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (x<arr[i]){
                a.add(arr[i]);
            }else if (x==arr[i]){
                x= x+1;
                while(a.contains(x)){
                    a.remove(x);
                    x= x+1;
                }
            }

        }
        return x;
    }

}
