// https://leetcode.com/problems/climbing-stairs

class Solution {
    public int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        else{
            return climbstairs(n-1) + climbstairs(n-2);
        }
        
    }
}