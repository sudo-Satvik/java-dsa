package data_structure.d_queue.b_practice;
import java.util.*;

public class D_FirstNegativeWindow {
    // Function to find the first negative integer in every window of size k
    static List<Integer> FirstNegativeInteger(int A[], int K) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int N = A.length;
        // Adding the negative values in the queue
        for (int i = 0; i < N; i++) {
            if (A[i] < 0) {
                q.add(i);
            }
        }

        // Traversing for the resultant list
        for (int i = 0; i < N - K + 1; i++) {
            if (!q.isEmpty() && q.peek() < i) q.remove();

            if (!q.isEmpty() && q.peek() <= i + K - 1) res.add(i, A[q.peek()]);
            else if (q.isEmpty()) res.add(i, 0);
            else res.add(i, 0);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        System.out.println("Original Arr: " + Arrays.toString(arr));
        System.out.println("Answer Arr: " + FirstNegativeInteger(arr, 2));

    }
}
