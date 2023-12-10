package main.java.sspdev.leetcode.top150;

public class _125_ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindromeV2(s));
        System.out.println(isPalindromeV3(s));

    }

    //time -> O(n) memory -> O(1)
    private static boolean isPalindrome(String s) {
        var alphabeticalString = s.replaceAll("[^A-Za-z0-9]", "").trim().toLowerCase();
        var length = alphabeticalString.length();
        for (int i = 0; i < length / 2; i++) {
            if (alphabeticalString.charAt(length - i - 1) != alphabeticalString.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromeV2(String s) {
        var builder = new StringBuilder();
        var chars = s.toCharArray();
        for (char aChar : chars) {
            if (Character.isLetterOrDigit(aChar)) {
                builder.append(Character.toLowerCase(aChar));
            }
        }
        var string = builder.toString();
        var reversedString = builder.reverse().toString();
        return string.equals(reversedString);
    }

    private static boolean isPalindromeV3(String s) {
        var builder = new StringBuilder();
        s.chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(ch -> Character.toLowerCase((char) ch))
                .forEach(builder::append);
        return builder.toString().contentEquals(builder.reverse());
    }
}