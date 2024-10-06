package data_structure.array;

import java.util.Arrays;

public class Sort01_TwoPointer {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0};
        int[] sorted = sorting(arr);
        System.out.println(Arrays.toString(sorted));
    }
    private static int[] sorting(int[] arr){
        int left = 0, right = arr.length - 1;
        while(left < right){
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0){            // Sahi h chor do
                left++;
            }
            if (arr[right] == 1){           // Sahi h chor do
                right--;
            }
        }
        return arr;
    }
    private static void swap(int[] arr, int left, int right){
        arr[right] = arr[right] - arr[left];
        arr[left] = arr[right] + arr[left];
        arr[right] = arr[left] - arr[right];
    }
}
