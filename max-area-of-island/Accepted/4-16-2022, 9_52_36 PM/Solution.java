// https://leetcode.com/problems/max-area-of-island

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        int sz = 0;
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(grid[i][j]==1)
                    sz = dodfs(grid, i,j);
                ans = Math.max(sz, ans);
            } 
        }
        return ans; 
    }
    
    public int dodfs(int[][] a, int row, int col){
        if(row<0||row>=a.length||col<0||col>=a[0].length){
            return 0;
        }
        if(a[row][col]==0 ){
            return 0;
        }
        a[row][col]=0;
        int size =1;
        size+=dodfs(a, row, col+1);
        size+=dodfs(a, row, col-1);
        size+=dodfs(a, row+1, col);
        size+=dodfs(a, row-1, col);
        return size;
        
    }
}