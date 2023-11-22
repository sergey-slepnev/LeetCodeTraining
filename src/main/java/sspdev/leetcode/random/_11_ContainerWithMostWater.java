package main.java.sspdev.leetcode.random;

public class _11_ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {1, 8, 50, 2, 5, 100, 8, 3, 10};
        System.out.println(maxArea(height));
        System.out.println(maxArea_2(height));
    }

    //    time = O(n), memory = O(1)
    private static int maxArea_2(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int currentArea;
        int maxArea = 0;
        while (i != j) {
            int left = height[i];
            int right = height[j];
            currentArea = Math.min(left, right) * (j - i);
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
            if (left < right) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }


    // time = O(n2) memory = O(1) -> Time limit exceeded
    private static int maxArea(int[] height) {
        int currentArea;
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                currentArea = (j - i) * Math.min(height[i], height[j]);
                if (currentArea > maxArea) {
                    maxArea = currentArea;
                }
            }
        }
        return maxArea;
    }
}
