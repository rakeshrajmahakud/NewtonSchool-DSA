package Queue;

import java.util.ArrayList;

class QueueClass{
    private ArrayList<Integer> data;
    private int size;
    private int front;

    //constructor
    public QueueClass(){
        this.data = new ArrayList<>();
        this.size= 0;
        this.front=0;
    }
    //add data in queue (method)
    public void add(int val){
        data.add(val);
        this.size++;
    }
    public int remove(){
        if (this.size==0) return -1;
        int ans = this.data.get(this.front);
        this.front++;
        this.size--;
        return ans;
    }
    public int peek(){
        if (this.size==0) return -1;
        return data.get(this.front);
    }
    public int size() {
        return this.size;
    }

}

//main function
public class Queue {
    public static void main(String[] args) {
        QueueClass queue = new QueueClass();
        System.out.println(queue.peek());
    }
}
