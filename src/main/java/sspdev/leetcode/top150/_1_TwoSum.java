package main.java.sspdev.leetcode.top150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {

    public static void main(String[] args) {
        int[] nums = {4, 7, 6, 15};
        int target = 21;

        var ints = twoSum3(nums, target);
        System.out.println(Arrays.toString(ints));
/**
 *      4 -> 0, 13 - 4 = 9
 *      7 -> 1, 13 - 7 = 6
 *      6 -> 2,
 *      15 -> 3
 */
    }

    //    time - O(n2), memory - O(1) Brute force
    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int currentSum = nums[i] + nums[j];
                if (currentSum == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    //    time - O(n2), memory - O(1) Brute force
    private static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    //      time -> O(n), memory -> O(1)
    private static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        System.out.println(map);
        for (int i = 0; i < nums.length; i++) {
            var diff = target - nums[i];
            if (map.get(diff) != null && i != map.get(diff)) {
                result[0] = map.get(diff);
                result[1] = i;
            }
        }
        return result;
    }
}