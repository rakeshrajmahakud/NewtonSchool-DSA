package Queue;

import java.util.ArrayDeque;

//by code with harry (array deque)
public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(15);
//        deque.addFirst(20);
        System.out.println(deque);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);
    }
}
