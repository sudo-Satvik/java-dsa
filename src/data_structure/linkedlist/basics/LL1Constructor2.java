package data_structure.linkedlist.basics;
// Creating BTS of LL

//Use while (temp != null) when you need to process every node, including the last node.
//Use while (temp.next != null) when you need to stop at the second-to-last node, typically when modifying or referencing the last node of the list.


public class LL1Constructor2 {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    LL1Constructor2(int data){
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
    }

    public void getLength(){
        System.out.println("Length: "+length);
    }

    public void getHead(){
        System.out.println("Head: "+head.data);
    }

    public void getTail(){
        System.out.println("Tail: "+tail.data);
    }

    public void append(int data){
        Node newNode = new Node(data);
        if (length == 0){
            head = newNode;
//            tail = newNode;           // ye to hona hi hona h bc
        }else{
            tail.next = newNode;
//            tail = newNode;         // ye to hona hi hona h bc
        }
        tail = newNode;               // isiliye idhar hi ho jaaye
        length++;
    }

    public void removeFromEnd() {
        if (head == null) return; // Case 1: Empty list
        if (head.next == null) {  // Case 2: Single-node list
            head = null;
            tail = null;
            return;
        }

        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            temp = temp.next;
            if (temp.next != null) pre = pre.next;
        }

        tail = pre;
        pre.next = null;
        length--;
    }

}
