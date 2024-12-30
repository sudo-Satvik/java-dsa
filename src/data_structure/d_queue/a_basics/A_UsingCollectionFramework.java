package data_structure.d_queue.a_basics;

import java.util.*;

public class A_UsingCollectionFramework {
    public static void main(String[] args) {
//        Queue<Integer> q = new ArrayDeque<>();
        // or
        Queue<Integer> q = new LinkedList<>();
        System.out.println("Stack is empty?\n"+q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        // Printing the first element/accessible element
        System.out.println(q.element());
        // or
        System.out.println(q.peek());

        System.out.println("Size: " + q.size());

        System.out.println("Stack is empty?\n"+q.isEmpty());
    }
}
