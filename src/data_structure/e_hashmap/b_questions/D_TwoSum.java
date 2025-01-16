package data_structure.e_hashmap.b_questions;

import java.util.HashMap;

public class D_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < n ; i++) {
            int partner = target - nums[i];
            if (map.containsKey(partner)) { // ans found
                return new int[]{i, map.get(partner)};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {

    }
}
