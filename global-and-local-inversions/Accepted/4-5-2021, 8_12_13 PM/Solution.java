// https://leetcode.com/problems/global-and-local-inversions

class Solution {
    public boolean isIdealPermutation(int[] A) {
        for (int i = 0; i < A.length; i++)
            if (i - A[i] > 1 || i - A[i] < -1) return false;
        return true;
        
    }
}