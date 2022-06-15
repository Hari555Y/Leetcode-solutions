// https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero

class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
       // int[] pref = new int[n];
        HashMap<Integer,Integer> hash = new HashMap<>();
        int s=0;
        for(int i=0 ; i<n; i++){
            s+=nums[i];
            hash.put(s , i);
        }
        int find =  s-x;
        int ans = Integer.MIN_VALUE;
        if (find<0){
            return -1;
        }
        hash.put(0 , -1);
        s =0;
        for(int i =0; i<n ; i++){
            s+=nums[i];
            if (hash.containsKey(s-find)){
                ans = Math.max(ans, i- hash.get(s-find));
            }
        }
        return ans == (int)Integer.MIN_VALUE ? -1 : n - ans;
        
        
        
    }
}