// https://leetcode.com/problems/maximum-average-subarray-i

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length<k){
            return 0;
        }
       // double max =0.0;
        int sum =0;
        for (int i =0; i<k; i++){
            sum +=nums[i]; 
        }
        int max = sum;
        System.out.println(max);
        for (int i =k; i<nums.length; i++){
            sum -=nums[i-k];
            sum += nums[i];
            System.out.println(sum);
            max = Math.max(max, sum);
            
            
        }
        return (double)max/(double)k;
        
        
    }
}