// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        for(String s: word1){
            a+=s;
        }
        String b = "";
        for(String d : word2){
            b+=d;
        }
        return a.compareTo(b)==0;
        
    }
}