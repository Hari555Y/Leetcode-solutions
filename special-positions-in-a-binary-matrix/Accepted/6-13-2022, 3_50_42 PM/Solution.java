// https://leetcode.com/problems/special-positions-in-a-binary-matrix

class Solution {
    public int numSpecial(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int[] col= new int[m];
        int[] row = new int[n];
        for(int i  =0; i<n ; i++){
            int c =0;
            for(int j =0; j<m; j++)
            {
                if(nums[i][j]==1){
                    c++;
                }
            }
            row[i] = c;
            
        }
        for(int i  =0; i<m; i++){
            int c =0;
            for(int j =0; j<n; j++)
            {
                if(nums[j][i]==1){
                    c++;
                }
            }
            col[i] = c;
            
        }
        int count =0;
        for(int i =0; i<n ; i++){
            for(int j =0; j<m ; j++){
                if (row[i]==1 && col[j]==1 && nums[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}