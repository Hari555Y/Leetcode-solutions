// https://leetcode.com/problems/find-smallest-letter-greater-than-target

class Solution {
    public char nextGreatestLetter(char[] l, char target) {
        for(int i =0; i<l.length; i++){
            if(l[i]>target){
                return l[i];
            }
        }
        return l[0];
        
    }
}