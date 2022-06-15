// https://leetcode.com/problems/remove-palindromic-subsequences

class Solution {
    public int removePalindromeSub(String s) {
        if (s.length() ==1){
            return 1;
        }
        else{
            int start = 0;
            int end = s.length()-1;
            while(start<end){
                if (s.charAt(start) == s.charAt(end)){
                    start++;
                    end--;
                    
                }
                else{
                    break;
                }
            }
            if (start==end || start+1==end ){
                return 1;
            }
            else {
                return 2;
            }
            
        }
        
    }
}