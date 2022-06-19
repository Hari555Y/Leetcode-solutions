// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length==1 || prices.length==0){
            return 0;
        }
        HashSet<Integer> arr = new HashSet<>();
        for (int i =0; i<prices.length-1;i++){
            for (int j= i+1; j<prices.length; j++){
                if (prices[j]-prices[i]>0){
                    arr.add(prices[j]-prices[i]);
                    
                }
                
            }
        }
        //Collections.sort(arr);
        int max =0;
        for (int ta: arr){
            max = Math.max(max,ta);
        }
        if (max<0){
            return 0;
        }
        return max;
        
        
    }
}