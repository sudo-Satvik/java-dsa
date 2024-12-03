package data_structure.linkedlist.singly_linkedlist.questions;

public class FromEnd {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static Node nthNodeFromEnd(Node head, int index){
//        int size = 0;
//        Node temp = head;
//        while (temp != null){
//            size++;
//            temp = temp.next;
//        }
//        temp = head;
//        int m = size - index + 1;
//        for (int i = 1; i < m; i++) {
//            temp = temp.next;
//        }
//        return temp;

        // Only in one traversal
        Node slow  = head;
        Node fast = head;
        for (int i = 1; i <= index ; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }
        while (fast != null){
            fast = fast.next;
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
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        Node ans = nthNodeFromEnd(a, 3);
        System.out.println(ans.data);
    }
}
