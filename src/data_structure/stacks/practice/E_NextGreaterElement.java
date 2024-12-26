package data_structure.stacks.practice;

import java.util.*;

/**
 * @Question: Next greater element
 * @Explanation: arr = [1, 4, 2, 3, 5, 2, 8, 1, 5] ==> [4, 5, 3, 5, 8, 8, -1, 5, -1]
 * @Explanation2: arr = [1, 3, 2, 1, 8, 6, 3, 4] ==> [3, 8, 8, 8, -1, -1, 4, -1]
 * */

public class E_NextGreaterElement {

    public static int[] nextGreaterBruteforce(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }

    public static int[] optimisedNextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        res[n - 1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        System.out.println("Next Greater by bruteforce -> " + Arrays.toString(nextGreaterBruteforce(arr)));
        System.out.println("Next Greater by optimised  -> " + Arrays.toString(optimisedNextGreaterElement(arr)));
    }
}
