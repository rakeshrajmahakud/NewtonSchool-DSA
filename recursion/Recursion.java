//package recursion;
//
//public class Recursion {
//    static void rec(int i){
//        if(i== 0){
//            return;
//        }
//        System.out.println(i);
//        rec(i-1);
//    }
    ////////////////////////////////////
////    fact of a number usinG recursion
//    static int factorial(int fact){
//        if(fact == 1) return 1;
//        return fact*factorial(fact-1);
//    }
    /////////////////////////////////
/////////////reverse an array//////////////////
//    public static void reverseArray(){
//        int[] arr = {5,5,4,2,8,52,48,52,41};
//        int i = 0;
//        int j = arr.length-1;
//        while(j>i){
//            int temp =arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;;
//        }
//    }
////////////// tower oh honoi concept///////////////////////////
//    public static void towerOfHonoi(int n,String s,String d,String h){
//        if(n<=0) return;
//        towerOfHonoi(n-1,s,h,d);
//        System.out.println("Disk "+n+" moved from "+s+" to "+d);
//        towerOfHonoi(n-1,h,d,s);
//    }

//    public static void main(String[] args) {
//////        rec(10);
//////        System.out.println(factorial(5));
//////        reverseArray();
//////        towerOfHonoi(2,"Source","Destination","Helper");
////    }
//}
