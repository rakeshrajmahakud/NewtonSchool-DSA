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
    public void reverse(){
        if (head == null || head.next ==null) return;
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void FindAndDelete(){
        Node curr = head;
        if (curr == null ) {
            System.out.println("the list is empty");
            return;
        }
        if (curr.next == null){
            head = null;
            return;
        }
        while(curr.next != null){
            if (curr.next.next == null){
                curr.next = null;
            }
            curr = curr.next;
            return;

        }
    }
    //delete nth node from last(count start form last because delete element form last)
    public  Node RemoveNthFromEnd(int n){
        if (head == null) return null;
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if (n == size){
            return head.next;
        }
        int search = size-n;
        Node prev = head;
        int i = 1;
        while(i<search){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    // check the link list is a looping list or not
    void hasCycle(){
        if (head == null) {
            System.out.print("Empty List");
        return;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                System.out.println("it is a looping lined list");
            }
        }
        System.out.println("it is not a looping lined list");
    }
//    -----------------------------------------------------check the list is pallindrome or not-------------


    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
//        list.addLast("d");
//        list.printList();
//        list.deleteFirst();
//        list.printList();
//        System.out.println(list.getSize());
//
//        list.reverse();
//        list.printList();
//        list.RemoveNthFromEnd(1);
//        list.printList();
//        list.hasCycle();



    }

}
