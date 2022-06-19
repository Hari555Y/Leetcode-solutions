// https://leetcode.com/problems/count-servers-that-communicate

class Solution {
    public int countServers(int[][] grid) {
        int m  =grid.length;
        int n = grid[0].length;
        int[] rowlen = new int[m];
        int[] collen = new int[n];
        
        for(int i= 0; i<m; i++){
            for (int j =0; j<n; j++){
                if (grid[i][j]==1){
                    rowlen[i]++;
                    collen[j]++;
                }
            }
        }
        int count=0;
        for (int i =0; i< m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j]==1 &&(rowlen[i]!=1 || collen[j]!=1)){
                    count +=1;
                }
                else{
                    continue;
                }
                
            }
        }
        return count;      
        
    }
}