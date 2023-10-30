package main.java.sspdev.leetcode.top150;

public class _121_BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {2, 4, 1};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            var buy = prices[left];
            var sell = prices[right];
            if (buy < sell) {
                maxProfit = Math.max(maxProfit, sell - buy);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
