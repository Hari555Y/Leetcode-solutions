// https://leetcode.com/problems/percentage-of-letter-in-string

class Solution {
    public int percentageLetter(String s, char letter) {
        int n = s.length();
        int c =0;
        for(char p  : s.toCharArray()){
            if (p==letter){
                c++;
            }
        }
        return (c*100)/n;
        
    }
}