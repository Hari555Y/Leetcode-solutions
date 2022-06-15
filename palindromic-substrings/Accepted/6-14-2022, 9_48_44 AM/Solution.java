// https://leetcode.com/problems/palindromic-substrings

class Solution {
    public int countSubstrings(String A) {
        int n = A.length();
        boolean[][] dp = new boolean[n][n];
        int[][] ans = new int[n][n];       
        for(int i =0; i<n; i++){
            dp[i][i] = true;
            ans[i][i] = 1;
            
        }
        for(int i =0; i<n-1; i++){
            if (A.charAt(i)==A.charAt(i+1)){
                dp[i][i+1]= true;
                ans[i][i+1] = 2;
                
            }
        }
        for(int gap =1; gap<n; gap++){
            for(int i =0; i<n-gap; i++){
                int j = i+gap;
                if(A.charAt(i)==A.charAt(j) && dp[i+1][j-1] == true){
                    dp[i][j] = true;
                }
                if(dp[i][j] == true){
                    ans[i][j] = ans[i][j-1] + ans[i+1][j] - ans[i+1][j-1] +1;
                    
                }
                else{
                 ans[i][j] = ans[i][j-1] + ans[i+1][j] - ans[i+1][j-1] ;
                    
                }
            }
        }
        return ans[0][n-1];
        
    }
}