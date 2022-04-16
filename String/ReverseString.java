package String;

public class ReverseString {
    // Reverse a string approach one
    public static void Reverse(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "rakeshraj";
        String nstr = "";
        char ch ;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr =ch+nstr;
        }
        System.out.println(nstr);
        Reverse(str);
    }

}
