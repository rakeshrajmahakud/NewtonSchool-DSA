package homeworkNineFeb;

public class SearchMin {
    public static void main(String[] args){
        int[] arr = {10,15,7,75,38,45};
        minimum(arr);

        int k= 38;
        search(arr,k);
        frequency(arr,k);
        nestedloop();

    }
    // find the minimum element in the array.//
    public static void minimum(int[] arr){

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
            }

        }
        System.out.println("the minimum value element in an array is "+min);
    }
//    searching an element in an array using linear search //
    public static void search(int[] arr,int k){
        for (int i = 0; i < arr.length; i++) {
            if(k == arr[i]){
                System.out.println(k+" found on index " + i );
            }
        }
    }
//Count the frequency of an element in an array ?
    public static void frequency(int[] arr,int k){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(k == arr[i]){
                count +=1;
            }
        }
        System.out.println("total frequency of " + k +" in an array is = " + count );
    }
// sagar sir assigmmnet to check tome complixity  (date :feb 10 /2022)///////
    public static void nestedloop() {
        int n = 10;
        int sum = 0;
        double pie = 3.14;

        for (int var = 0; var < n; var = var + 3) {
            System.out.println("Pie: " + pie);
            for (int j = 0; j < n; j = j + 2) {
                sum++;
                System.out.println("Sum = " + sum);
            }
        }
    }
    //////////////////////////////////////////////


}
