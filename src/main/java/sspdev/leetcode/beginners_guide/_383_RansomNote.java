package main.java.sspdev.leetcode.beginners_guide;

import java.util.List;

/**
 * Given two strings ransomNote and magazine,
 * return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 */
public class _383_RansomNote {

    public static void main(String[] args) {
        String ransomNode = "aab";
        String magazine = "baa";
        System.out.println(canConstruct(ransomNode, magazine));
        System.out.println(canConstructV2(ransomNode, magazine));
    }

    //wrong solution!
    public static boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder result = new StringBuilder();
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        if (ransomNote.equals(magazine)) {
            return true;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            var ransomLatter = ransomNote.charAt(i);
            for (int j = i; j < magazine.length(); j++) {
                var magazineLetter = magazine.charAt(j);
                if (ransomLatter == magazineLetter) {
                    result.append(magazineLetter);
                    break;
                }
            }
        }
        return result.toString().equals(ransomNote);
    }

    public static boolean canConstructV2(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            var r = ransomNote.charAt(i);

            int matchIndex = magazine.indexOf(r);
            if (matchIndex == -1) {
                return false;
            }
            magazine = magazine.substring(0, matchIndex) + magazine.substring(matchIndex + 1);
        }
        return true;
    }
}