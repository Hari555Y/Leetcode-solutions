// https://leetcode.com/problems/valid-palindrome

class Solution {
    public boolean isPalindrome(String s) {
        s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        if (s==null|| s.length()==1){
            return true;
        }
        else if (s.charAt(0)!=s.charAt(s.length()-1)){
            return false;
            
        }
        else{
            s = s.substring(1,s.length()-1);
            isPalindrome(s); 
        } 
        return true;
        
        
    }
}