// https://leetcode.com/problems/check-if-it-is-a-straight-line

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if(n<=2){
            return true;
        }
        boolean bool = true;
        for(int i =1; i<n; i++){
            if (coordinates[i][1]-coordinates[i-1][1]!=0){
                bool = false;
            }
        }
        if (bool = true){
            return true;
        }
        double d = (coordinates[0][1] - coordinates[1][1])/(coordinates[0][0] - coordinates[1][0]);
        for(int i=1; i<n-1; i++){
            double s = (coordinates[i][1] - coordinates[i+1][1])/(coordinates[i][0] -coordinates[i+1][0]);
            if(d!=s){
                return false;
            }
        }
        
        
        return true;
        
        
    }
}