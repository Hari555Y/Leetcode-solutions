// https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers

class Solution {
    public boolean checkValid(int[][] mat) {
        int n  = mat.length;
        for(int i =0; i<n; i++){
            for(int j =0; j<n ; j++){
                if(mat[i][j]<1 || mat[i][j]>n){
                    return false;
                    
                }
            }
        }
        for(int i =0; i<n; i++){
            HashSet<Integer> hash = new HashSet<>();
            for(int j =0; j<n; j++){
                hash.add(mat[i][j]);
                
            }
            if (hash.size()!=n){
                return false;
            }
        }
        for(int i =0; i<n; i++){
            HashSet<Integer> hash = new HashSet<>();
            for(int j =0; j<n; j++){
                hash.add(mat[j][i]);
                
            }
            if (hash.size()!=n){
                return false;
            }
        }
        
        
        
        
        return true;
        
        //boolean bool = true;
        
        
    }
}