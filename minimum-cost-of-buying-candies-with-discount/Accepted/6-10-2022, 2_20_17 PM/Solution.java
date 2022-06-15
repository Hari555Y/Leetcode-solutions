// https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int sum =0; int count =0;
        for(int i =n-1; i>=0; i--){
            sum++;
            if(sum%3==0){
                
            }
            else{
                count +=cost[i];
            }
        }
        return count;
        
    }
}