// https://leetcode.com/problems/sign-of-the-product-of-an-array

class Solution {
    public int arraySign(int[] nums) {
        int prod = 1;
        for(int  i : nums){
            prod*=i;
        }
        if (prod ==0)
            return 0;
        else if (prod<0){
            return -1;
        }
        return 1;
        
    }
}