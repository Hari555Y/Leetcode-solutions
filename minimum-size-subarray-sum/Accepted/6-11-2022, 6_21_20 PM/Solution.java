// https://leetcode.com/problems/minimum-size-subarray-sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i =0;
        int j =0;
        int n = nums.length;
        int max = Integer.MAX_VALUE;//nums.length;
        int sum =0;
        while(j<n){
            sum+=nums[j];
            if (sum>= target){
                max = Math.min(j-i+1, max);
                while(sum>=target && i<n){
                    sum-=nums[i];
                    i++;
                    if (sum>=target){
                        max = Math.min(j-i+1 , max);
                    }
                }
            }
            j++;
        }
        return max == Integer.MAX_VALUE ? 0  : max;
        
    }
}