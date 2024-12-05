package data_structure.stacks.questions;

import java.util.Arrays;
import java.util.Stack;

public class G_StockSpan {
    public static int[] stockSpan(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if (st.isEmpty()) res[i] = i+1;
            else res[i] = i - st.peek();
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
//        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        // [1, 1, 1, 2, 1, 4, 6]
        int[] arr = {100, 80, 70, 60, 70, 80, 85};
        System.out.println(Arrays.toString(stockSpan(arr)));
    }
}
