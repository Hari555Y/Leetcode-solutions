// https://leetcode.com/problems/01-matrix

class Solution {
    int[][] dp;
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        dp = new int[m][n];
        for(int i =0 ; i<m; i++){
            for(int j  =0 ; j<n ; j++){
                if(mat[i][j]==0){
                    dp[i][j] =0;
                }
                else{
                    dp[i][j] =999999;
                }
            }
        }
        bfs(mat);
        return dp;
        
        
    }
    public void bfs(int[][] mat){
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<mat.length; i++){
            for(int j =0; j<mat[0].length; j++){
                if(mat[i][j]==0){
                    q.add(i);
                    q.add(j);
                }
            }
        }
        while(!q.isEmpty()){
            int m= q.poll();
            int n= q.poll();
            for(int i =-1; i<=1; i++){
                for(int j = -1; j<=1; j++){
                    if(m+i >=0 && m+i <mat.length && n+j>=0 &&
                      n+j <mat[0].length && Math.abs(i+j)==1){
                        if(dp[m+i][n+j] >dp[m][n] +1){
                            dp[m+i][n+j]= dp[m][n]+1;
                            q.add(m+i);
                            q.add(n+j);
                        }
                    }
                }
            }
            
            
            
        }
        
        
    }
}