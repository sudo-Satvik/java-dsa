package data_structure.array;

import java.util.Arrays;

public class MatrixAdd {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        sum(matrix1, 3, 3, matrix2, 3, 3);
    }
    private static void sum(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        if (r1 != r2 || c1 != c2){
            System.out.println("Invalid!");
            return;
        }
        int[][] ans = new int[r1][c1];
        for (int i = 0; i < r1; i++) {      // count of rows
            for (int j = 0; j < c1; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
