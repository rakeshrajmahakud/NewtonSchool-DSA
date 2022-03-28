package String;

public class FirstNonRepetatingCharacter {
    public static void main(String[] args) {
        String s  =  "newtonschool";
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c)== s.lastIndexOf(c)) {
                index = s.indexOf(c);
                break;
            }
        }
        System.out.println(index);
    }
}
