// https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number

class Solution {
    public long[] sumOfThree(long num) {
        long[] ans = new long[3];
        long p = num/3;
        if ( num  == 3L* (long)p){
            ans[0] = p -1L;
            ans[1] = p;
            ans[2] = p+ 1L;
            return ans;
        }
        else{
            return new long[0];
        }
        
        
    }
}