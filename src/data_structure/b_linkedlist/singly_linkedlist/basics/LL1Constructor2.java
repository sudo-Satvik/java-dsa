package data_structure.b_linkedlist.singly_linkedlist.basics;
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

    public Node removeLast(){
        // edge case 1 : for 0 element
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        // edge case 2 : for 1 element
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int data){
        Node preNode = new Node(data);
        if (length == 0) tail = preNode;
        else preNode.next = head;
        head = preNode;
        length++;
    }

    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        head = temp.next;
        temp.next = null;
        length--;
        if (length == 0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        // edge case
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
//    public boolean set(int index, int data){
//        // edge case
//        if (index <= 0 || index > length) return false;
//        Node temp = head;
//        for (int i = 1 ; i < index ; i++){
//            temp = temp.next;
//        }
//        temp.data = data;
//        return true;
//    }
//    or
    public boolean set(int index, int data){
        Node temp = get(index);
        if (temp != null){
            temp.data = data;
            return true;
        }
        return false;
    }
    public boolean insert(int index, int data){
        // Edge cases
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(data);
            return true;
        }
        if (index == length) {
            append(data);
            return true;
        }
        Node newData = new Node(data);
        Node temp = get(index - 1);
        newData.next = temp.next;
        temp.next = newData;
        length++;
        return true;
    }
    public Node remove(int index){
        // edge case
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length) return removeLast();
        Node temp = get(index - 1);
        temp.next = temp.next.next;
        length--;
        return temp;
    }
    public void reverse(){
        // reversing head and tail
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
