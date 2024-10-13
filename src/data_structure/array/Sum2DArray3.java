package data_structure.array;

public class Sum2DArray3 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 1},
                          {1, 1, 1, 1},
                          {1, 1, 1, 1},
                          {1, 1, 1, 1}};
        int ans = sumPrefixRowCol(matrix, 0, 1, 2, 3);
        System.out.println(ans);
    }
    private static void prefixSumCreatorRow(int[][] matrix){
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }
    private static void prefixSumCreatorColumn(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }
    private static int sumPrefixRowCol(int[][] matrix, int l1, int r1, int l2, int r2){
        // Creating prefix sum for row only
        prefixSumCreatorRow(matrix);
        // Creating prefix sum for column only
        prefixSumCreatorColumn(matrix);
        // Now finding the ans
        // sum = totalSum - upper - left + upperleft
        int totalSum = 0, upper = 0, left = 0, upperLeft = 0;
        totalSum = matrix[l2][r2];
        if (l1 >= 1)
            upper = matrix[l1 - 1][r2];
        if (r1 >= 1)
            left = matrix[l2][r1 - 1];
        if (r1 >= 1 && l1 >= 1)
            upperLeft = matrix[l1 - 1][r1 - 1];
        return totalSum - upper - left + upperLeft;
    }
}
