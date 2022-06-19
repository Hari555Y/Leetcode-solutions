// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> amp = new HashMap<Integer,Integer>();
        for (int i =0; i<nums.length; i++){
            int grte = target-nums[i];
            if (amp.containsKey(grte)){
                int[] toret = new int[2];
                toret[0] = i;
                toret [1] = amp.get(grte);
                return toret;
                
                
            }
            
            
            amp.put(nums[i], i);
            
            
        }
        return null;
        
    }
}