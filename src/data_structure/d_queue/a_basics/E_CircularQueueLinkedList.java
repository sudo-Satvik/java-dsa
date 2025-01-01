package data_structure.d_queue.a_basics;

public class E_CircularQueueLinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static class Queue {
        private Node head = null;
        private Node tail = null;
        private int size = 0;

        public void add(int x){
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            } else{
                tail.next = temp;
                tail = temp;
                tail.next = head;
            }
            size++;
        }

        public int remove() throws Exception{
            if (size == 0) throw new Exception("Queue is Empty, can't execute remove method!");
            int val = head.data;
            if (size == 1) head = tail = null;
            else {
                head = head.next;
                tail.next = head;
            }
            return val;
        }

        public int peek() {
            return head.data;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void display() throws Exception {
            if (size == 0) throw new Exception("Stack is empty! Can't print the data!");
            Node temp = head;
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println("Size: " + q.size());
        System.out.println("Peek: " + q.peek());
    }
}
