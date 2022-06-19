// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length==1 || prices.length==0){
            return 0;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i =0; i<prices.length-1;i++){
            for (int j= i+1; j<prices.length; j++){
                arr.add(prices[j]-prices[i]);
            }
        }
        Collections.sort(arr);
        if (arr.get(arr.size()-1)<0){
            return 0;
        }
        return arr.get(arr.size()-1);
        
        
    }
}