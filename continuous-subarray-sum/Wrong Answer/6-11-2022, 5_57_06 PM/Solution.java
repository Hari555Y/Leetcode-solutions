// https://leetcode.com/problems/continuous-subarray-sum

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] pre = new int[n];
        long sum =0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i =0; i<n ; i++){
            sum +=(long)nums[i];
            pre[i] = (int)(sum%(long)k);
            
        }
      ///  hash.put(0, -1);
        for(int i =0; i<n ; i++){
            if (hash.containsKey(pre[i])){
                if (hash.get(pre[i])+1 <= pre[i] && (i!=0) ){
                    return true;
                    
                }
            }
            else{
                hash.put(pre[i], i);
            }
        }
        return false;
                                                
        
    }
}