package data_structure.c_stacks.a_basics;

/*Implementation of Stack using the LinkedList*/

public class J_LinkedListImplementation {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class Stack{
        private Node head = null;
        private int size = 0;

        void push(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }

        int peek() {
            if (head == null) return Integer.MIN_VALUE;
            return head.data;
        }

        int pop() {
            if (head == null) return Integer.MIN_VALUE;
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }

        int size(){
            return size;
        }

        void displayRecursion(Node h){
            if (h == null) return;
            displayRecursion(h.next);
            System.out.print(h.data + " ");
        }

        void display(){
            displayRecursion(head);
            System.out.println();
        }

        void displayRev() {
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            if (size == 0) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("The Stack is Empty: " + st.isEmpty());
        st.push(12);
        st.display();
        st.push(13);
        st.display();
        st.push(14);
        st.display();
        st.push(15);
        st.display();
        st.push(16);
        st.display();
        st.push(17);
        st.display();
        System.out.println("Peek element: " + st.peek());
        System.out.println("The Stack is Empty: " + st.isEmpty());
        System.out.println("Size of the stacK: " + st.size());
    }
}
