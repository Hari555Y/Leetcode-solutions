// https://leetcode.com/problems/monotonic-array

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = false;
        boolean dec = false;
        for(int i =1 ; i<nums.length ; i++){
            if (inc == true   &&  nums[i-1]>nums[i]){
                return false;
            }
            if (dec == true && nums[i]>nums[i-1]){
                return false;
            }
            if (nums[i]>nums[i-1]){
                inc = true;
            }
            if (nums[i]<nums[i-1]){
                dec = true;
            }
        }
            
    
        return true;
        
    }
}