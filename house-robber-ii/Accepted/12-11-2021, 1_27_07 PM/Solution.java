// https://leetcode.com/problems/house-robber-ii

class Solution {
    public int rob(int[] nums) {
        int l = nums.length;
        if (l==1){
            return nums[0];
        }
        if(l==2){
            return Math.max(nums[0], nums[1]);
        }
        int[] ar1 = new int[l-1];
        int[] ar2 = new int[l-1];
        for (int i =0; i<l-1; i++){
            ar1[i] = nums[i];
        }
        for (int j =1; j<l; j++){
            ar2[j-1] = nums[j];
        }
        return Math.max(robbing(ar1), robbing(ar2));
        
    }
    public static int robbing(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        else if (nums.length==2){
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        dp[1] = Math.max(nums[1], nums[0]);
        for (int i=2; i<nums.length; i++){
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
            
        }
        return dp[nums.length-1];
        
    }
}