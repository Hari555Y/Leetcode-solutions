// https://leetcode.com/problems/house-robber

class Solution {
    public int rob(int[] nums) {
        int count =0;
        int sum =0;
        for (int i=0; i<nums.length; i++){
            if (i%2==0){
                sum+=nums[i];

            }
            else{
                count+=nums[i];
            }
        }
        return Math.max(count, sum);
        
    }
}