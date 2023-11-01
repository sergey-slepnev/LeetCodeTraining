package main.java.sspdev.leetcode.top150;

import java.util.Arrays;

public class _189_RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
    }

    private static void rotateArray(int[] nums, int k) {
        while (k > 0) {
            int lastElement = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = lastElement;
            k--;
        }
    }

    private static void rotateArray_v2(int[] nums, int k) {
        int[] rotatedArray = new int[nums.length];
        for (int i = k; i < nums.length; i++) {
            rotatedArray[i] = nums[i - k];
            rotatedArray[(i + k) % nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(rotatedArray));
    }

    private static void rotateArray_v3(int[] nums, int k) {
        k = k % nums.length;
        rotate(nums, 0, nums.length - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, nums.length - 1);
    }

    private static void rotate(int[] nums, int start, int end) {
        int temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}