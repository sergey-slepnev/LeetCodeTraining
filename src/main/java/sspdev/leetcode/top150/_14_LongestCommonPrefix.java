package main.java.sspdev.leetcode.top150;

import java.util.Arrays;

public class _14_LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strings));
    }

    private static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        var first = strs[0];
        var last = strs[strs.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            } else {
                ans.append(first.charAt(i));
            }
        }
        return ans.toString();
    }
}
