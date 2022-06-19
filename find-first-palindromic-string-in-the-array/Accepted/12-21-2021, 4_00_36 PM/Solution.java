// https://leetcode.com/problems/find-first-palindromic-string-in-the-array

class Solution {
    public String firstPalindrome(String[] words) {
        for(String s: words){
            if(ispal(s)){
                return s;
            }
        }
        return "";
        
    }
    public static boolean ispal(String p){
        int s =0;
        int e = p.length()-1;
        while(s<e){
            if(p.charAt(s)==p.charAt(e)){
                s++;
                e--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}