package algorithms.d_recursion;
// Given an integer n, find out the sum of its digit using recursion
public class E_SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(addingDigits(n));
        System.out.println(countDigits(n));
    }

    // Sub problem in this:
    // f(1234) = f(123) + f(4)

    public static int addingDigits(int n){
        // Halting Condition
        if (n <= 9 && n >= 0) {
            return n;
        }
        // Self Work & Recursive Work
        return addingDigits(n / 10) + n % 10;
    }
    public static int countDigits(int n){
        // Base Case
        if (n <= 9 && n >= 1) return 1;
        return countDigits(n / 10) + 1;
    }
}
