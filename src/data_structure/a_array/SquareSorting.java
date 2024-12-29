package data_structure.a_array;

import java.util.Arrays;

// [-10, -4, 2, 5, 6] => [4, 16, 25, 36, 100]
public class SquareSorting {
    public static void main(String[] args) {
        int[] arr = {-10, -4, 2, 1, -6, 0, 3, 5};
        System.out.println(Arrays.toString(squaring(arr)));
    }
    public static int[] squaring(int[] arr){
        int n = arr.length, left = 0, right = n - 1, k = 0;
        int[] ans = new int[n];
        while (left <= right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left]*arr[left];
                left++;     // iska kaam khtm isiliye aage badha do
            }
            else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
}
