package data_structure.array;
import java.util.Scanner;
public class PrefixSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array!");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter elements: ");
        for (int i = 1; i <= n ; i++) {
            arr[i] = sc.nextInt();
        }
        prefixSum(arr);
        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();
        while (q > 0){
            System.out.println("Enter l and r");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = arr[r] - arr[l - 1];
            System.out.print("for l = "+l+" and r = "+r+" ~ ");
            System.out.println(ans);
            q--;
        }
    }
    private static void prefixSum(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
    }
}
