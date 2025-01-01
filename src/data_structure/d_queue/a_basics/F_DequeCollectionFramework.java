package data_structure.d_queue.a_basics;
import java.util.*;

public class F_DequeCollectionFramework {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.add(12);
        System.out.println(dq);
        dq.addFirst(13);
        System.out.println(dq);
        dq.addLast(14);
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.add(13);
        dq.add(14);
        dq.add(15);
        dq.add(12);
        dq.add(17);
        System.out.println(dq);
    }
}
