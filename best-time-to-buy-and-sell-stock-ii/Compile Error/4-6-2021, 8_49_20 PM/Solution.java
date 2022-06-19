// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii

class Solution {
    public int maxProfit(int[] prices) {
        int count =0;
        int i =0;
        for (i<prices.length-1){
            if (prices[i]<prices[i+1]){
                count+= prices[i+1]-prices[i];
                i = i+2;
            }
            i++;
            
        }
        return count;
        
    }
}