// https://leetcode.com/problems/find-the-duplicate-number

class Solution {
    public int findDuplicate(int[] nums) {
        int s = nums[0];
        int f = nums[0];
        do{
            s = nums[s];
            f = nums[nums[f]];
            
        }
        while(s!=f);
        int p = nums[0];
        int p2 = s;
        while(p!=p2){
            p = nums[p];
            p2 = nums[p2];
        }
        return p2;
        
    }
}