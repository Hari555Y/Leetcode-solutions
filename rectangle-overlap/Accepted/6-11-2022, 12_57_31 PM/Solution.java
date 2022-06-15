// https://leetcode.com/problems/rectangle-overlap

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0]; int y1 = rec1[1];
        int x2 = rec1[2]; int y2 = rec1[3];
  int x11 = rec2[0]; int y11 = rec2[1];
        int x21 = rec2[2]; int y21 = rec2[3];
        return x21>x1 && x11<x2 && y11<y2 && y1<y21;
    }
}