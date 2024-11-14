package data_structure.linkedlist.questions;

public class Intersection {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static Node intersectionFinding(Node headA, Node headB){
        // boundary check
        if (headA == null || headB == null)
            return null;

        Node a = headA;
        Node b = headB;

        // if a & b have different len, then we will stop the loop after second iteration
        while (a != b) {
            // for the end of first iteration, we just reset the pointer to the head of
            // another linkedlist
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }

    private static int lengthFinding(Node head) {
        Node temp = head;
        int length = 0;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public static void main(String[] args) {
        // Create the intersected part (shared tail)
        Node common = new Node(8);
        common.next = new Node(10);
        common.next.next = new Node(12);

        // Create the first linked list: 3 -> 6 -> 9 -> 8 -> 10 -> 12
        Node headA = new Node(3);
        headA.next = new Node(6);
        headA.next.next = new Node(9);
        headA.next.next.next = common; // intersect at node 8

        // Create the second linked list: 5 -> 8 -> 10 -> 12
        Node headB = new Node(5);
        headB.next = common; // intersect at node 8

        // Print both lists to show intersection
        System.out.println("List A:");
        printList(headA);
        System.out.println("List B:");
        printList(headB);

        System.out.println(intersectionFinding(headA, headB).data);
    }

    // Helper method to print linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}