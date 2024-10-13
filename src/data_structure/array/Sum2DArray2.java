package data_structure.array;

public class Sum2DArray2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        int ans = sumPreCalc(matrix, 0, 1, 2, 3);
        System.out.println(ans);
    }
    private static void findingPrefixSum(int[][] matrix){
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }
    private static int sumPreCalc(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
//        Creating prefix sum
        findingPrefixSum(matrix);
//        Advantage here from bruteforce method!
        for (int i = l1; i <= l2 ; i++) {
                if (r1 >= 1)
                    sum += matrix[i][r2] - matrix[i][r1 - 1];
                else
                    sum += matrix[i][r2];
        }
        return sum;
    }
}
