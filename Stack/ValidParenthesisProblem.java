//leetcode problem
//https://leetcode.com/problems/valid-parentheses/
/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
       An input string is valid if:
       1. Open brackets must be closed by the same type of brackets.
       2. Open brackets must be closed in the correct order.*/
package Stack;

import java.util.Stack;

public class ValidParenthesisProblem {
    public boolean isValid(String s) {
        Stack<Character> stack =  new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr== '(' || curr=='[' || curr=='{' ){
                stack.push(curr);
            }else{
                if (stack.isEmpty()) return false;
                char top = stack.peek();
                if ((top == '(' && curr == ')') || (top == '{' && curr == '}') || (top == '[' && curr == ']')) {
                    stack.pop();
                }else return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){

    }
}
