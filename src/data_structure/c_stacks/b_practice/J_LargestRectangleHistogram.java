package data_structure.c_stacks.b_practice;
import java.util.*;

/** @Question: Given an array of integer heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram
 * @Input1: heights = [2,1,5,6,2,3]
 * @Output1: 10
 * @Input2: heights = [2,4]
 * @Output2: 4
 * */

public class J_LargestRectangleHistogram {
    public static int largestRectangleHistogram(int[] arr) {
        int n = arr.length;
        Stack<Integer> st= new Stack<>();
        // Calculating the Next Smaller Element
        int[] nse = new int[n];
        nse[n - 1] = n;
        st.push(n - 1);
        for (int i = n - 2 ; i >= 0 ; i--) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        // Emptying the stack
        while (!st.isEmpty()) {
            st.pop();
        }
        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for (int i = 1 ; i < n ; i++) {
            while(st.size() > 0 && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.size() == 0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        // Finding the max area
        int max = -1;
        for (int i = 0 ; i < n ; i++) {
            int area = arr[i] * (nse[i] - pse[i] - 1);
            max = Math.max(area, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights1 = {2,1,5,6,2,3};
        int[] heights2 = {2, 4};
        System.out.println("The Max area: " + largestRectangleHistogram(heights1));
        System.out.println("The Max area: " + largestRectangleHistogram(heights2));
    }
}
