package MyPractice;

//Most frequent element in an array
//Given an array, find the most frequent element in it. If there are multiple elements that appear a maximum number of times, print any one of them.
public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 5,5,5,5,5,5, 7, 9, 20, 25, 25, 25};
//        int k = 7;
//        int searchindx = binary(arr,k);
//        System.out.println(searchindx);
//        int[] sorted = sort(arr);
//        for (int i = 0; i < sorted.length; i++) {
//           // System.out.print(sorted[i]+" ");
//        }
        int count = 1;
        int max = 1;
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
//            System.out.println("i value is = " + i + " index value =" + arr[i] + " i-1 value is = " + (i - 1) + " arr[i-1] value = " + arr[i - 1]);
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    res = arr[i - 1];
                }
                count = 1;
            }
        }
        if (count > max) {
            max = count;
            res = arr[arr.length - 1];
        }
        System.out.println("max count = " + max);
        System.out.println("the max occurance number is =  "+res);
    }
}
//    public  static int[] sort ( int arr[]){
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-i-1; j++) {
//                if (arr[j]>arr[j+1]){
//                    //swap
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        return arr;
//    }
//   //binary search implementation
//    public static int binary(int[] arr,int k){
//        int l = 0,r =arr.length-1;
//        while(l<=r){
//            int mid = (l+r)/2;
//            if (arr[mid]==k){
//                return mid;
//            }else if(arr[mid]>k){
//                r= mid-1;
//            }else if(arr[mid]<k){
//                l=mid+1;
//            }
//        }
//        return - 1;   // in case of there is no element found
//    }
