// https://leetcode.com/problems/max-number-of-k-sum-pairs

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            hash.put(nums[i],hash.getOrDefault(nums[i], 0)+1);    
        }  
        int count =0;
        for(int p : hash.keySet()){
            if(hash.containsKey(k-p)){
                count  += Math.min(hash.get(p), hash.get(k-p));
            }
        }
        return count/2;
    }
}