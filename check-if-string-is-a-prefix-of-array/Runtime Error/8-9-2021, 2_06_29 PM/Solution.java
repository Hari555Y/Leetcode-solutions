// https://leetcode.com/problems/check-if-string-is-a-prefix-of-array

class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int len = s.length();
        String sb = "";
        int i =0;
        while(sb.length()<len){
            sb+=words[i++];
        }
        return sb.equals(s)? true : false;
    }
}