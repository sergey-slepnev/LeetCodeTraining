package main.java.sspdev.leetcode.top150;

import java.util.Arrays;

public class _80_RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3};
        int result = removeDuplicates(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums) + " " + result);
    }

    private static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int n : nums) {
            if (index < 2 || n != nums[index - 2]) {
                nums[index++] = n;
            }
        }
        return index;
    }
}