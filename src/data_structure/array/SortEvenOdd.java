package data_structure.array;

import java.util.Arrays;

public class SortEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 9, 8};
        sort(arr);
    }
    public static void sort(int[] arr){
        int left = 0, right = arr.length - 1;
        while (left < right){
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0){
                swap(arr, left, right);
                right--;
                left++;
            }
            if(arr[left] % 2 == 0)      // apni sahi jagah par h
                left++;
            if (arr[right] % 2 != 0)    // apni sahi jagah pr h
                right--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int a, int b){
        arr[b] = arr[b] - arr[a];
        arr[a] = arr[b] + arr[a];
        arr[b] = arr[a] - arr[b];
    }
}
