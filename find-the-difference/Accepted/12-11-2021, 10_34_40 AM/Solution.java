// https://leetcode.com/problems/find-the-difference

class Solution {
    public char findTheDifference(String s, String t) {
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        for (int i : s.toCharArray()){
            a1[i-'a']++;
        }
        for (int j : t.toCharArray()){
            a2[j-'a']++;
        }
        for (int u =0; u<26; u++){
            if (a2[u]>a1[u]){
                return (char)('a' + u);
                
            }
        }
        return 'a';
    }
}