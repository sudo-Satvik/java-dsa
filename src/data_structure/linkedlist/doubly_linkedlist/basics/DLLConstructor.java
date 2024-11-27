package data_structure.linkedlist.doubly_linkedlist.basics;

public class DLLConstructor {

    class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public DLLConstructor(int data) {
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead() {
        System.out.println("Head: " + head.data);
    }
    public void getTail() {
        System.out.println("Tail: " + tail.data);
    }
    public void length() {
        System.out.println("Length: " + length);
    }


    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
}
