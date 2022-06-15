// https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int i =0;
        while(i<n){
            if(nums[i]==1){
                int z = i;
                i++;
                for(;i<Math.min(n , z+k+1) ; i++){
                    if (nums[i]==1){
                        System.out.println(i);
                        return false;
                    }
                    
                }
            }
            else
             i++;
        }
        return true;
        
    }
}