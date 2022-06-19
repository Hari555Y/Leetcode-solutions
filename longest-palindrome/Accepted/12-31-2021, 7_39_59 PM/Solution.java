// https://leetcode.com/problems/longest-palindrome

class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int[] smal = new int[26];
        int[] big = new int[26];
        for(char c : s.toCharArray()){
            if (c>='a' && c<='z'){
                smal[c-'a']++;
            }
            if (c>='A' && c<='Z'){
                big[c-'A']++;
            }
        }
        int count =0;
        for(int i =0 ; i<26; i++){
          //  if(smal[i]%2==0){
                count+=(smal[i]/2)*2;
          //  }
          //  if(big[i]%2==0){
                count+=(big[i]/2)*2;
          //  }
        }
        return (count==n) ? count : count+1;
        
    }
}