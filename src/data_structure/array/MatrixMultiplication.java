package data_structure.array;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {3, 2, 1}, {4, 5, 6}, {6, 5, 4}};
        int[][] arr2 = {{1, 2, 3, 4}, {4, 3, 2, 1}, {1, 2, 3, 4}};

        multiply(arr1, 4, 3, arr2, 3, 4);
    }

    private static void multiply(int[][] a1, int r1, int c1, int[][] a2, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Invalid matrix dimensions for multiplication");
            return;
        }
        int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {  // c1 == r2
                    ans[i][j] += (a1[i][k] * a2[k][j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
