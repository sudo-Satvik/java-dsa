package algorithms.f_searching;

public class C_RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int start, int end, int target) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            return recursiveBinarySearch(arr, mid + 1, end, target);
        else
            return recursiveBinarySearch(arr, start, mid - 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {12, 21, 23, 34, 45, 55, 67, 93};
        System.out.println(recursiveBinarySearch(arr, 0, arr.length - 1, 55));
    }
}
