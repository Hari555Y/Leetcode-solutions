// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing

class Solution {
    public int minOperations(int[] nums) {
        int count =0;
        int n = nums.length;
        int prev = nums[0];
        for(int i =1; i<n; i++){
            count += (nums[i]>prev)? 0 : prev-nums[i]+1;
            prev = Math.max(nums[i-1], prev+1);
            
        }
        return count;
        
    }
}