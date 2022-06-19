// https://leetcode.com/problems/majority-element

class Solution {
    public int majorityElement(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i =0; i<nums.length;i++){
            hs.add(nums[i]);
        }
        for (int i:hs){
            int count =0;
            for (int k =0; k< nums.length;k++){
                if (nums[k] ==i){
                    count++;
                }
            }
            if (count>nums.length/2){
                return i;
            }
        }
        return -1;
        
    }
}