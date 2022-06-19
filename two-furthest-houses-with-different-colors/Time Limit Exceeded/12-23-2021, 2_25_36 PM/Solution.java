// https://leetcode.com/problems/two-furthest-houses-with-different-colors

class Solution {
    public int maxDistance(int[] colors) {
        return maxi(colors, 0, colors.length-1);
    }
    public int maxi(int[] colors, int i , int j){
        if (i==j){
            return 0;
        }
        if(colors[i]!=colors[j]){
            return j -i;
        }
        return Math.max(maxi(colors, i+1, j), maxi(colors, i, j-1));
        
    }
}