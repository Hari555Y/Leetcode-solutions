// https://leetcode.com/problems/largest-number-at-least-twice-of-others

class Solution {
    public int dominantIndex(int[] nums) {
        int l =-1;
        int sl = -1;
        int ind = -1;
        for(int i =0; i<nums.length; i++){
            if(nums[i]>l){
                sl = l;
                l = nums[i];
                ind = i;
            }
            else if (nums[i]>sl && nums[i]<l){
                sl = nums[i];
                
            }
        }
        return l>=2*sl ? ind : -1;
    }
}