package algorithms.recursion;

public class F_PtoQ {
    public static void main(String[] args) {
        int p = 2;
        int q = 5;
        System.out.println(pRaisedToThePowerq(p, q));
        System.out.println(pRaisedToPowerqOptimised(p, q));
    }
//    Time Complexity: O(q)
    public static int pRaisedToThePowerq(int p, int q){
        if (q == 0) return 1;
        return pRaisedToThePowerq(p, q - 1) * p;
    }

//    Time Complexity: O()
    public static int pRaisedToPowerqOptimised(int p, int q){
        if (q == 0) return 1;
        // small ans
        int small = pRaisedToPowerqOptimised(p,q/2);
        // for even case
        if (q % 2 == 0) return small * small;
        return small * small * p;
    }
}
