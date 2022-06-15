// https://leetcode.com/problems/n-repeated-element-in-size-2n-array

class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i : nums){
            if(hash.contains(i)){
                return i;
            }
            hash.add(i);
        }
        return 1;
        
    }
}