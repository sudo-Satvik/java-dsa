package data_structure.stacks.questions;

import java.util.Arrays;
import java.util.Stack;

public class F_PreviousGreaterElement {
    public static int[] previousGreater(int[] arr){
        int[] res = new int[arr.length];
        int n = res.length;
        Stack<Integer> st = new Stack<>();
        res[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && arr[i] >= st.peek()){
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
        // -1 100 80 80 70 80 100
        System.out.println(Arrays.toString(previousGreater(arr)));
    }
}
