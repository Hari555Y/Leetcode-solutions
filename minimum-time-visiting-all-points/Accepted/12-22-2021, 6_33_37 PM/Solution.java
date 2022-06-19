// https://leetcode.com/problems/minimum-time-visiting-all-points

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int count =0;
        int n = points.length;
        for(int i =1; i<n; i++){
            int a = Math.abs(points[i][0]-points[i-1][0]);
            int b = Math.abs(points[i][1] -points[i-1][1]);
            count +=Math.max(a,b);
            
        }
        return count;
    }
}