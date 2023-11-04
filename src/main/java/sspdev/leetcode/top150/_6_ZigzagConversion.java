package main.java.sspdev.leetcode.top150;

public class _6_ZigzagConversion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        var result = """
                P   A   H   N
                A P L S I I G
                Y   I   R
                """;
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }

    private static String convert(String s, int numRows) {
        var builder = new StringBuilder();
        int diff = numRows * 2 - 2;
        int diagonalDiff;
        int secondIndex;
        int index;
        int n = s.length();
        for (int i = 0; i < numRows; i++) {
            index = i;
            while (index < n) {
                builder.append(s.charAt(index));
                if (i != 0 && i != numRows - 1) {
                    diagonalDiff = diff - 2 * i;
                    secondIndex = index + diagonalDiff;
                    if (secondIndex < n) {
                        builder.append(s.charAt(secondIndex));
                    }
                }
                index += diff;
            }
        }
        return builder.toString();
    }
}
