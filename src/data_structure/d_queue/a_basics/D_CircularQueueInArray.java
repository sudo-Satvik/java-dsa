package data_structure.d_queue.a_basics;

import java.util.Arrays;

public class D_CircularQueueInArray {
    public static class Queue{
        private int[] arr = new int[10];
        private int size = 0;
        private int f = -1, r = -1;

        public void add(int x) throws Exception {
            if (size == 0) {
                f = 0;
                r = 0;
                arr[0] = x;
            } else if (size == arr.length) {
                throw new Exception("Queue is full!");
            } else if (r < arr.length - 1) {
                arr[++r] = x;
            } else if (r == arr.length - 1) {
                r = 0;
                arr[0] = x;
            }
            size++;
        }

        public int remove() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is empty!");
            } else {
                int val = arr[f];
                if (f == arr.length - 1) f = 0;
                else f++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty!");
            }
            return arr[f];
        }
        public boolean isEmpty(){
            return size == 0;
        }

        public int getSize(){
            return size;
        }

        public void display() throws Exception{
            if (size == 0) throw new Exception("Queue is Empty!");
            else if (f <= r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else if (f > r) {
                for (int i = f ; i < arr.length ; i++) {
                    System.out.print(arr[i] +" ");
                }
                for (int i = 0 ; i <= r ; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);
        q.add(21);
        q.remove();
        q.add(22);
        q.remove();
        q.add(23);
        q.display();
        System.out.println(Arrays.toString(q.arr));     // array printing [for testing purpose]
    }
}