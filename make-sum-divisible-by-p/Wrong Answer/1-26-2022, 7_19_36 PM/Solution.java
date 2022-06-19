// https://leetcode.com/problems/make-sum-divisible-by-p

class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int[] ps = new int[n];
        long sum = 0;
        for(int i =0; i<n; i++){
            sum = ((long)sum+(long)nums[i])%(long)p;
            ps[i] = (int)sum;
            
        }
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0, -1);
        if(ps[n-1]==0){
            return 0;
        }
        int max = n;
        for(int i =0; i<n; i++){
            if (hash.get(0)==-1 && ps[i]==0){
                max = Math.max(max, i+1);
                hash.put(0,i);
            }
            else if (hash.containsKey(ps[i])){
                max = Math.min (max, i- hash.get(ps[i])-1);
                hash.put(ps[i], i);
            }
            else{
                hash.put(ps[i], i);
            }
            
        }return max == n ? -1 : max;
        
        
    }
}