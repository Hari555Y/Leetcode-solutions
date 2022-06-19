// https://leetcode.com/problems/count-servers-that-communicate

class Solution {
    public int countServers(int[][] grid) {
        int m  =grid.length;
        int n = grid[0].length;
        int[] rowlen = new int[m];
        int[] collen = new int[n];
        
        for(int i= 0; i<n-1; i++){
            for (int j =0; j<m-1; j++){
                if (grid[i][j]==1){
                    rowlen[i]++;
                    collen[j]++;
                }
            }
        }
        int count=0;
        for (int i =0; i< n-1; i++){
            for (int j=0; j<m-1; j++){
                if (grid[i][j]==1 &&(rowlen[i]!=1 || collen[i]!=1)){
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