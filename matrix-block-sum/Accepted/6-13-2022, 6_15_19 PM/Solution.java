// https://leetcode.com/problems/matrix-block-sum

class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int ROWS = mat.length;
        int COLS = mat[0].length;
        int [][] dp = new int [ROWS + 1][COLS + 1];
        int [][] res = new int [ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                dp[i + 1][j + 1] = dp[i + 1][j] + dp[i][j + 1] + mat[i][j] - dp[i][j];
            }
        }
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                int r1 = Math.max(0, i - k);
                int c1 = Math.max(0, j - k);
                int r2 = Math.min(ROWS - 1, i + k);
                int c2 = Math.min(COLS - 1, j + k);
                res[i][j] = calculateSum(dp, r1, c1, r2, c2);
            }
        }
        return res;
    }
    
    public int calculateSum(int [][] dp, int r1, int c1, int r2, int c2) {
        return dp[r2 + 1][c2 + 1] - dp[r1][c2 + 1] - dp[r2 + 1][c1] + dp[r1][c1];
    }
    
}