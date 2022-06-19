// https://leetcode.com/problems/valid-perfect-square

class Solution {
    public boolean isPerfectSquare(int num) {
        double d = Math.sqrt(num);
        int p = (int)d;
        return p==d;
        
        
    }
}