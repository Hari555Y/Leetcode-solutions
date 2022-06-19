// https://leetcode.com/problems/matrix-diagonal-sum

class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        if(m==0){
            return 0;
        }
        if(m==1){
            return mat[0][0];
        }
        int ans =0;
        for(int i =0; i<m; i++){
            for(int j =0; j<m; j++){
                if(i==j || i+ j ==m-1){
                    ans+= mat[i][j];
                }
            }
        }
        if (m%2==0)
            return ans;
        else
            return ans;
        
    }
}