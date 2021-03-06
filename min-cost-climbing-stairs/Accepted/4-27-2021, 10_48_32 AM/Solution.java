// https://leetcode.com/problems/min-cost-climbing-stairs

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] arr = new int[cost.length];
        arr[cost.length-2] = cost[cost.length-2];
        arr[cost.length-1] = cost[cost.length-1];
        for (int i = cost.length-3; i>=0; i--){
            arr[i] = cost[i] + Math.min(arr[i+1], arr[i+2]);
        }
        return Math.min(arr[0], arr[1]);
    }
}