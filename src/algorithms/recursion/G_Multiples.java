package algorithms.recursion;
// Given a number 'num' and a value 'k'. Print k multiples of num.
public class G_Multiples {
    public static void main(String[] args) {
        int num = 12;
        int k = 5;
        multiples(num, k);
    }
    /*
    * num = 12 ; k = 5
    * ans = 12, 24, 36, 48, 60
    * 12 x 1, 12 x 2, 12 x 3, 12 x 4, 12 x 5
    * f(n, k) = f(n, k-1) * k;
    * */
    private static void multiples(int n, int k){
        // Base Case
        if (k == 1) {
            System.out.print(n+ " ");
            return;
        }
        // recursive work
        multiples(n, k - 1);
        System.out.print(n * k + " ");
    }
}
