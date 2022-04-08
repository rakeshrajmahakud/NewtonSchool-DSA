package Stack;

import java.util.Stack;

public class StackPushingElementAtButtom {
    //recursive approch
    static void pushlast(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushlast(data,s);
        s.push(top);

    }

    static  void puushlastIttrative(int data,Stack<Integer> s){
        Stack<Integer> temp = new Stack<>();
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        while(!s.isEmpty()){
            temp.push(s.pop());
        }
        s.push(data);
        while (!temp.isEmpty()){
            s.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

//        pushlast(10,s);   //recursive approach call
        puushlastIttrative(10,s);    // iterative approach call

        ///pring the stack elements
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
