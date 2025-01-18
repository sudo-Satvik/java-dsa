package data_structure.f_hashset.b_practice;
import java.util.*;
/** @Explain: Given an unsorted array of integers num, return the length of the longest consecutive elements sequence
 * @Input1: n = 6, nums = [100, 4, 200, 1, 3, 2]
 * @Output1: 4
 * @Input2: n = 10, nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]
 * @Output2: 4
 */
public class LongestConsecutiveElement {
    // time complexity: O(n * log n)
    public static int longestConsecutiveElement(int[] arr) {
        if (arr.length == 0) return 0;
        // Sorting the array:
        Arrays.sort(arr);
        int ans = 1, con = 1;
        for (int i = 1 ; i < arr.length ; i++) {
            // duplicate fix
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            else if (i < arr.length - 1 && arr[i] + 1 == arr[i + 1]) {
                con += 1;
            }
            ans = Math.max(con, ans);
        }
        return ans;
    }

    // using hashset
    public static int longestConsecutiveElement2(int[] nums){
        HashSet<Integer> hS = new HashSet<>();
        for(int n : nums) hS.add(n);
        int maxStreak = 0;
        for(int num : hS) {
            if(!hS.contains(num - 1)) {
                int currNum = num;
                int streak = 1;
                while (hS.contains(currNum + 1)) {
                    currNum++;
                    streak++;
                }
                maxStreak = Math.max(maxStreak, streak);
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Ans: " + longestConsecutiveElement(arr));
    }
}
