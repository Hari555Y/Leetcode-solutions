// https://leetcode.com/problems/surface-area-of-3d-shapes

class Solution {
    public int surfaceArea(int[][] grid) {
        int sum =0;
        int n = grid.length;
        for(int i =0; i<n ; i++){
            for(int j  =0 ; j<n ; j++){
                sum += (i-1>=0)? Math.max(0, grid[i][j]-grid[i-1][j]) : grid[i][j];
                sum += (i+1<n)? Math.max(0, grid[i][j]-grid[i+1][j]) : grid[i][j];
                sum += (j-1>=0)? Math.max(0, grid[i][j]-grid[i][j-1]) : grid[i][j];
                sum += (j+1<n)? Math.max(0, grid[i][j]-grid[i][j+1]) : grid[i][j];
                if(grid[i][j]>0){
                    sum+=2;
                }
            }
        }
        return sum;
        
    }
}