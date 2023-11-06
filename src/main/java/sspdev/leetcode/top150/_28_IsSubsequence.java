package main.java.sspdev.leetcode.top150;

public class _28_IsSubsequence {

    public static void main(String[] args) {
        String s = "";
        String t = "abc";
        System.out.println(isSubsequence(s, t));
    }

    private static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}