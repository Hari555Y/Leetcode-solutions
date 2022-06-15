// https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome

class Solution {
    // public static void minoper(int a, int b){
    //     a = Math.min(a, b);
    // }
    public int minInsertions(String s) {
        int a = s.length();
        int ans = 1000000007;
        int[][] dp = new int[a][a];     
        int inf = 1000000007;
        for(int i =0; i<a; i++){
            for(int j =0; j<a; j++){
                dp[i][j] = 1000000007;
            }
        }
        dp[0][a-1] =0;
        for(int l =0; l<a; l++){
            for(int r = a-1; r>=l; r--){
                int ds = dp[l][r];
                if(l==r){
                    ans = Math.min(ans, ds);
                    System.out.println(ans);
                    continue;
                }
                if(s.charAt(l)==s.charAt(r)){
                    if(l+1 ==r){
                        ans = Math.min(ans, ds);
                        System.out.println(ans);
                        continue;
                    }
                    dp[l+1][r-1] = Math.min(dp[l+1][r-1] , ds);
                    
                    
                }
                else{
                    dp[l+1][r]= Math.min(dp[l+1][r] , ds+1);
                    dp[l][r-1] = Math.min(dp[l][r-1] , ds+1);

                    
                }
                
                
            }
        }
        return ans;
        
    }
}