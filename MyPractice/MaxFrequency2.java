package MyPractice;

public class MaxFrequency2 {
//    binary binarySearch implement for search occurance
    static int binarySearch(int[] arr, int l,int r,int x){
        if (r<l) return -1;
        int mid = l+(r-l)/2;
//        if element is present at the middle itself
        if(arr[mid]== x) return mid;
        else if (arr[mid]>x) return binarySearch(arr,l,mid-1,x);
        return binarySearch(arr,mid+1,r,x);
    }

    // count elements
    static int countOcc(int[] arr,int n ,int x){
        int ind = binarySearch(arr,0,n-1,x);
        // if element is not present
        if(ind == -1) return 0;

//        if element is on leftside
        int count = 1;
        int left = ind-1;
        while(left >=0 && arr[left] == x){
            count++;
            left--;
        }
        //count elements onright side
        int right = ind+1;
        while(right<n && arr[right]==x){
            count++;
            right++;
        }
        return count;

    }




    //driver code
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 5, 7,7,7,8,9,9,11,12,13,14,15};
        int x = 7;
        int n =arr.length;
        System.out.println(countOcc(arr,n,x));
    }
}
