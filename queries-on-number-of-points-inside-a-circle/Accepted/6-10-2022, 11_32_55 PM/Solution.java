// https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = points.length;
        int p = queries.length;
        int[] ans = new int[p];
        int j =0;
        for(int[] a : queries){
            int r = a[0]; int c = a[1] ; int rad = a[2];
            int count =0;
            for(int[] x : points){
                int r1 = x[0];
                int c1 = x[1];
                if (rad*rad >= (r-r1)*(r-r1) + (c-c1)*(c-c1)){
                    count++;
                }
                
            }
            ans[j++] = count;
        }
        return ans;
    }
}