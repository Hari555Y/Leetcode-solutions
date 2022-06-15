// https://leetcode.com/problems/check-if-word-equals-summation-of-two-words

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int f =0; int s =0;
        int t  = 0;
        for(char  c : firstWord.toCharArray()){
            f = 10*f  + (c-'a');
        }
        for(char  c : secondWord.toCharArray()){
            s = 10*s  + (c-'a');
        }
        for(char  c : targetWord.toCharArray()){
            t = 10*t + (c-'a');
        }
        if(f+s == t){
            return true;
        }
        return false;
    }
}