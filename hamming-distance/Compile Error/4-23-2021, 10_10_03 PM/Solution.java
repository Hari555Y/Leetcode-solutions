// https://leetcode.com/problems/hamming-distance

class Solution {
    public int hammingDistance(int x, int y) {
        int ref = x^y;
        return bitCount(ref);
        
    }
}