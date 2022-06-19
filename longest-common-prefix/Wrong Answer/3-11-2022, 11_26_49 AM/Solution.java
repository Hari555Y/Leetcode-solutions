// https://leetcode.com/problems/longest-common-prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        int t = 0;
        int len = strs.length;
        for(int p= 0; p<s.length(); p++){
            boolean bool = true;
            for(int i =0; i<len; i++){
                if(p>=strs[i].length()){
                    bool = false;
                    break;
                }
                else{
                    bool = (s.charAt(p) == strs[i].charAt(p))? true : false;

                }
            }
            if(bool == false)
                break;
            else{
                t++;
            }
        }
        return s.substring(0, t);
        
    }
}