package main.java.sspdev.leetcode.array;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */

public class _5_MergeSortedArray {

    public static void main(String[] args) {
        int[] n1 = {1, 7, 9, 0, 0, 0, 0};
        int[] n2 = {3, 4, 5, 6};
        int m = 3;
        int n = 4;

        merge(n1, m, n2, n);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < m + n; i++, j++) {
            nums1[i] = nums2[j];
        }
        int temp;
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[j] < nums1[i]) {
                    temp = nums1[j];
                    nums1[j] = nums1[i];
                    nums1[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}