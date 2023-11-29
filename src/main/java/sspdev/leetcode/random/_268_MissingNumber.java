package main.java.sspdev.leetcode.random;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _268_MissingNumber {

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
//        int[] nums = {0, 1};
        System.out.println(missingNumber_v1(nums));
        System.out.println(missingNumber_v2(nums));
        System.out.println(missingNumber_v3(nums));
        System.out.println(missingNumber_v4(nums));
    }

    //    time = O(NlogN), space = O(logN)
    private static int missingNumber_v1(int[] nums) {
        //        time = O(NlogN) spase = O(logN) - for sort
        Arrays.sort(nums);
        var length = nums.length;
        //        time = O(N) spase = O(1) - for for loop
        for (int i = 0; i < length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return length;
    }

    //    time = O(n), space = O(n)
    private static int missingNumber_v2(int[] nums) {
//        O(n); O(n)
        var list = IntStream.of(nums).boxed().toList();
        var list1 = Arrays.stream(nums).boxed().toList();
//        var integers = new HashSet<>(list);
        var length = nums.length;
//        O(n); O(1)
        for (int i = 0; i < length; i++) {
            if (!list1.contains(i)) {
                return i;
            }
        }
        return length;
    }

//    O(n) O(1)
    private static int missingNumber_v3(int[] nums) {
        int expectedXor = 0;
        for (int i = 0; i <= nums.length; i++) {
            expectedXor ^= i;
        }
        int actualXor = 0;
        for (int num : nums) {
            actualXor ^= num;
        }
        return expectedXor ^ actualXor;
    }

//    O(n) O(1)
    private static int missingNumber_v4(int[] nums) {
        var expectedSum = IntStream.range(0, nums.length + 1).sum();
        var actualSum = IntStream.of(nums).sum();
        return expectedSum - actualSum;
    }
}