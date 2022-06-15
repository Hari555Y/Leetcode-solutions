// https://leetcode.com/problems/subarray-sum-equals-k

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count =0;
        HashMap<Integer,Integer> hash =new HashMap<>();
        hash.put(0, 1);  
        int sum =0;
       // int[] pre = new int[n];
        //pre[0]= nums[0];
        for(int i =0 ; i<n ; i++){
            sum+=nums[i];
            if (hash.containsKey(sum-k)){
                count += hash.get(sum-k);
            }
            hash.put(sum, hash.getOrDefault(sum , 0)+1);
            
        }
        return count;
        
    }
}