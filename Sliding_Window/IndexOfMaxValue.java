package Sliding_Window;

public class IndexOfMaxValue {
    public static void main(String[] args) {
        int[] arr = {5,7,9,28,11,12,20};
        int i = 0;
        int j = 0;
        int k = 3;
        int sum = 0;
        int max = 0;
        int start = 0;
        int end  = 0;
        while(j<arr.length){
            sum = sum+arr[j];
            if ((j-i+1)<k){
                j++;
            }
            else if ((j-i+1)==k){
                if (sum>max){
                    max = sum;
                    start = i;
                    end = j;

                }
                sum = sum - arr[i];
                j++;
                i++;
            }
        }
        System.out.println(max);
        System.out.println("max value present in betwenn "+ start+" and "+ end);
    }
}
