// https://leetcode.com/problems/sign-of-the-product-of-an-array

class Solution {
    public int arraySign(int[] nums) {
        long prod = 1;
        for(int  i : nums){
            prod*=(long)i;
        }
        if (prod ==0L)
            return 0;
        else if (prod<0L){
            return -1;
        }
        return 1;
        
    }
}