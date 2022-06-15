// https://leetcode.com/problems/burst-balloons

class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        if (n==0){return 0;}
        int[][] dp = new int[n][n];
        for(int L = n-1; L>=0; L--){
            for(int R = L; R<n; R++){
                for(int i = L; i<=R; i++){
                    dp[L][R] = Math.max(dp[L][R] , 
                                       
                          (L==0 ? 1 : nums[L-1])*nums[i]*(R==n-1 ? 1 : nums[R+1]) + 
                                      (i-1>=L ? dp[L][i-1] : 0 ) + (i+1 <=R? dp[i+1][R] : 0 ));
                }
            }
        }
        
        
        
        return dp[0][n-1];
        
    }
}