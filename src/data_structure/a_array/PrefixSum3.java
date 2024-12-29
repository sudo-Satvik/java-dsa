package data_structure.a_array;

import java.util.Arrays;

public class PrefixSum3 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 3, 1};
        System.out.println(subArrayCheck(arr));
    }
    public static boolean subArrayCheck(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
//        Value updating!
        for (int i = 1; i < n; i++) {
            prefix[0] = arr[0];
            prefix[i] = prefix[i - 1] + arr[i];
            suffix[n - 1] = arr[n - 1];
            suffix[n - i - 1] = suffix[n - i] + arr[n - 1 - i];
        }
        System.out.println("Prefix: "+Arrays.toString(prefix)+"\n"+"Suffix: "+Arrays.toString(suffix));
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && prefix[i] == suffix[i+1]){
                return true;
            }
        }
        return false;
    }
}
