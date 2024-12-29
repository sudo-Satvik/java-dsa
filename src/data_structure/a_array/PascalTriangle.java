package data_structure.a_array;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows: ");
        int n = sc.nextInt();
        pascalTriangle(n);
    }
    private static void pascalTriangle(int n){
        for (int i = 1; i <= n; i++) {
            // For white spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Left Portion
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Right Portion
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
