package data_structure.a_array;

import java.util.Arrays;

public class PrefixSum1 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4, 5};
        System.out.println(Arrays.toString(runningSum2(nums)));
    }
//    By using extra space
    public static int[] runningSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
//    By using in-place
    public static int[] runningSum2(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
}
