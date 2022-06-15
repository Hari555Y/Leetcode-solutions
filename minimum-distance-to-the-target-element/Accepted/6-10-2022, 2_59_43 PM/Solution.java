// https://leetcode.com/problems/minimum-distance-to-the-target-element

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int max = Integer.MAX_VALUE;
        for(int i =0 ; i <n;i++){
            if(nums[i] == target){
                max = Math.min(Math.abs(start-i), max);
            }
            
        }
        return max;
        
    }
}