// https://leetcode.com/problems/find-lucky-integer-in-an-array

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int ans = -1;
        for(int i  : arr){
            hash.put(i, hash.getOrDefault(i , 0)+1);
            
        }
        for(int i : hash.keySet()){
            if (i== hash.get(i)){
                ans = Math.max(ans, i);
            }
            
        }
        return ans;
        
    }
}