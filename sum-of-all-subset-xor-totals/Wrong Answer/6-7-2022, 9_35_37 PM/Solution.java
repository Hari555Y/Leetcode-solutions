// https://leetcode.com/problems/sum-of-all-subset-xor-totals

class Solution {
    public int subsetXORSum(int[] nums) {
        int sum =0;
        for(int i =0; i<nums.length; i++){
            int xor =0;
            for(int j =i; j<nums.length; j++){
                xor= xor^nums[j];
                sum+=xor;
                
            }
         //   sum += xor;
            
        }
        return sum;
        
    }
}