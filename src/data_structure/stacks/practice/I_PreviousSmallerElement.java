package data_structure.stacks.practice;

import java.util.Arrays;
import java.util.Stack;

public class I_PreviousSmallerElement {
    public static int[] previousSmallerElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        res[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Answer Array: " + Arrays.toString(previousSmallerElement(arr)));
    }
}
