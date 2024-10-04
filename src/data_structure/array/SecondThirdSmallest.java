package data_structure.array;

import java.util.Arrays;

public class SecondThirdSmallest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 5, 6, 11, 34};
        System.out.println(Arrays.toString(kthSmallestLargest(arr, 2)));
    }
    private static int[] kthSmallestLargest(int[] arr, int k){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == k && arr[j] < min) {
                    min = arr[j];
                }
                if (i == k && arr[j] > max) {
                    max = arr[j];
                }
            }
        }
        return new int[] {min, max};
    }
}
