package data_structure.stacks.b_practice;

import java.util.Arrays;
import java.util.Stack;

public class F_PreviousGreaterElement {
    public static int[] previousGreaterElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        res[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        System.out.println("Ans: " + Arrays.toString(previousGreaterElement(arr)));
    }
}
