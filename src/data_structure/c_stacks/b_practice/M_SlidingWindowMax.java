package data_structure.c_stacks.b_practice;
import java.util.*;

// https://leetcode.com/problems/sliding-window-maximum/

public class M_SlidingWindowMax {
    // O(n*k) time complexity
    public static int[] maxSlidingWindowBruteforce(int[] nums, int k) {
        int n = nums.length;
        //  n - (k - 1)
        int[] ans = new int[n - k + 1];
        int idx = 0;
        for(int i = 0 ; i < n - k + 1 ; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = i ; j < i + k ; j++) {
                max = Math.max(max, nums[j]);
            }
            ans[idx++] = max;
        }
        return ans;
    }
    // O(n)
    public static int[] maxSlidingWindowOptimised(int[] nums, int k) {
        int n = nums.length;
        int idx = 0;
        int[] ans = new int[n - k + 1];
        Stack<Integer> st = new Stack<>();
        // Finding the next greater element
        int[] nge = new int[n];
        nge[n - 1] = n;
        st.push(n - 1);
        for (int i = n - 2 ; i >= 0 ; i--) {
            while(!st.isEmpty() && nums[st.peek()] < nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) nge[i] = n;
            else nge[i] = st.peek();
            st.push(i);
        }
        int j = 0;
        for (int i = 0 ; i < n - k + 1 ; i++) {
            if(j >= i+k) j = i;
            int max = nums[j];
            while(j < i+k){
                max = nums[j];
                j = nge[j];
            }
            ans[idx++] = max;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] testCase1 = {1,3,-1,-3,5,3,6,7};
        System.out.println("Bruteforce Ans testcase1: " + Arrays.toString(maxSlidingWindowBruteforce(testCase1, 3)));
        System.out.println("Optimised Ans testcase1: " + Arrays.toString(maxSlidingWindowOptimised(testCase1, 3)));
        int[] testCase2 = {1};
        System.out.println("Bruteforce Ans testcase1: " + Arrays.toString(maxSlidingWindowBruteforce(testCase2, 1)));
        System.out.println("Optimised Ans testcase1: " + Arrays.toString(maxSlidingWindowOptimised(testCase2, 1)));
    }
}
