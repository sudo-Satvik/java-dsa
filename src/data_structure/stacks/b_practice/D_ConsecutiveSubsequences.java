package data_structure.stacks.b_practice;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Quest: Given a sequence of numbers. Remove all the consecutive consequences of length greater than or equal to 2 that contains
 *         the same element.
 *
 * @Expected: arr = [1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2];    ==> [1, 3, 5, 2]
 * @Expected: arr = [1, 2, 2, 3, 4, 5, 5, 5, 5, 6, 6, 7];    ==> [1, 3, 4, 7]
 * */

public class D_ConsecutiveSubsequences {
    public static int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) st.push(arr[i]);
            else if (st.peek() == arr[i]) {
                if (i == arr.length - 1 || arr[i] != arr[i + 1]) st.pop();
            }
        }
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        int[] arr2 = {1, 2, 2, 3, 4, 5, 5, 5, 5, 6, 6, 7};

        System.out.println("Ans: "+ Arrays.toString(solution(arr1)));
    }
}
