package main.java.sspdev.leetcode.top150;

public class _26_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {};
        removeDuplicates(nums);
    }

    private static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

