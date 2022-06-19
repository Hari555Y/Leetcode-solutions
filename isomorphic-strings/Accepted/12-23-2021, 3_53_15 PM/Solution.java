// https://leetcode.com/problems/isomorphic-strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> hash = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(hash.containsKey(s.charAt(i)) && hash.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
            else{
                hash.put(s.charAt(i), t.charAt(i));
            }
        }
        HashMap<Character,Character> hash1 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(hash1.containsKey(t.charAt(i)) && hash1.get(t.charAt(i))!=s.charAt(i)){
                return false;
            }
            else{
                hash1.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
        
    }
}