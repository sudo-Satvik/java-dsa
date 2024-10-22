package algorithms.recursion;

public class I_GCD {
    public static void main(String[] args) {
        int x = 13;
        int y = 3;
        System.out.println(bruteForce(x, y));
        System.out.println(longDivisionIteration(x, y));
        System.out.println(euclidDivisionMethod(x, y));
        System.out.println(lcm(x, y));
    }
    // Finding GCD by bruteforce approach
    public static int bruteForce(int x, int y){
//        min(x,y) >= gcd(x,y)
        int minimumAmongParams = Math.min(x, y);
        int ans = 0;
        for (int i = minimumAmongParams; i > 0; i--) {
            if (x % i == 0 && y % i == 0){
                ans = i;
                break;
            }
        }
        return ans;
    }
    // FINDING GCD BY USING LONG DIVISION METHOD====================
    // Iterative approach
    private static int longDivisionIteration(int a, int b){
        while (b % a != 0){
            int temp = a;
            a = b % a;
            b = temp;
        }
        return a;
    }

    // Euclid Algorithm of Finding GCD
    // GCD(x, y) = GCD(y, x % y)
    // GCD(x, 0) = x
    private static int euclidDivisionMethod(int x, int y){
        if (y == 0) return x;
        return euclidDivisionMethod(y, x % y);
    }

    // Finding lcm
    private static int lcm(int x, int y){
        int gcd = euclidDivisionMethod(x, y);
        return (x * y) / gcd;
    }
}
