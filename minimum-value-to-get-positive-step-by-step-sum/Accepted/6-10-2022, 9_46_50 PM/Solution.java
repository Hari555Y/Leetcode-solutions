// https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum

class Solution {
    public int minStartValue(int[] nums) {
        int stval = 1;
        int min = Integer.MAX_VALUE;
        int sum =0;
        for(int i : nums){
            sum+=i;
            stval = Math.max(-1*sum + 1 , stval);
            
            
            
        }
        return stval;
        
    }
}