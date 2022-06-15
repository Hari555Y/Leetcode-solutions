// https://leetcode.com/problems/surface-area-of-3d-shapes

class Solution {
    public int surfaceArea(int[][] grid) {
        int sum =0;
        int n = grid.length;
        for(int i =0; i<n; i++){
            for(int j =0; j<n ;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1)
                    sum += 2*(grid[i][j]);
                if(grid[i][j]>0){
                    sum+=2;
                }
            }
        }
        for(int i =0; i<n; i++){
            for(int j =0; j<n ; j++){
                if (i-1>=0){
                    sum += grid[i][j]>grid[i-1][j] ? grid[i][j]-grid[i-1][j] : 0;
                    
                }
                if (j-1>=0){
                    sum += grid[i][j]>grid[i][j-1] ? grid[i][j]-grid[i][j-1] : 0;
                    
                }
                if (i+1<n){
                    sum += grid[i][j]>grid[i+1][j] ? grid[i][j]-grid[i+1][j] : 0;
                    
                }
                if (j+1<n){
                    sum += grid[i][j]>grid[i][j+1] ? grid[i][j]-grid[i][j+1] : 0;
                    
                }
            }
        }
        return sum;
        
    }
}