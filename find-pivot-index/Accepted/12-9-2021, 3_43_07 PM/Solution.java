// https://leetcode.com/problems/find-pivot-index

class Solution {
    public int pivotIndex(int[] nums) {
        long sum =0;
        for (int i : nums){
            sum+=i;
        }
        long lefsum =0;
        for (int i =0; i<nums.length; i++){
            if (lefsum == sum-lefsum-nums[i]){
                return i;
            }
            lefsum+= nums[i];
            
        }
        return -1;
    }
}