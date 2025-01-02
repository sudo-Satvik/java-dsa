package data_structure.d_queue.b_practice;

import java.util.*;

// Reversing the queue
public class B_ReverseQueue {
    public static void reverse(Queue q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push((Integer) q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        System.out.println("Original Queue: " + q);
        reverse(q);
        System.out.println("Reversed Queue: " + q);
    }
}
