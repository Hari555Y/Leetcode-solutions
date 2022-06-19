// https://leetcode.com/problems/maximum-subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int sum =0;
        for(int i : nums){
            sum+=i;
            max_so_far = Math.max(max_so_far, sum);
            if (sum<0){
                sum =0;
            }
        }
        return max_so_far;
        
    }
}