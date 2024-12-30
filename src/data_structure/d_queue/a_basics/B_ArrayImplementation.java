package data_structure.d_queue.a_basics;

public class B_ArrayImplementation {
    public static class Queue{
        // In array, front se cheeze nikalti hai, rear se cheeze dalti hai
        private int f = -1;
        private int r = -1;
        private int size = 0;
        private int[] arr = new int[100];

        public void add(int value){
            if (r == arr.length - 1) {
                System.out.println("Queue is full!");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = value;
            }
            else {
                arr[r + 1] = value;
                r++;
            }
            size++;
        }

        public int remove(){
            if (size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }
            f++;
            size--;
            return arr[f - 1];
        }
        public int peek(){
            if (size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[f];
        }
        public int size() {
            return size;
        }
        public boolean isEmpty(){
            return size == 0;
        }
        public void display(){
            if (size == 0) return;
            // Since range of the queue lies between f and r
            for (int i = f ; i <= r ; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.display();
        q.remove();
//        System.out.println("this is what removed: " + q.remove());
        q.display();
        System.out.println("Front element: " + q.peek());
        System.out.println("Size: " + q.size());
    }
}
