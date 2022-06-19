// https://leetcode.com/problems/contains-duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> has = new HashMap<>();
        for (int i =0; i<nums.length;i++){
            if (has.contains(nums[i])){
                return false;
            }
            has.add(nums[i]);
        }
        return true;
        
    }
}