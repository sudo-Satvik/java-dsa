package data_structure.stacks.basics;

public class UsingLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static class Stack{
        private Node head = null;
        private int size = 0;

        public void push(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }

        public int pop(){
            if (head == null) return Integer.MIN_VALUE;
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }
        public int peek(){
            if (head == null) {
                System.out.println("The stack is empty!");
                return Integer.MIN_VALUE;
            }
            return head.data;
        }
        public void display(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println();
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            if (size == 0) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.display();
        st.pop();
        st.display();
        System.out.println("Is empty: "+st.isEmpty());
        System.out.println("Top value: "+st.peek());
        System.out.println("Size: "+st.size());
    }
}
