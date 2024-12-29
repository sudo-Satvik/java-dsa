package data_structure.a_array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8};
        System.out.println("Indices are: "+Arrays.toString(twoSum(arr, 11)));
    }
    private static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[] {-1,-1};
    }
}
