package data_structure.array;

import java.util.Arrays;

public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(secondMaximum(arr));
    }
    private static int secondMaximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = i;
            }
        }
        arr[max] = Integer.MIN_VALUE;
        max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = i;
            }
        }
        return max;
    }
}
