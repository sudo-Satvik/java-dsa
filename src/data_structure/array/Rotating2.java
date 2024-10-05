package data_structure.array;

import java.util.Arrays;

public class Rotating2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        rotate(arr, 2);
    }
    public static void rotate(int[] arr, int k){
        k %= arr.length;
//        reversing whole array
        swapRev(arr, 0, arr.length - 1);
//        reversing-back first half
        swapRev(arr, 0, k - 1);
//        reversing-back second half
        swapRev(arr, k, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void swapRev(int[] arr, int start, int end){
        while(start < end){
            arr[end] = arr[end] - arr[start];
            arr[start] = arr[end] + arr[start];
            arr[end] = arr[start] - arr[end];
            start++;
            end--;
        }
    }
}
