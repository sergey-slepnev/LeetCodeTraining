package main.java.sspdev.leetcode.top150;

import java.util.Arrays;

public class _238_ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelfV2(nums)));
    }

    private static int[] productExceptSelf(int[] nums) {
        var length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] answer = new int[length];
        left[0] = 1;
        right[length - 1] = 1;
        for (int i = 1; i < length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int i = length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < length; i++) {
            answer[i] = left[i] * right[i];
        }
        return answer;
    }

    private static int[] productExceptSelfV2(int[] nums) {
        var length = nums.length;
        int[] answer = new int[length];
        answer[0] = 1;
        for (int i = 1; i < length; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }
        int r = 1;
        for (int i = length - 1 ; i >= 0; i--) {
            answer[i] = answer[i] * r;
            r *= nums[i];
        }
        return answer;
    }
}