// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position

class Solution {
    public int minCostToMoveChips(int[] position) {
        int c_odd = 0;
        int c_even = 0;
        for(int i : position){
            if(i%2==0){
                c_even ++;                
            }
            else{
                c_odd++;               
            }
        }
        return Math.min(c_even , c_odd);
        
        
    }
}