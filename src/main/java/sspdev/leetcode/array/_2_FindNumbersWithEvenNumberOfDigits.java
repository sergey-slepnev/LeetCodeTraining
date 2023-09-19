package main.java.sspdev.leetcode.array;

public class _2_FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 33, 22};
        var evenCounter = findNumbers(nums);
        System.out.println(evenCounter);//4
    }

    public static int findNumbers(int[] nums) {
        int evenCounter = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                evenCounter++;
            }
        }
        return evenCounter;
    }
}