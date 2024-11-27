package data_structure.linkedlist.doubly_linkedlist.basics;

public class Experiment {
    public static class Node {
        int data;
        Node prev;
        Node next;
        Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
            System.out.print(data + " ");
        }

    }

    public static void main(String[] args) {
        Node b = null;
        Node a = new Node(12, null, b);
        b = new Node(13, b, null);
    }
}
