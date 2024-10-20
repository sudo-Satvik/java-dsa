package algorithms.recursion;

public class C_Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        // Halting Condition
        if (n == 0){
            return 1;
        }
        // Smaller problem -> Recursive Work
        int smallerAns = factorial(n - 1);
        // Self Work
        return n * smallerAns;
    }
}
