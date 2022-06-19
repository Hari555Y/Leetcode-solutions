// https://leetcode.com/problems/longest-consecutive-sequence

class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hash = new HashSet<>();
        for(int i : nums){
            hash.add(i);
        }
        int n = nums.length;
        int cout = 0;
        for(int i = 0; i<n ; i++){
            if (hash.contains(nums[i]-1)){
                continue;
            }
            else{
                int count =1;
                int p = nums[i];
                while(hash.contains(p+1)){
                    count++;
                    p = p+1; 
                }
                cout = Math.max(count, cout);
            }
            
        }
        return cout;
        
    }
}