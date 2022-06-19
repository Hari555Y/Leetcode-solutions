// https://leetcode.com/problems/count-servers-that-communicate

class Solution {
    public int countServers(int[][] grid) {
        int m  =grid.length;
        int n = grid[0].length;
        Map<Integer,Integer> col = new HashMap();
        Map<Integer,Integer> row = new HashMap();
        
        for(int i= 0; i<m; i++){
            for (int j =0; j<n; j++){
                if (grid[i][j]==1){
                    row.compute(i,(k,v) -> v==null?1:v+1);
                    col.compute(j,(k,v) -> v==null?1:v+1);
                }
            }
        }
        int count=0;
        for (int i =0; i< m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j]==1 &&(row.get(i)!=1 || col.get(j)!=1)){
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