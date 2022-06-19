// https://leetcode.com/problems/island-perimeter

class Solution {
    public int islandPerimeter(int[][] grid) {
        int count =0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i =0; i<row; i++){
          //  int rope=0;
            
            for (int j=0; j<col;j++){
                if (grid[i][j] == 1){
                    if (j-1>=0){
                        if (grid[i][j-1]==1){
                            count= count-1;
                        }
                        
                    }
                    if (i-1>=0){
                        if (grid[i-1][j]==1){
                            count= count-1;
                        }
                        
                    }
                    if (j<col-1){
                        if (grid[i][j+1]==1){
                            count= count-1;
                        }
                        
                    }
                    if (i<row-1){
                        if (grid[i+1][j]==1){
                            count= count-1;
                        }
                        
                    }
                    count+=4;
                }
                
            }
        }
        return count;
        
        
        
        
    }
}