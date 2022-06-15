// https://leetcode.com/problems/lucky-numbers-in-a-matrix

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
                List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int n  = matrix.length;
        int m = matrix[0].length;
        for(int i =0; i<n ; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<m; j++){
                min = Math.min(min,matrix[i][j]);
                
            }
            a.add(min);
            
        }
        for(int i =0; i<m ; i++){
            int min = Integer.MIN_VALUE;
            for(int j=0; j<n; j++){
                min = Math.max(min,matrix[j][i]);
                
            }
            b.add(min);
            
        }
        for(int i =0; i<n ; i++){
            for(int j =0; j<m ; j++){
                if (matrix[i][j] == a.get(i) && matrix[i][j] == b.get(j)){
                   // count++;
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;

        
    }
}