package pattern;
//* * * * * *
//  * * * * *
//    * * * *
//      * * *
//        * *
//          *
public class Pattern3 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j<=i-1; j++) {
                System.out.print("  ");
            }
            for (int k = n; k >=i ; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
