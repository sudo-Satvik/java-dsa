package data_structure.stacks.b_practice;
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

    public static void main(String[] args) {
        int[] testCase1 = {1,3,-1,-3,5,3,6,7};
        System.out.println("Bruteforce Ans testcase1: " + Arrays.toString(maxSlidingWindowBruteforce(testCase1, 3)));
        int[] testCase2 = {1};
        System.out.println("Bruteforce Ans testcase1: " + Arrays.toString(maxSlidingWindowBruteforce(testCase2, 1)));
    }
}
