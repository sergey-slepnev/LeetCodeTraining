package main.java.sspdev.leetcode.random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _387_FirstUniqueCharacterInString {

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
        System.out.println(firstUniqChar_v2(s));
    }

    private static int firstUniqChar(String s) {
        var length = s.length();
        var count = new HashMap<Character, Integer>();
        for (int i = 0; i < length; i++) {
            var c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < length; i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

//    O(n) O(n)
    private static int firstUniqChar_v2(String s) {
        var length = s.length();
        var split = s.split("");
        var count = Arrays.stream(split)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (int i = 0; i < length; i++) {
            if (count.get(split[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}