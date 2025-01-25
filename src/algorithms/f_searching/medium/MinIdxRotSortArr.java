package algorithms.f_searching.medium;
// Minimum index in rotated sorted array
public class MinIdxRotSortArr {
    public static int findMinimum(int[] arr) {
        int n = arr.length - 1;
        int start = 0, end = n;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[n]) {        // Lies in Array II
                start = mid + 1;
            } else if (arr[mid] <= arr[n]) {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 0, 1, 2};
        System.out.println(findMinimum(arr));
    }
}
