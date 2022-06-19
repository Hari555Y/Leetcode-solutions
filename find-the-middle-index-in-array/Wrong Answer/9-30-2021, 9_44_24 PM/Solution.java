// https://leetcode.com/problems/find-the-middle-index-in-array

class Solution {
    public int findMiddleIndex(int[] nums) {
        long sum =0;
        for (int i : nums){
            sum+=i;
        }
        long total =0;
        for (int i =0; i<nums.length; i++){
            total +=nums[i];
            if (total*2 == sum){
                return i;
            }
        }
        return -1;
    }
}