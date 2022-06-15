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
        for(int i =0; i <m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(mat[i][j]!=0){
                    bfs(i , j, i , j);
                    
                }
            }
        }
        return dp;
        
        
    }
    public void bfs(int a , int b, int i , int j){
        Queue<Integer> q = new LinkedList<>();
        q.add(a);
        q.add(b);
        int count =0;
        while(!q.isEmpty()){
            while(!q.isEmpty()){
                int m= q.poll();
                int n= q.poll();
                if (dp[m][n]!=999999)
                    dp[i][j] = Math.min(count + dp[m][n] , dp[i][j]);
            }
            if (dp[i][j]==999999){
                if (a+1<dp.length){
                    q.add(a+1);
                    q.add(b);
                }
                if(b+1 < dp[0].length){
                    q.add(a);
                    q.add(b+1);
                }
                if (a-1>=0){
                    q.add(a-1);
                    q.add(b);
                }
                if (b-1>=0){
                    q.add(a);
                    q.add(b-1);
                }
            }
            count++;
            
        }
        
        
    }
}