package main.java.sspdev.leetcode.top150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _169_MajorityElement {

    public static void main(String[] args) {
        int[] nums = {3, 3, 4};
        int majorityCounter = getMajorityCounterV3(nums);
        System.out.println(majorityCounter);
    }

    private static int getMajorityCounter(int[] nums) {
        int majorityCounter = 0;
        int result = 0;
        for (int num_i : nums) {
            int currentCounter = 0;
            for (int num_j : nums) {
                if (num_i == num_j) {
                    currentCounter++;
                }
            }
            if (currentCounter > majorityCounter) {
                majorityCounter = currentCounter;
                result = num_i;
            }
        }
        return result;
    }

    private static int getMajorityCounterV2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    private static int getMajorityCounterV3(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int n = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        return 1;
    }
}