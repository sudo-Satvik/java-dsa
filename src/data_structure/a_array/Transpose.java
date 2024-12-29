package data_structure.a_array;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1, 2},
                       {4, 5},
                       {7, 8}};
        transpose(arr, 3, 2);
    }
//    Using auxiliary space
    private static void transpose(int[][] arr, int r, int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
