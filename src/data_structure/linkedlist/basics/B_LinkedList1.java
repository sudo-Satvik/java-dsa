package data_structure.linkedlist.basics;
// 01:09:55
public class B_LinkedList1 {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    // Used to help to prevent the changes in original LL
    private static void display(Node head){
        while(head != null){
            System.out.print(head.data+" -> ");
            head = head.next;
        }
    }
    // Printing using recursively
    private static void displayUsingRecursively(Node head){
        if (head == null){
            return;
        }
        System.out.print(head.data+" -> ");
        displayUsingRecursively(head.next);
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
//        System.out.println(a.data);                         // Print a
//        System.out.println(a.next.data);                    // Print b
//        System.out.println(a.next.next.data);               // Print c
//        System.out.println(a.next.next.next.data);          // Print d
//        System.out.println(a.next.next.next.next.data);     // Print e

//        If LL size is defined
//        Node temp = a;
//        for (int i = 1; i <= 5; i++) {
//            System.out.print(temp.data+" -> ");
//            temp = temp.next;
//        }

//        If LL size isn't defined
//        while (a != null){
//            System.out.print(a.data + " -> ");
//            a = a.next;
//        }
//        display(a);
        displayUsingRecursively(a);
    }
}
