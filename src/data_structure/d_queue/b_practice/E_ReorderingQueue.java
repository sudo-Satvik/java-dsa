package data_structure.d_queue.b_practice;
import java.util.*;

/** @Task: Consider you have given a even number of queue, You have reorder that like this
 * @Example: queue = 1, 2, 3, 4, 5, 6, 7, 8
 * @Output:  queue = 1, 5, 2, 6, 3, 7, 4, 8
 * */
public class E_ReorderingQueue {
    public static void reorder(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int len = q.size();

        // Half of the element is being stored in the stack
        while (q.size() > len/2) {
            st.push(q.remove());
        }

        // Reversing the stack
        Stack<Integer> temp = new Stack<>();
        while (st.size() > 0) {
            temp.push(st.pop());
        }

        while (temp.size() > 0) {
            q.add(temp.pop());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(11);
        queue.add(22);
        queue.add(33);
        queue.add(44);
        queue.add(55);
        queue.add(66);
        queue.add(77);
        queue.add(88);
        System.out.println("Original Queue: " + queue);
        reorder(queue);
        System.out.println("Final Answer: " + queue);
    }
}
