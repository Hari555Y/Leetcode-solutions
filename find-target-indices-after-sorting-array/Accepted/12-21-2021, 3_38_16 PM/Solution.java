// https://leetcode.com/problems/find-target-indices-after-sorting-array

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==target){
                ls.add(i);
            }
        }
        return ls;
    }
}