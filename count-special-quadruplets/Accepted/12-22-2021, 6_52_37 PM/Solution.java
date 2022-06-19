// https://leetcode.com/problems/count-special-quadruplets

class Solution {
    public int countQuadruplets(int[] nums) {
        int count=0;
        int n = nums.length;
        for(int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){
                for(int k =j+1; k<n;k++){
                    for(int g =k+1; g<n; g++){
                        if(nums[i]+ nums[j]+ nums[k]==nums[g])
                            count++;
                        
                    }
                }
            }        }
return count;        
    }
}