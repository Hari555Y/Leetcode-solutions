// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters

class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] ap = new int[26];
        for(char c : chars.toCharArray()){
            ap[c-'a']++;
        }
        int count =0;
        for(String a : words){
            int[] rs = new int[26];
            for(char p : a.toCharArray()){
                rs[p-'a']++;
            }
            boolean bool = false;
            for(int i =0; i<26;i ++){
                if (rs[i]>ap[i]){
                    bool= true;
                        break;
                }
            }
            if (!bool){
                count += a.length();
            }
            
        }
        return count;
        
    }
}