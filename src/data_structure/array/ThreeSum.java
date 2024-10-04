package data_structure.array;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 4, 5};
        System.out.println(threeSum(arr, 10));
    }
    private static int threeSum(int[] arr, int target){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) ans++;
                }
            }
        }
        return ans;
    }
}
