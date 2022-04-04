package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{[(a+b)-(c-d)]}";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                if ((stack.peek() == '{' && s.charAt(i) == '}' ) || (stack.peek() == '[' && s.charAt(i) == ']' ) || (stack.peek() == '(' && s.charAt(i) == ')' )) {
                    stack.pop();
                }
            } else {
                continue;
            }
        }
        if (stack.isEmpty()){
            System.out.println("the stack is balanced");
        }else{
            System.out.println("the stack is not balanced");
        }
    }

}
