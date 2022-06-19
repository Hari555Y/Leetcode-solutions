// https://leetcode.com/problems/beautiful-arrangement

class Solution {
    public int countArrangement(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int round = 1;
        for (int i =1 ; i<n+1; i++){
            round = round * (n/i);
            
        }
        return round;
        
    }
}