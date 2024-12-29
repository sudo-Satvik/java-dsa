package data_structure.b_linkedlist.circular_linkedlist;

public class SinglyCL {
    public static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
        }
    }
    public static void printCL(Node head) {
        Node temp = head.next;
        System.out.print(head.data+" ");
        while (temp != head) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node removeHead (Node head) {
        Node prev = head;
        Node temp = head.next;
        while (temp != head) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        prev = prev.next;
        return prev;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;
        printCL(a);
        System.out.println(removeHead(a).data);
    }
}
