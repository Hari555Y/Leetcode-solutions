// https://leetcode.com/problems/is-subsequence

class Solution {
    public boolean isSubsequence(String t, String s) {
        int sp =0;
        int tp =0;
        while(sp<s.length()){
            if (tp == t.length()){
                return true;
            }
            else if (s.charAt(sp) == t.charAt(tp)){
                sp++;
                tp++;
            }
            else{
                sp++;
            }
        }
        return tp==t.length();
        
    }
}