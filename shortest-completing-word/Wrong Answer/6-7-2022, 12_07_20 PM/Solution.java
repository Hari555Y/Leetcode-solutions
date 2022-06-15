// https://leetcode.com/problems/shortest-completing-word

class Solution {
    public String shortestCompletingWord(String lp, String[] w) {
        int[] ar1 = new int[26];
        int[] ar2 = new int[26];
        for(char c :lp.toCharArray()){
            if (c>='a' && c<='z'){
                ar1[c-'a']++;
                
            }
            if (c>='A' && c<='Z'){
                ar1[Character.toLowerCase(c) -'a']++;
            } 
        }
        String max  = "";
        int max_len = 1000000007;
        for(String s : w){
            for(char  c:  s.toCharArray()){
                ar2[c-'a']++;
            }
            if (isc(ar1 , ar2)){
                if (ar2.length <max_len){
                    max_len = ar2.length;
                    max = s;
                }
            }
        }
        return max;
        
    }
    public static boolean isc(int[] as, int[] bs){
        for(int i =0; i<26; i++){
            if (as[i] > bs[i]){
                return false;
            }
        }
        return true;
    } 
}