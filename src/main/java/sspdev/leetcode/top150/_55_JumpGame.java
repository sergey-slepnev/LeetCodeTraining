package main.java.sspdev.leetcode.top150;

public class _55_JumpGame {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        var isCanJump = canJump(nums);
        System.out.println(isCanJump);
    }

    private static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) {
                return false;
            }
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}