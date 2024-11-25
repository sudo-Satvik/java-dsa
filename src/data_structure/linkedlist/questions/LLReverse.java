package data_structure.linkedlist.questions;

public class LLReverse {
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
        }
    }
//    public static void display(Node head){
//        while (head != null){
//            System.out.print(head.data+" -> ");
//            head = head.next;
//        }
//        System.out.print("null\n");
//    }
    public static void recursionDisplay(Node head){
        if (head == null) {
            System.out.print("null\n");
            return;
        }
        System.out.print(head.data+" -> ");
        recursionDisplay(head.next);
    }
    public static void reverseDisplay(Node head){
        if (head == null) return;
        reverseDisplay(head.next);
        System.out.print(head.data+" -> ");
    }

    public static Node reverse (Node head){
        // Base case
        if (head.next == null) return head;
        Node newHead = reverse(head.next);
        // Interchanging Nodes (work)
        head.next.next = head;
        // Pointing to null (head)
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;         // 3 -> 5
        b.next = c;         // 3 -> 5 -> 1
        c.next = d;         // 3 -> 5 -> 1 -> 2
        d.next = e;         // 3 -> 5 -> 1 -> 2 -> 4
        e.next = null;      // 3 -> 5 -> 1 -> 2 -> 4 -> null

        recursionDisplay(a);
//        reverseDisplay(a);

        Node revLL = reverse(a);
        recursionDisplay(revLL);

        System.out.println(revLL.next.data);
    }
}
