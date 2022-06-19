// https://leetcode.com/problems/number-of-segments-in-a-string

class Solution {
    public int countSegments(String s) {
        int count =0;
        for (int  i=0; i<s.length();i++){
            if (s.charAt(i)==' '){
                count =count+1;
            }
            
        }
        return count+1;
        
        
        
    }
}