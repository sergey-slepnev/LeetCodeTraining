package main.java.sspdev.leetcode.beginners_guide;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * Example 1:
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * Example 2:
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 */
public class _412_FizzBuzz {

    public static void main(String[] args) {
        int n = 15;
        var result = fizzBuzz(n);
        var result_v_2 = fizzBuzz_v_2(n);
        System.out.println(result);
        System.out.println(result_v_2);
    }

    public static List<String> fizzBuzz(int n) {
        var result = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                result.add("FizzBuzz");
            } else if (divisibleBy3) {
                result.add("Fizz");
            } else if (divisibleBy5) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
//        Time complexity = O(n)
//        Space complexity = O(1)
    }

    static List<String> fizzBuzz_v_2(int n) {
        var result = new ArrayList<String>(n);

        for (int i = 1; i <= n; i++) {
            boolean divisiveBy3 = i % 3 == 0;
            boolean divisiveBy5 = i % 5 == 0;

            String currentString = "";

            if (divisiveBy3) {
                currentString += "Fizz";
            }
            if (divisiveBy5) {
                currentString += "Buzz";
            }
            if (currentString.isEmpty()) {
                currentString = String.valueOf(i);
            }
            result.add(currentString);
        }
        return result;
//        Time complexity = O(n)
//        Space complexity = O(1)
    }
}