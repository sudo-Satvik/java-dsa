package data_structure.array;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 4, 5};
        System.out.println(Arrays.toString(threeSum(arr, 10)));
    }
    private static int[] threeSum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = 0; k < arr.length - 2; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) return new int[]{i, j, k};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
