// by apna college
package LinkedList;
public class LL {
    Node head;
    private  int size;
    LL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        //constructor//
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }

    }
    // add first //

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }else{
            newNode.next = head;
            head = newNode;

        }
    }
    //addlast operation //
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }else{
            Node current = head;
            while(current.next != null){
               current = current.next;
            }
            current.next = newNode;
        }
    }
    //delete first//
    public void deleteFirst(){
        if (head == null){
            System.out.print("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    //delete last //
    public void deleteLast(){
        if (head == null){
            System.out.print("the list is empty");
            return;
        }
        size--;
        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }

    // print function //
    public void printList(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addLast("d");
        list.printList();
        list.deleteFirst();
        list.printList();
        System.out.println(list.getSize());


    }

}
