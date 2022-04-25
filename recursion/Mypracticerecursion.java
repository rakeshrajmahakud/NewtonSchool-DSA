package recursion;

public class Mypracticerecursion {
    public static void main(String[] args) {
        rec(10);

    }
    public  static void rec(int n){
        System.out.println(" value of n is :"+n);
        if(n<=0) return ;
        System.out.println(n);
        rec(n-2);
        System.out.println("after");
        rec(n-4);
    }
}
