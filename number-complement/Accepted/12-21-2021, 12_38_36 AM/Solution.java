// https://leetcode.com/problems/number-complement

class Solution {
    public int findComplement(int num) {
        int nb = (int)(Math.log(num)/Math.log(2))+1;
        return ((1<<nb)-1)^num;
    }
}