package Stack;

import java.util.Stack;

public class NextLargestElement {
    public static int[] nextGreaterElement(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] arr1 = new int[arr.length];
        int n = arr.length;
        for (int i = n-1; i >=0; i--) {
            while(!s.isEmpty() && s.peek()<= arr[i]) s.pop();
            if (s.isEmpty()){
                arr1[i] = -1;
            }else{
                arr1[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,9,1,8,4,11,2,3};
        int[] ans = nextGreaterElement(arr);
        for (int l:ans) {
            System.out.print(l+" ");
        }
    }
}
