// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word

class Solution {
    public int numOfStrings(String[] p, String w) {
        int count =0;
        for(String s: p){
            if(w.contains(s))
                count++;
        }return count;
        
    }
}