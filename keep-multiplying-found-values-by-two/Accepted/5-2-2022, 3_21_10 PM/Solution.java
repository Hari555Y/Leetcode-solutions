// https://leetcode.com/problems/keep-multiplying-found-values-by-two

class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        while(Arrays.binarySearch(nums,original)>=0){
            original = original*2;
        }
        return original;
        
    }
}