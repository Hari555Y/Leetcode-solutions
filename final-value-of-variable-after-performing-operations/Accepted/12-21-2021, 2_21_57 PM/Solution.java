// https://leetcode.com/problems/final-value-of-variable-after-performing-operations

class Solution {
    public int finalValueAfterOperations(String[] o) {
        int count =0;
        for(String s: o){
            if(s.charAt(0)=='+'||s.charAt(2)=='+'){
                count++;
            }
            else{
                count--;
            }
        }
        return count;
        
        
    }
}