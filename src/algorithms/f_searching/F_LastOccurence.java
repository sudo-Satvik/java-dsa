package algorithms.f_searching;

public class F_LastOccurence {
    public static int lastOccurence(int[] arr, int target) {
        int n = arr.length -1;
        int start = 0, end = n;
        int lastOcc = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                lastOcc = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return lastOcc;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4};
        System.out.println(lastOccurence(arr, 3));
    }
}
