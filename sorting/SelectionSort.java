package sorting;
// apna college
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={5,6,15,9,8,6,3};
        for (int i = 0; i < arr.length-1; i++) {
            int smallest=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest]>arr[j]){
                    smallest =j;
                }
            }
            //swap
            int temp=arr[smallest];
            arr[smallest] = arr[i];
            arr[i]=temp;
        }
        //for printing array values
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
