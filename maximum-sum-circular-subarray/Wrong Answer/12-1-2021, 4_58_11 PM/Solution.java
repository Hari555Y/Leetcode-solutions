// https://leetcode.com/problems/maximum-sum-circular-subarray

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int sum=0;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(ans>sum){
                ans=sum;
            }
            if(sum>0){
                sum=0;
            }
        }
        int ans1=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum1=sum1+nums[i];
            if(ans1<sum1){
                ans1=sum1;
            }
            if(sum1<0){
                sum1=0;
            }
        }
        for(int j=0;j<nums.length;j++){
            sum2=sum2+nums[j];
        }
        int q=sum2+Math.abs(ans);
        return Math.max(q,ans1);
        
    }
}