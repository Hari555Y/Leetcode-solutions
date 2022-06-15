// https://leetcode.com/problems/toeplitz-matrix

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length; int n = matrix[0].length;
   //     int eq = matrix[0][0];
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i =0; i <m; i++){
            for(int j =0; j<n ; j++){
                if(hash.containsKey(i-j)){
                    if (hash.get(i-j)!=matrix[i][j]){
                        return false;
                    }
                }
                else{
                    hash.put(i-j , matrix[i][j]);
                }
                
            }
        }
        return true;
        
        
    }
}