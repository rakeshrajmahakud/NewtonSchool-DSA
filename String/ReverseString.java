package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "rakeshraj";
        String nstr = "";
        char ch ;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr =ch+nstr;
        }
        System.out.println(nstr);
    }
}
