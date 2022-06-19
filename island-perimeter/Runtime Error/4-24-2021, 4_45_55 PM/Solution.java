// https://leetcode.com/problems/island-perimeter

class Solution {
    public int islandPerimeter(int[][] grid) {
        int count =0;
        int row = grid.length;
        int col = grid[0].length;
    //    HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i =0; i<row; i++){
            int rope=0;
            
            for (int j=0; j<col;j++){
                if (grid[i][j] == 1){
                 //   hs.add(rope,i);
                    count+=4;
                }
                if (grid[i][j]==1&& grid[i][j+1]==1){
                    count -=2;
                }
             //   if ()
                
                
             //   rope++;
                
            }
        }
        for (int i =1; i<row;i++){
            for (int j =0; j<col;j++){
                if (grid[i][j]==1&& grid[i-1][j]==1){
                    count-=2;
                }
                
            }
        }
        return count;
        
        
        
        
    }
}