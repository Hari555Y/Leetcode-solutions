// https://leetcode.com/problems/rectangle-overlap

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0]; int y1 = rec1[1];
        int x2 = rec1[2]; int y2 = rec1[3];
  int x11 = rec2[0]; int y11 = rec2[1];
        int x21 = rec2[2]; int y21 = rec2[3];
        if (x1<x11 && x2>x11 || (y1<y11 && y11<y2)){
            return true;
        }
        if (x1<x11 && x2>x11 ||( y1<y21 && y21<y2)){
            return true;
        }
        if (x1<x21 && x2>x21 || (y1<y11 && y11<y2)){
            return true;
        }
        if (x1<x21 && x2>x21 || (y1<y21 && y21<y2)){
            return true;
        }
        return false;
    }
}