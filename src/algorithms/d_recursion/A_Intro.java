package algorithms.d_recursion;

public class A_Intro {
    public static void main(String[] args) {
        int n = 12;
        printNumIncreasing(n);
        System.out.println("");
        printNumDecreasing(n);
    }
    public static void printNumIncreasing(int n){
        // Base case or Halting Condition which help to prevent stack overflow!
        if (n == 1){
            System.out.print(1+" ");
            return;
        }
        // Assumption aka smaller or sub problem   
        printNumIncreasing(n - 1);
        // Self Work
        System.out.print(n+" ");
    }
    public static void printNumDecreasing(int n){
//        Halting condition
        if (n == 1){
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n+" ");
        printNumDecreasing(n-1);
    }
}
