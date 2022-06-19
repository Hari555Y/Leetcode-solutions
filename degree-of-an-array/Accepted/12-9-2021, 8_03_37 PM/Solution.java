// https://leetcode.com/problems/degree-of-an-array

class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int max = 0;
        for (int i :nums){
            hash.put(i, hash.getOrDefault(i, 0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int p :hash.keySet()){
            max = Math.max(max , hash.get(p));
            
        }
        for (int x : hash.keySet()){
            if (hash.get(x)==max){
                arr.add(x);
            }
        }
        int ans = 99999;
        for (int i : arr){
            ans = Math.min(ans , fun(i, nums));
            
        }
        return ans;    
    }
    public static int fun(int a, int[] nums){
        int count =nums.length;
        for (int i=0; i<nums.length; i++){
            if (nums[i] != a){
                count--;
                
            }
            else{
                break;
            }
        }
        for (int i = nums.length -1; i>=0; i--){
            if (nums[i]!=a){
                count--;
            }
            else{
                break;
            }
        }
        return count;
        
    }
}