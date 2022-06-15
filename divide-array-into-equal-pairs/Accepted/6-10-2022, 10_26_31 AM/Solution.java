// https://leetcode.com/problems/divide-array-into-equal-pairs

class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i : nums){
            hash.put(i, hash.getOrDefault(i ,0)+1);
        }
        for(int i : hash.keySet()){
            if (hash.get(i)%2!=0){
                return false;
            }
        }
        return true;
        
        
        
    }
}