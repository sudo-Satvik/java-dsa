package algorithms.recursion;

public class A_Intro {
    public static void main(String[] args) {
        int n = 12;
        printNum(n);
    }
    public static void printNum(int n){
        // Base case
        if (n == 1){
            System.out.print(1+" ");
            return;
        }
        // Assumption
        printNum(n - 1);
        // Self Work
        System.out.print(n+" ");
    }
}
