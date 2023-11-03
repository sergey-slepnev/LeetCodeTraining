package main.java.sspdev.leetcode.top150;

public class _58_LengthOfLastWord {

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

    private static int lengthOfLastWord(String s) {
        var split = s.split("\\s");
        return split[split.length - 1].length();
    }
}
