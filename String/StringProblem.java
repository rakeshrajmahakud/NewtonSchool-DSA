package String;
import java.util.*;
public class StringProblem {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        String[]arr=new String[5];


        for(int i=0;i<5;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<4;i++){
            for(int j=i+1;j<5;j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        for(int i=0;i<5;i++){

            System.out.print(arr[i]+" ");
        }
    }
}
