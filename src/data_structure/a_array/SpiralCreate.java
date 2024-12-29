package data_structure.a_array;

import java.util.Scanner;

public class SpiralCreate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        spiralCreating(n);
    }
    private static void spiralCreating(int n){
        int row = n, col = n;
        int topRow = 0, bottomRow = row - 1;
        int leftCol = 0, rightCol = col - 1;
        int totalElement = 0, elementInArray = 1;
        int[][] resMatrix = new int[row][col];
        while (totalElement < row*col){
            // TopRow => Left Col to Right Col
            for (int j = leftCol; j <= rightCol && totalElement < row*col; j++) {
                resMatrix[topRow][j] = elementInArray;
                elementInArray++;
                totalElement++;
            }
            topRow++;
            // RightCol => TopRow to BottomRow
            for (int i = topRow; i <= bottomRow && totalElement < row*col; i++) {
                resMatrix[i][rightCol] = elementInArray;
                elementInArray++;
                totalElement++;
            }
            rightCol--;
            // BottomRow => RightCol to LeftCol
            for (int j = rightCol; j >= leftCol; j--) {
                resMatrix[bottomRow][j] = elementInArray;
                elementInArray++;
                totalElement++;
            }
            bottomRow--;
            // LeftCol => BottomRow to TopRow
            for (int i = bottomRow; i >= topRow; i--) {
                resMatrix[i][leftCol] = elementInArray;
                elementInArray++;
                totalElement++;
            }
            leftCol++;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(resMatrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
