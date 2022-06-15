// https://leetcode.com/problems/number-of-equivalent-domino-pairs

class Solution {
    public int numEquivDominoPairs(int[][] d) {
        int n = d.length;
        int count =0;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if((d[i][0]==d[j][0] && d[i][1]==d[j][1]) ||(d[i][0]==d[j][1] && d[i][1]==d[j][0]) ){
                    count++;
                }
            }
        }
        return count;
        
    }
}