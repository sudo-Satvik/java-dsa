package data_structure.linkedlist.basics;
// Implement the method to find out the length of the LL
public class C_LengthLL {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    private static int length(Node head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
        Node f = new Node(30);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(length(a));
    }
}
