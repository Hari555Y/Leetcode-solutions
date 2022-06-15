// https://leetcode.com/problems/most-frequent-number-following-key-in-an-array

class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0 ;i <nums.length -1; i++){
            if(nums[i]==key){
                hash.put(nums[i+1] , hash.getOrDefault(nums[i+1], 0)+1);
            }
            
        }
        int max = -1;
        int ans = -1;
        for(int i  : hash.keySet()){
            if (hash.get(i)>max){
                ans = i;
                max = hash.get(i);
            }
        }
        return ans;
    }
}