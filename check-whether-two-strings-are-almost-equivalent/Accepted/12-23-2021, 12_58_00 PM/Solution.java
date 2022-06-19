// https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] a = new int[26];
        int[] b = new int[26];
        for(char c : word1.toCharArray()){
            a[c-'a']++;
        }
        for(char c : word2.toCharArray()){
            b[c-'a']++;
        }
        for(int i =0; i<26; i++){
            if(a[i]-b[i]> 3 || a[i]-b[i]<-3){
                return false;
            }
        }
        return true;
        
    }
}