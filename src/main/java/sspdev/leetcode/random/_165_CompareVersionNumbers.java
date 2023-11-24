package main.java.sspdev.leetcode.random;

public class _165_CompareVersionNumbers {

    public static void main(String[] args) {
        String version1 = "1.0.1";
        String version2 = "1";

        System.out.println(compareVersion(version1, version2));
    }

    private static int compareVersion(String version1, String version2) {
        var split1 = version1.split("\\.");
        var split2 = version2.split("\\.");

        var len_1 = split1.length;
        var len_2 = split2.length;
        for (int i = 0; i < Math.max(len_1, len_2); i++) {
            int num_1 = i < len_1 ? Integer.parseInt(split1[i]) : 0;
            int num_2 = i < len_2 ? Integer.parseInt(split2[i]) : 0;
            if (num_1 > num_2) {
                return 1;
            } else if (num_1 < num_2) {
                return -1;
            }
        }
        return 0;
    }
}