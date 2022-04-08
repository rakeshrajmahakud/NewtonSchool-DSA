package Stack;
//by apna college
//stack by using linkedlist
public class StackImplement {
    static class Node{
        int data;
        Node next;
    public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public void add(int data){
            Node newnode = new Node(data);
            if (isEmpty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }
        public static int pop(){
            if (isEmpty()) return -1;
            int top = head.data;
            head = head.next;
            return top;
        }
        public int peek(){
            if (isEmpty()) return -1;
            return head.data;

        }
    }

    public static void main(String[] args) {
        Stack tt = new Stack();
        tt.add(5);
        System.out.println(tt.pop());
        System.out.println(tt.isEmpty());
        tt.add(25);
        tt.add(28);
        tt.add(26);
        tt.add(33);
        tt.add(1);
        tt.add(5);
        tt.add(9);
        System.out.println(tt.peek());

        //itrate over stack
        while (!tt.isEmpty()){
            System.out.println(tt.peek());
            tt.pop();
        }

    }

}
