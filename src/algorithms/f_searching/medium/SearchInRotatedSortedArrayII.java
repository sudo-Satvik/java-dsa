package algorithms.f_searching.medium;
// For duplicate rotated sorted array
public class SearchInRotatedSortedArrayII {
    public static boolean searchInRotatedSortedArray(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return true;
            if (arr[mid] == arr[end] && arr[start] == arr[mid]) {
                --end;
                ++start;
            } else if (arr[mid] <= arr[end]) {  // mid to end is sorted
                if (arr[mid] < target && arr[end] >= target)
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (arr[start] <= target && arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        System.out.println(searchInRotatedSortedArray(arr, 0));
    }
}
