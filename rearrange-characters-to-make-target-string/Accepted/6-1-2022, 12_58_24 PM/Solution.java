// https://leetcode.com/problems/rearrange-characters-to-make-target-string

class Solution {
    public int rearrangeCharacters(String s, String t) {
        int[] s1 = new int[26];
        int[] t1 = new int[26];
        for(char c  : s.toCharArray()){
            s1[c-'a']++;
        }
         for(char c  : t.toCharArray()){
            t1[c-'a']++;
        }
        int ans = Integer.MAX_VALUE;
        for(int i =0 ; i<26; i++){
            if(t1[i] !=0){
                ans = Math.min(ans , s1[i]/t1[i]);
            }
        }
        return ans;
        
       
        
        
    }
}