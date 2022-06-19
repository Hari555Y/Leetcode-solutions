// https://leetcode.com/problems/contains-duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> has = new HashSet<>();
        for (int i =0; i<nums.length;i++){
            if (has.contains(nums[i])){
                return true;
            }
            has.add(nums[i]);
        }
        return false;
        
    }
}