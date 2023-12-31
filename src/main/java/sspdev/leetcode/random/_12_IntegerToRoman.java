package main.java.sspdev.leetcode.random;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _12_IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(intToRomain(10));
    }
//time = O(n)
    private static String intToRomain(int num) {
        HashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder builder = new StringBuilder();
        for (Integer integer : map.keySet()) {
            while (num / integer > 0) {
                builder.append(map.get(integer));
                num -= integer;
            }
        }
        return builder.toString();
    }
}
