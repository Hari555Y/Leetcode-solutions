// https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing

class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int c =0;
        for(int i =1; i<nums.length; i++){
            if(nums[i]<=nums[i-1]){
                c++;
                
            }
        }
        return c<2;
        
    }
}