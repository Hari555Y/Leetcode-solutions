// https://leetcode.com/problems/valid-palindrome-ii

class Solution {
    public boolean validPalindrome(String s) {
        if (s==null || s.length()==0 || s.length()==1 || s.length() ==2){
            return true;
        }
        else{
            int apt = 0;
            int bpt = s.length()-1;
            while(apt<=bpt){
                if (s.charAt(apt)!=s.charAt(bpt)){
                    return ispalindrome(s.substring(0,apt)+s.substring(apt+1,s.length()))||ispalindrome(s.substring(0,bpt)+s.substring(apt+1,s.length()));
                }
                apt++;
                bpt--;
                
            }
            return true;
        }
        
        
    }
    public boolean ispalindrome(String s){
        if (s==null || s.length() ==1 || s.length()==0){
            return true;
        }
        else{
            int apointer =0;
            int bpointer =s.length()-1;
            while(apointer<=bpointer){
                if (s.charAt(apointer)!=s.charAt(bpointer)){
                    return false;
                }
                apointer++;
                bpointer--;
                
            }
            return true;
            
        }
    }
}