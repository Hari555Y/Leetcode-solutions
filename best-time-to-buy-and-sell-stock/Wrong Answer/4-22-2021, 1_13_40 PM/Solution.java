// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length==1 || prices.length==0){
            return 0;
        }
        int diff =0;
        int min = 0;
        int max =0;
        for (int tape : prices){
            if (tape<=min){
                min =tape;
                max = tape;
            }
            if (tape>max){
                max = tape;
            }
            if (diff<max-min){
                diff = max-min;
            }
        }
        return diff;
        
    }
}