package data_structure.linkedlist.singly_linkedlist.questions;

public class MiddleNode {
    public static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data = data;
        }
    }
    public static Node middleNode(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(13);
        Node c = new Node(14);
        Node d = new Node(15);
        Node e = new Node(16);
        Node f = new Node(17);
//        Node g = new Node(18);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
//        f.next = g;
        // 12 -> 13 -> 14 -> 15 -> 16 -> 17 -> 18

        System.out.println(middleNode(a).data);
    }
}
