// https://leetcode.com/problems/find-the-middle-index-in-array

class Solution {
    public int findMiddleIndex(int[] nums) {
        long sum =0;
        for (int i : nums){
            sum+=i;
        }
        long total =0;
        for (int i =0; i<nums.length; i++){
            if (total == sum-total-nums[i]){
                return i;
            }
            total +=nums[i];
        }
        return -1;
    }
}