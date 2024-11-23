package data_structure.linkedlist.questions;
// Split the list, one contains the odd values and other contains the even values
public class SplitOE {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static Node splitBruteForce(Node head){
        Node temp = head;
        Node even = new Node(-1);
        Node odd = new Node(-1);
        Node tempO = odd;
        Node tempE = even;
        while (temp != null){
            if (temp.data % 2 == 0){
                // Create a new node for even and link it
                tempE.next = new Node(temp.data);
                tempE = tempE.next;
            }else{
                tempO.next = new Node(temp.data);
                tempO = tempO.next;
            }
            temp = temp.next;
        }
        tempO.next = even.next;
        return odd.next;
    }
    public static Node optimisedSplit(Node head){
        if (head == null || head.next == null) return head;

        Node evenHead = null, oddHead = null;  // To track the start of even and odd lists
        Node evenTail = null, oddTail = null;  // To keep track of the current end of even and odd lists
        Node temp = head;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                // Even case
                if (evenHead == null) {
                    evenHead = evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = evenTail.next;
                }
            } else {
                // Odd case
                if (oddHead == null) {
                    oddHead = oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = oddTail.next;
                }
            }
            temp = temp.next;
        }

        // If we have at least one odd and one even node
        if (oddTail != null) {
            oddTail.next = evenHead;  // Link the end of the odd list to the start of the even list
        }
        if (evenTail != null) {
            evenTail.next = null;  // Terminate the even list
        }

        return oddHead != null ? oddHead : evenHead;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(1);
        Node e = new Node(2);
        Node f = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        Node ans = optimisedSplit(a);
        display(ans);
    }
}
