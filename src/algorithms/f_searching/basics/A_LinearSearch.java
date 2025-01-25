package algorithms.f_searching.basics;
// O(n) time complexity searching algorithm
public class A_LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12, 34, 21, 55, 93, 45, 23, 67};
        int target = 45;
        System.out.println("Ans: " + linearSearch(arr, target));
    }
}
