package data_structure.d_queue.a_basics;

public class C_LinkedListImplementation {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public static class Queue{
        private Node head = null;
        private Node tail = null;
        private int size = 0;
        void add(int x){
            Node temp = new Node(x);
            if (size == 0) {
                head = temp;
                tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        int remove() {
            if (size == 0) return -1;
            int removedElement = head.data;
            head = head.next;
            size--;
            return removedElement;
        }
        void display() {
            if (head == null) return;
            System.out.print("Head -> ");
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print("<- Tail");
            System.out.println();
        }
        int size() {
            return size;
        }
        int peek(){
            return head.data;
        }
        boolean isEmpty(){
            return size == 0;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(12);
        q.display();
        q.add(13);
        q.display();
        q.add(14);
        q.display();
        q.add(15);
        q.display();
        q.remove();
        q.display();
        System.out.println("is queue empty: " + q.isEmpty());
        System.out.println("peek: " + q.peek());
        System.out.println("size: " + q.size());
    }
}
