// https://leetcode.com/problems/second-largest-digit-in-a-string

class Solution {
    public int secondHighest(String s) {
        int fir = -1;
        int sec = -1;
        for(char c: s.toCharArray()){
            if (c>='0' && c<='9'){
            int j =  c- '0';//Character.getNumericValue(c);
            if(j>fir){
                sec  = fir;
                fir = j;
            }
            else if (j>sec && j != fir){
                sec = j;
            }}
            
        }
        return sec;
        
    }
}