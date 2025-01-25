package algorithms.f_searching.basics;

public class E_Sqrt {
    public static int sqrt(int x) {
        int y = 0;
        while (y * y <= x) {
            y++;
        }
        return y - 1;
    }
    public static int sqrt2(int x) {
        int start  = 0, end = x;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mid * mid;
            if (val == x) return mid;
            else if (val > x) end = mid - 1;
            else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 49;
        System.out.println(sqrt(x));
    }
}
