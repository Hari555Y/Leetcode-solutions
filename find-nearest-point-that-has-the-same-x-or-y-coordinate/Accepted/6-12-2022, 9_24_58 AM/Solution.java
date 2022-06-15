// https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate

class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int n = points.length;
        int max = Integer.MAX_VALUE;
        int ind = -1;
        for(int i =0; i<n ; i++){
            if(points[i][0]== x || points[i][1]==y){
                if (Math.abs(points[i][0]- x) + Math.abs( points[i][1]-y)<max){
                    max = Math.abs(points[i][0]- x) + Math.abs( points[i][1]-y);
                    ind = i;
                }
            }
            
        }
        
        
        
        
        
        return ind;
        
    }
}