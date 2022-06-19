// https://leetcode.com/problems/factorial-trailing-zeroes

class Solution {
    public int trailingZeroes(int n) {
        int tot =0;
        for (int i =5; i<=n; i =i*5){
            tot += n/5;
        }
        return tot;
        
    }
}