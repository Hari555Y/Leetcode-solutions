// https://leetcode.com/problems/make-sum-divisible-by-p

class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int[] ps = new int[n+1];
        int sum = 0;
        for(int i =0; i<n; i++){
            sum = (sum+nums[i])%p;
            ps[i+1] = sum;
            
        }
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0, 0);
        int max = n;
        for(int i =1; i<n+1; i++){
            if (hash.containsKey(ps[i])){
                max = Math.min (max, i- hash.get(ps[i])-1);
                hash.put(ps[i], i);
            }
            else{
                hash.put(ps[i], i);
            }
            
        }return max == n ? -1 : max;
        
        
    }
}