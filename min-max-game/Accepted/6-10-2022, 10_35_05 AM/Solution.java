// https://leetcode.com/problems/min-max-game

class Solution {
    public int minMaxGame(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int n = nums.length;
        int nnums[] = new int[n/2];
        boolean bool = false;
        for(int i =0; i<nums.length; i+=2){
            if (bool){
                nnums[i/2] = Math.max(nums[i], nums[i+1]);
                bool = false;
                
            }
            else{
                 nnums[i/2] = Math.min(nums[i], nums[i+1]);               
                bool = true;
                
            }
            
            
        }
        return minMaxGame(nnums);
    }
}