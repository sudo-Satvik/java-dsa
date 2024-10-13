package data_structure.array;

public class Sum2DArray {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 1},
                          {1, 1, 1, 1},
                          {1, 1, 1, 1},
                          {1, 1, 1, 1}};
        int ans = sumBruteforceMethod(matrix, 1, 1, 2, 3);
        System.out.println(ans);
    }
//    By bruteforceMethod
    private static int sumBruteforceMethod(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <=r2 ; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
