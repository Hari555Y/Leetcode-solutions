// https://leetcode.com/problems/ugly-number-ii

class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        int a =1;
        int b = 1;
        int c = 1;
        for(int i = 2 ; i<=n; i++){
            int s = 2*dp[a];
            int t = 3*dp[b];
            int u = 5*dp[c];
            int m = Math.min(s , Math.min(t, u));
            dp[i]= m;
            if (m==s)
                a++;
            if (m == t)
                b++;
            if (u == m)
                c++;
        }
        return dp[n];
    }
}