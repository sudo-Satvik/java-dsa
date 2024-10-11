package data_structure.array;

import java.util.Arrays;

public class ClockwiseRotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateClockwise(matrix, 3, 3);
    }
    public static void rotateClockwise(int[][] nums, int r, int c){
        // transposing the array
        transpose(nums, r, c);
//        reversing the rows
        for (int i = 0; i < r; i++) {       // 0, 1, 2
            reverse(nums, i);
        }
        System.out.println(Arrays.deepToString(nums));
    }
    public static void transpose(int[][] arr, int r, int c){
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                swap(arr, i, j);
            }
        }
    }
    public static void reverse(int[][] nums, int row){
        int left = 0, right = nums[row].length - 1;
        while (left < right){
            int temp = nums[row][left];
            nums[row][left] = nums[row][right];
            nums[row][right] = temp;
            left++;
            right--;
        }
    }
    public static void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}
