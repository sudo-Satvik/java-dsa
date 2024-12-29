package data_structure.a_array;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {9, 2, 1, 2, 3, 1, 3, 2, -1, -55};
        System.out.println(Arrays.toString(minMax(arr)));
    }
    private static int[] minMax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return new int[]{min, max};
    }
}
