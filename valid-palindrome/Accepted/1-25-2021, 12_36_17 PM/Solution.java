// https://leetcode.com/problems/valid-palindrome

class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        if (s==null|| s.length()==1 || s.length() ==0){
            return true;
        }
        int apoint = 0;
        int bpoint = s.length()-1;
        while (apoint<=bpoint){
             if (s.charAt(apoint)!=s.charAt(bpoint)){
                return false;
             }
            apoint++;
            bpoint--;     
        } 
        return true;
    }
}