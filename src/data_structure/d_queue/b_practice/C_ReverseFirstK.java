package data_structure.d_queue.b_practice;
import java.util.*;

// Reverse first k elements of a queue
public class C_ReverseFirstK {
    public static void reverseByK(Queue q, int k){
        Stack<Integer> st = new Stack<>();
        // Removing the queue till k and then storing it to the stack st
        for (int i = 1 ; i <= k ; i++) {
            st.push((Integer) q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        for (int i = 1 ; i <= q.size() - k ; i++) {
            q.add(q.remove());
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
        System.out.println("Original: " + q);
        reverseByK(q, 5);
        System.out.println("Reversed by 5th: " + q);
    }
}
