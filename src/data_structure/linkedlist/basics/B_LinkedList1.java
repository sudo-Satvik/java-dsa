package data_structure.linkedlist.basics;

public class B_LinkedList1 {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(32);
        Node c = new Node(43);
        Node d = new Node(44);
        Node e = new Node(10);
        a.next = b; // 12 -> 32
        b.next = c; // 12 -> 32 -> 43
        c.next = d; // 12 -> 32 -> 43 -> 44
        d.next = e; // 12 -> 32 -> 43 -> 44 -> 10
        System.out.println(a.data);                         // Print a
        System.out.println(a.next.data);                    // Print b
        System.out.println(a.next.next.data);               // Print c
        System.out.println(a.next.next.next.data);          // Print d
        System.out.println(a.next.next.next.next.data);     // Print e
    }
}
