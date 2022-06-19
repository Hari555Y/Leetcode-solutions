// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix

class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if (grid[m-1][n-1] >=0){
            return 0;
        }
        int count=0;
        for (int i=0; i<m ;i++){
            for (int j =0; j<n; j++){
                if (grid[i][j]<0){
                    count+=1;
                }
                else{
                    continue;
                    
                }
            }
        }
        return count;
    }
}