package algorithms.f_searching.expert;

/**
 * @Problem_Statement: You have n number of boxes which contains a[i] chocolates. You need to distribute these boxes among 'm' students such that the maximum number of chocolates allocated to a student is minimum.
 * @Condition:
 * <ul>
 *     <li>One box allocated to exactly one student.</li>
 *     <li>All the boxes should be allocated.</li>
 *     <li>Each student has to allocate at least one box.</li>
 *     <li>Allotment should be in contiguous order</li>
 * </ul>
 * @Quest: Calculate and return minimum possible ans.
 */

public class ChocolateDistribution {
    public static int chocolatesDistribution(int n, int[] arr, int m){
        if (arr.length < m) return -1;
        int ans = 0, s = 1, e = (int)1e9;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isDistributionPossible(arr, m, mid)){
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    private static boolean isDistributionPossible(int[] arr, int m, int maxChocolateAllowed) {
        int studentCount = 1;
        int chocolates = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxChocolateAllowed) return false;

            if (chocolates + arr[i] <= maxChocolateAllowed ) chocolates += arr[i];
            else {
                studentCount++;
                chocolates = arr[i];
            }
        }
        return studentCount <= m;
    }

    public static void main(String[] args) {
        int boxCount = 4;
        int[] chocolates = {12, 34, 67, 90};
        int students = 2;

        int ans = chocolatesDistribution(boxCount, chocolates, students);
        System.out.println("Ans: " + ans);
    }
}
