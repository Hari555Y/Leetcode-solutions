// https://leetcode.com/problems/determine-color-of-a-chessboard-square

class Solution {
    public boolean squareIsWhite(String coordinates) {
        int count =0;
        count+=(coordinates.charAt(0)-'a');
        count+= (Character.getNumericValue(coordinates.charAt(1)));
        return count%2==0;
        
    }
}