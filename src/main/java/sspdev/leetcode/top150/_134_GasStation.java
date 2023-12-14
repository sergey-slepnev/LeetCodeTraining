package main.java.sspdev.leetcode.top150;

public class _134_GasStation {

    public static void main(String[] args) {
        int[] gas = {5, 1, 2, 3, 4};
        int[] cost = {4, 4, 1, 5, 1};

        System.out.println(canCompleteCircuit(gas, cost));
    }

    //time - O(n), space - O(1)
    private static int canCompleteCircuit(int[] gas, int[] cost) {
        int currGain = 0;
        int totalGain = 0;
        int answer = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGain += gas[i] - cost[i];
            currGain += gas[i] - cost[i];
            if (currGain < 0) {
                answer = i + 1;
                currGain = 0;
            }
        }
        return totalGain >= 0 ? answer : -1;
    }
}