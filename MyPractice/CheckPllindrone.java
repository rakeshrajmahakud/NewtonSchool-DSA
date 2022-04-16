package MyPractice;

public class CheckPllindrone {

    public static void main(String[] args) {
        String s = "ababA";
        s= s.toLowerCase();
        System.out.println(s);
        int l= 0;
        int r = s.length()-1;
        while(l<r){
            if (s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }else{
                System.out.println("this is not pellindrome");
                return;
            }
        }
        System.out.println("ths is a pallindrome string");


    }
}
