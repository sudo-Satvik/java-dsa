package data_structure.e_hashmap.b_questions;

import java.util.HashMap;

public class E_LargestSubarraySum0 {
    public static int zeroSumLargesSubArray(int[] arr, int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxLength = 0, prefixSum = 0;
        mp.put(0, -1);
        for (int i = 0 ; i < n ; i++) {
            prefixSum += arr[i];
            if (mp.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - mp.get(prefixSum));
            } else {
                mp.put(prefixSum, i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(zeroSumLargesSubArray(arr, n));
    }
}
