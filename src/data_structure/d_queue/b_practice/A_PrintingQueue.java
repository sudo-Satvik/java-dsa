package data_structure.d_queue.b_practice;
import java.util.*;
// Printing all the elements of queue only using add(), remove(), peek(),size()
public class A_PrintingQueue {
    public static void printing(Queue<Integer> q){
        Queue<Integer> temp = new LinkedList<>();
        while (!q.isEmpty()){
            temp.add(q.poll());
        }
        while (!temp.isEmpty()){
            int val = temp.poll();
            System.out.print(val+", ");
            q.add(val);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(14);
        q.add(16);
        q.add(18);
        q.add(20);
        System.out.println("Expected: " + q);
        printing(q);
    }
}
