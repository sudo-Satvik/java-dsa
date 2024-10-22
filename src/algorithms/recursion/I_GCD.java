package algorithms.recursion;

public class I_GCD {
    public static void main(String[] args) {
        int x = 12;
        int y = 18;
        System.out.println(bruteForce(x, y));
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
}
