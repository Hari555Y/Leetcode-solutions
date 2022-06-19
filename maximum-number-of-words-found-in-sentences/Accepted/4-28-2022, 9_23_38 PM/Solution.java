// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences

class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = -1;
        for(String s : sentences){
            ans = Math.max(ans, s.split(" ").length);
        }
        return ans;
        
    }
}