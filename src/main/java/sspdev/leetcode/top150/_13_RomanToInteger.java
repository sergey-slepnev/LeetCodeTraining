package main.java.sspdev.leetcode.top150;

import java.util.HashMap;

public class _13_RomanToInteger {

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int result = romanToInt(roman);
        System.out.println(result);

    }

    private static int romanToInt(String s) {
        var map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
//        O(n), O(1)
    }
}