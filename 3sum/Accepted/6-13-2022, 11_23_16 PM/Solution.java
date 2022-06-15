// https://leetcode.com/problems/3sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if (n<3){
            return ans;
        }
        for(int i =0; i<n; i++){
            int j = i+1;
            int k = n-1;
            int r = -1*nums[i];
            while(j<k){
                if(nums[j] + nums[k] <r){
                    j++;
                }
                else if (nums[j] + nums[k]>r){
                    k--;
                }
                else{
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]); ls.add(nums[j]); ls.add(nums[k]);
                    if (!ans.contains(ls))
                        ans.add(ls);
                    j++; k--;
                }
            }
        }
        return ans;
        
    }
}