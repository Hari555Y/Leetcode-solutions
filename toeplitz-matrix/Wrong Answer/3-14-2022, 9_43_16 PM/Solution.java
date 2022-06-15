// https://leetcode.com/problems/toeplitz-matrix

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length; int n = matrix[0].length;
        int eq = matrix[0][0];
        for(int i =0; i <Math.min(m, n); i++){
            if(matrix[i][i] !=eq){
                return false;
            }
        }
        return true;
        
        
    }
}