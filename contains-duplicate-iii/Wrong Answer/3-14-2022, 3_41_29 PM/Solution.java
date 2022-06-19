// https://leetcode.com/problems/contains-duplicate-iii

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n && j<=i+k ; j++){
                if (Math.abs(nums[i]-nums[j])<=t){
                    return true;
                }
            }
        }
        return false;
        
    }
}