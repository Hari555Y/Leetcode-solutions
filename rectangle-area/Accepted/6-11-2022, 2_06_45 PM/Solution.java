// https://leetcode.com/problems/rectangle-area

class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int ans = (ax2-ax1)*(ay2-ay1) + (bx2-bx1)*(by2-by1);
        if (bx2>ax1 && ax2>bx1 && by2>ay1 && by1<ay2){
            ans -= (Math.min(ax2, bx2) -Math.max(ax1, bx1))*(Math.min(ay2, by2) -Math.max(ay1, by1));
        }
        return ans;
    }
}