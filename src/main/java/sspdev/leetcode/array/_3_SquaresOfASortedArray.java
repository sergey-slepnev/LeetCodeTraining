package main.java.sspdev.leetcode.array;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 */

public class _3_SquaresOfASortedArray {

    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};
        var result = sortedSquares_V2(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }

        int temp = 0;
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    public static int[] sortedSquares_V2(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[p] = nums[i] * nums[i];
                i++;
            } else {
                result[p] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }
}