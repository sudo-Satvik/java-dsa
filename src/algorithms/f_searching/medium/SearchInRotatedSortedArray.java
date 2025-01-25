package algorithms.f_searching.medium;

public class SearchInRotatedSortedArray {
    public static int search(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < arr[end]) {     // 1st sorted case
                if (arr[mid] < target && arr[end] >= target) {  // maybe target present between them
                    start = mid + 1;
                } else {        // if target isn't present at that chunk
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target && arr[start] <= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 0));
    }
}
