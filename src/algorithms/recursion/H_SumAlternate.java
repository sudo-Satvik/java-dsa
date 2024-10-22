package algorithms.recursion;
// Given a number n. You have to find the sum up to n with alternate sign (- + - ....)
public class H_SumAlternate {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumAlternate(n));
    }
    private static int sumAlternate(int n){
        if (n == 1) return n;
        int sum = 0;
        // recursive work
        if (n % 2 == 0)
            return sumAlternate(n-1) - n;
        return sumAlternate(n-1) + n;
    }
}
