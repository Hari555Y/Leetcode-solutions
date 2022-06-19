// https://leetcode.com/problems/number-of-islands

class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
       
        int ans=0;
        boolean visited[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    count(grid,i,j,visited);
                    ans++;
                }   
            }
        }
        return ans;
    }
    public void count(char[][] grid,int i,int j,boolean [][] visited){
        if(i<0 || j<0 || j>=grid[0].length || i>=grid.length || grid[i][j]=='0' || visited[i][j]==true){
            return;
        }
        visited[i][j]=true;
        count(grid,i,j+1,visited);
        count(grid,i,j-1,visited);
        count(grid,i+1,j,visited);
        count(grid,i-1,j,visited);
    }
}