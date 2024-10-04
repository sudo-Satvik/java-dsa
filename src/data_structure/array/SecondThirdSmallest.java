package data_structure.array;

import java.util.Arrays;

public class SecondThirdSmallest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 5, 6, 34};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(secondSmallestLargest(arr)));
    }
    private static int[] secondSmallestLargest(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i + 1];
            }
            if (max < arr[i] && i != 0){
                max = arr[i - 1];
            }
        }
        return new int[]{min, max};
    }
}
