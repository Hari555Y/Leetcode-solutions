// https://leetcode.com/problems/maximum-erasure-value

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n];
        for(int i  =0 ; i<n ; i++){
            if (i>0){
                pref[i] = pref[i-1];
            }
            pref[i] +=nums[i];
        }
        HashMap<Integer,Integer> hash = new HashMap<>();
        int s = 0;
        int sum  = 0;
        for(int i =0; i<n; i++){
            s = Math.max(s, hash.get(nums[i])!=null ? hash.get(nums[i])+1 : 0);
            sum = Math.max(sum , (s==0) ? pref[i] : pref[i] - pref[s-1]);
            hash.put(nums[i] , i);
            
            
        }
        return sum;
    }
}