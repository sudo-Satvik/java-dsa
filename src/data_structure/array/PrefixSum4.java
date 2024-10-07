package data_structure.array;

import java.util.Arrays;

// prefix sum program 3 but without using an auxillary space
public class PrefixSum4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 3, 3};
        System.out.println(checkSubstring(arr));
    }

    private static boolean checkSubstring(int[] arr) {
        int totalSum = findSumArray(arr);
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) return true;
        }
        return false;
    }
    private static int findSumArray(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }
}
