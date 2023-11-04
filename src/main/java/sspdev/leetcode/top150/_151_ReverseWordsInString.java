package main.java.sspdev.leetcode.top150;

import java.util.Arrays;

public class _151_ReverseWordsInString {

    public static void main(String[] args) {
        String str = "a good   example";
        System.out.println(reverseWords_v2(str));
    }

    private static String reverseWords(String str) {
        var strings = str.trim().replaceAll("\\s+", " ").split(" ");
        for (int i = 0; i < strings.length / 2; i++) {
            String temp = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = temp;
        }
        return Arrays.toString(strings).replaceAll("(\\[|]|, )", " ").trim();
    }

    private static String reverseWords_v2(String s) {
        var strs = s.trim().split("\\s+");
        var builder = new StringBuilder();
        for (int i = strs.length - 1; i > 0; i--) {
            builder.append(strs[i]).append(" ");
        }
        return builder.append(strs[0]).toString();
    }
}