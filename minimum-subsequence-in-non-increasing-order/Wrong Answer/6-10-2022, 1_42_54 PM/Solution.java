// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum =0;
        for(int i: nums){
            sum+=i;
        }
        int sum2 =0;
        int j = nums.length-1;
        List<Integer> ls = new LinkedList<>();
        while(j>0 && 2*sum2<=sum){
            sum2+=nums[j];
           // j--;
            ls.add(nums[j]);
            j--;
        }
        return ls;
        
        
        
    }
}