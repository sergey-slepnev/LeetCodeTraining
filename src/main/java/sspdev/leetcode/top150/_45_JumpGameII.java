package main.java.sspdev.leetcode.top150;

public class _45_JumpGameII {

    public static void main(String[] args) {
        int[] nums = {2, 3, 0, 1, 4};

        int result = jump(nums);
        System.out.println(result);
    }

    private static int jump(int[] nums) {
        int left = 0;
        int right = 1;
        int result = 0;
        while (right < nums.length - 1) {
            int furthest = 0;
            for (int i = left; i < right; i++) {
                furthest = Math.max(furthest, i + nums[i]);
            }
            left = right;
            right = furthest;
            result++;
        }
        return result;
    }
}
