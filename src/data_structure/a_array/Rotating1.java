package data_structure.a_array;

import java.util.Arrays;

//Rotating array by kth element with O(n) space complexity
public class Rotating1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 3, 2, 5};
        rotate(arr, 3);
    }
    public static void rotate(int[] arr, int k){
        int n = arr.length, j = 0;
        int[] temp = new int[n];
//        First half
        for (int i = n - k; i < n; i++) {
            temp[j++] = arr[i];
        }
//        Second half
        for (int i = 0; i < n - k ; i++) {
            temp[j++] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
