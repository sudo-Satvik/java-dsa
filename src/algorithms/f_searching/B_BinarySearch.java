package algorithms.f_searching;


public class B_BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
//        int[] arr = {12, 21, 23, 34, 45, 55, 67, 93};
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println("Ans: " + binarySearch(arr, 7));
    }
}
