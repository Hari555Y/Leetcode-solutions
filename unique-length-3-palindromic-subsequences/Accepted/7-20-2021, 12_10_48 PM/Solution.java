// https://leetcode.com/problems/unique-length-3-palindromic-subsequences

class Solution {
    public int countPalindromicSubsequence(String s) {
        if(s.length() <3){
            return 0;
        }
        HashSet<String> hash = new HashSet<>();
        for (char c ='a'; c<='z'; c++){
            int i1 = s.indexOf(c);
            int i2 = s.lastIndexOf(c);
            if(i1!=-1 && i2!=-1 && i2-i1>1){
                for (int k =i1+1; k<i2; k++){
                    hash.add(String.valueOf(s.charAt(i1))+ String.valueOf(s.charAt(k))+String.valueOf(s.charAt(i2)));
                }
            }
            
        }

        return hash.size();
        
    }
}