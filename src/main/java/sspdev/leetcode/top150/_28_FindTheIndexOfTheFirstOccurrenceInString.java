package main.java.sspdev.leetcode.top150;

public class _28_FindTheIndexOfTheFirstOccurrenceInString {

    public static void main(String[] args) {
        String haystack = "sifbutsaddtfdftds";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        int hayLength = haystack.length();
        int needleLength = needle.length();
        if (hayLength < needleLength) {
            return -1;
        }
        for (int i = 0; i <= hayLength - needleLength; i++) {
            int j = 0;
            while (j < needleLength && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if (j == needleLength) {
                return i;
            }
        }
        return -1;
    }
}