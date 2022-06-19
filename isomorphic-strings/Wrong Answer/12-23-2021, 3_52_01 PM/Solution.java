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
        return true;
        
    }
}