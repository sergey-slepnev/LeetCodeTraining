package main.java.sspdev.leetcode.array;

public class _1_MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0};
        var maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                currentConsecutiveOnes++;
                if (currentConsecutiveOnes > maxConsecutiveOnes) {
                    maxConsecutiveOnes = currentConsecutiveOnes;
                }
            } else {
                currentConsecutiveOnes = 0;
            }
        }
        return maxConsecutiveOnes;
    }
}