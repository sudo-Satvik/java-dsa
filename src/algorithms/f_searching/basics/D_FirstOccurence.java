package algorithms.f_searching.basics;

public class D_FirstOccurence {
    public static int firstOccurence(int[] arr, int target) {
        int n = arr.length - 1;
        int start = 0, end = n;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            }
            else if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int[] arr2 = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4};
        System.out.println("Ans: " + firstOccurence(arr2, 2));
    }
}
