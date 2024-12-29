package algorithms.d_recursion;

import java.util.Scanner;

public class D_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int n){
        // Halting condition
        if (n == 0 || n == 1) return n;
        // Recursive work and self work
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
