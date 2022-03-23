package homeworkNineFeb;
import java.util.*;

//linear search problem /////////////
public class Homework15feb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of testcases:");
        int t = sc.nextInt();
        while(1<=t){
            ArrayList<Integer> arr = new ArrayList<>();
            System.out.println("Enter the size of Array:");
            int n = sc.nextInt();
            System.out.println("Enter the K value :");
            int k = sc.nextInt();
            for(int i= 0;i<n ;i++){
                System.out.println("Enter "+(i+1)+ "value");
                arr.add(sc.nextInt());
            }
            System.out.println("arr size is : "+arr.size());
            System.out.println("the array elemets are "+ arr);
            System.out.println(binary(arr, k));

            t--;
        }
    }
//    -----------------------binary search  function----------------------
    public static long binary( ArrayList<Integer>arr,int k){
        int r = arr.size()-1;
        int l = 0;
        while (l<=r){
            int mid = (l+r)/2;
            if(arr.get(mid)==k){
                return 1;
            }
            else if(arr.get(mid)>k){
                r= mid-1;
            }
            else if(arr.get(mid)<k){
                l= mid+1;
            }
        }
        return  -1;
    }

}
