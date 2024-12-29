package data_structure.a_array;

public class SpiralTraverse {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        spiralTraverse(matrix, 3, 3);
    }
    private static void spiralTraverse(int[][] arr, int r, int c){
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElement = 0;
        while(totalElement < r*c){
            // TopRow -> LeftCol to RightCol
            for (int j = leftCol; j <= rightCol && totalElement < r*c; j++) {
                System.out.print(arr[topRow][j]+" ");
                totalElement++;
            }
            topRow++;       // In order to avoid repeat
            
            // Right Col -> TopRow to BottomRow
            for (int i = topRow; i <= bottomRow && totalElement < r*c; i++) {
                System.out.print(arr[i][rightCol]+" ");
                totalElement++;
            }
            rightCol--;
            // Bottom Row -> RightCol to LeftCol
            for (int j = rightCol; j >= leftCol && totalElement < r*c; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;
            // Left Col -> BottomRow to TopRow
            for (int i = bottomRow; i >= topRow && totalElement < r*c; i--) {
                System.out.print(arr[i][leftCol]+" ");
                totalElement++;
            }
            leftCol++;
        }
    }
}
