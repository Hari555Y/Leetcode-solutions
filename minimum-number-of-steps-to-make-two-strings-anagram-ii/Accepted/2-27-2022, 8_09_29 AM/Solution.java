// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram-ii

class Solution {
    public int minSteps(String s, String t) {
        int[] a = new int[26];
        int[] b= new int[26];
        for(char p : s.toCharArray()){
            a[p-'a']++;
        }
        for(char d : t.toCharArray()){
            b[d-'a']++;
        }
        int c =0;
        for(int i =0; i<26; i++){
            c += Math.abs(a[i]-b[i]);
            
        }
        return c;
        
    }
}