// https://leetcode.com/problems/nim-game

class Solution {
    public boolean canWinNim(int n) {
        if(n>=5){
            return true;
        }
        if(n==4){
            return false;
        }
        return true;
        
    }
}