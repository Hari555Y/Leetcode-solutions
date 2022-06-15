// https://leetcode.com/problems/subarray-product-less-than-k

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count =0;
        int n = nums.length;
        int i =0; 
        int j =0;
        long prod =1L;
        while(j<n){
          prod*=(long)nums[j];
            while (i<n && prod>=k){
             prod/=(long)nums[i];
             i++;
            }//j++;
            //j =Math.max(j,i);
          //  else{
                if (i>j){
                    j = i;
                    continue;
                }
                count += (j-i+1);
                j++;
         //   }
        }
        return count;
        
        
    }
}