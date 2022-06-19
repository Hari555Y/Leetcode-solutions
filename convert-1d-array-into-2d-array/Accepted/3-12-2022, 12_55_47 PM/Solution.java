// https://leetcode.com/problems/convert-1d-array-into-2d-array

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int len = original.length;
        int mat[][] = new int[m][n];
        if(len !=m*n){
            int[][] arr = {};
            return arr;
        }
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                mat[i][j] = original[i*n + j];
            }
        }
        return mat;
        
    }
}